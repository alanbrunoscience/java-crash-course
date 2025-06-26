package structures;

import entities.Product;
import entities.ProductNode;

import java.text.Normalizer;
import java.util.Scanner;

public class ProductCRUD {
	private ProductList[] productLists = new ProductList[27];
	private Scanner input = new Scanner(System.in);

	public ProductCRUD() {
		for (int i = 0; i < 27; i++) {
			productLists[i] = new ProductList();
		}
	}

	private int getIndex(String name) {
		if (name == null || name.isEmpty()) {
			return 26;
		}

		// '\\p{M}': is a regex pattern that stands for "diacritical marks", i.e.: Acute
		// accent, grave accent, tilde, umlaut, circumflex, etc.
		String normalized = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
		char firstLetter = Character.toUpperCase(normalized.charAt(0));

		if (firstLetter >= 'A' && firstLetter <= 'Z') {
			return firstLetter - 'A';
		} else {
			return 26;
		}
	}

	public void registerProduct(String name, double price, int quantity) {
		int index = getIndex(name);
		ProductNode existingNode = productLists[index].searchProductByName(name);

		if (existingNode != null) {
			System.out.println("\n-> Product already exists!");
			updateExistingProduct(existingNode);
		} else {
			try {
				Product newProduct = new Product(name, price, quantity);
				productLists[index].insertProductOrdered(newProduct);
				System.out.println("\n-> Product registered successfully.");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void updateExistingProduct(ProductNode node) {
		boolean keepUpdating = true;

		while (keepUpdating) {
			System.out.println("\nWhat would you like to update?");
			System.out.println("1 - Update quantity");
			System.out.println("2 - Update price");
			System.out.println("3 - Update name");
			System.out.println("4 - Cancel");
			System.out.print("Choose an option: ");
			int choice = input.nextInt();

			while (choice < 1 || choice > 4) {
				System.out.print("\n-> Invalid option! Please choose 1, 2, 3 or 4: ");
				choice = input.nextInt();
			}

			switch (choice) {
			case 1:
				updateQuantity(node);
				break;

			case 2:
				updatePrice(node);
				break;

			case 3:
				updateName(node);
				keepUpdating = false;
				break;

			case 4:
				System.out.println("-> Changes cancelled.");
				keepUpdating = false;
				break;
			}

			if (choice != 3 && choice != 4 && keepUpdating) {
				System.out.print("\nDo you want to make more updates to this product? (1 - Yes / 2 - No): ");
				int continueChoice = input.nextInt();
				if (continueChoice != 1) {
					keepUpdating = false;
				}
			}
		}
	}

	private void updateQuantity(ProductNode node) {
		System.out.println("\n-> Do you want to increment or overwrite the quantity?");
		System.out.println("1 - Increment");
		System.out.println("2 - Overwrite");
		System.out.print("Choose an option: ");
		int quantityChoice = input.nextInt();

		while (quantityChoice != 1 && quantityChoice != 2) {
			System.out.print("\n-> Invalid option! Please choose 1 or 2: ");
			quantityChoice = input.nextInt();
		}

		try {
			if (quantityChoice == 1) {
				System.out.print("Enter quantity to increment: ");
				int increment = input.nextInt();
				int newQuantity = node.getProduct().getQuantity() + increment;
				node.getProduct().setQuantity(newQuantity);
				System.out.println("-> Quantity incremented successfully.");
			} else {
				System.out.print("Enter new quantity: ");
				int newQuantity = input.nextInt();
				node.getProduct().setQuantity(newQuantity);
				System.out.println("-> Quantity overwritten successfully.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void updatePrice(ProductNode node) {
		System.out.print("Enter new price: ");
		double newPrice = input.nextDouble();
		try {
			node.getProduct().setPrice(newPrice);
			System.out.println("-> Price updated successfully.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void updateName(ProductNode node) {
		input.nextLine();
		System.out.print("Enter the new product name: ");
		String newName = input.nextLine();

		try {
			String currentName = node.getProduct().getName();
			node.getProduct().setName(newName);
			renameProduct(currentName, newName);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public void renameProduct(String currentName, String newName) {
		int oldIndex = getIndex(currentName);
		int newIndex = getIndex(newName);

		ProductNode existingNode = productLists[newIndex].searchProductByName(newName);
		ProductNode currentNode = productLists[oldIndex].searchProductByName(currentName);

		if (currentNode == null) {
			System.out.println("\n-> Current product not found.");
			return;
		}

		if (existingNode == null) {
			boolean removed = productLists[oldIndex].deleteProduct(currentName, currentNode.getProduct().getQuantity());
			if (removed) {
				currentNode.getProduct().setName(newName);
				productLists[newIndex].insertProductOrdered(currentNode.getProduct());
				System.out.println("-> Product name updated successfully.");
			}
		} else {
			Product existingProduct = existingNode.getProduct();

			System.out.println("\n-> A product with this new name already exists.");
			System.out.printf("Existing Product: %s | Price: %.2f | Quantity: %d | Total in stock: %.2f%n",
					existingProduct.getName(), existingProduct.getPrice(), existingProduct.getQuantity(),
					existingProduct.totalValueInStock());

			System.out.println("\n-> Do you want to overwrite this product? (1 - Yes / 2 - No)");
			int choice = input.nextInt();

			while (choice != 1 && choice != 2) {
				System.out.print("\n-> Invalid option! Please choose 1 or 2: ");
				choice = input.nextInt();
			}

			if (choice == 1) {
				existingProduct.setPrice(currentNode.getProduct().getPrice());
				existingProduct.setQuantity(currentNode.getProduct().getQuantity());

				boolean removed = productLists[oldIndex].deleteProduct(currentName,
						currentNode.getProduct().getQuantity());
				if (removed) {
					System.out.println("-> Existing product overwritten successfully.");
				}
			} else {
				System.out.println("-> Operation cancelled.");
			}
		}
	}

	public void searchProductByName(String name) {
		int index = getIndex(name);
		ProductNode found = productLists[index].searchProductByName(name);

		if (found != null) {
			Product p = found.getProduct();
			System.out.printf("Product found: %s | Price: %.2f | Quantity: %d | Total in stock: %.2f%n", p.getName(),
					p.getPrice(), p.getQuantity(), p.totalValueInStock());
		} else {
			System.out.println("Product not found.");
		}
	}

	public void listAllProducts() {
		for (int i = 0; i < 27; i++) {
			if (!productLists[i].isEmpty()) {
				char letter = (i == 26) ? '#' : (char) ('A' + i);
				System.out.println("\nProducts starting with '" + letter + "':");
				productLists[i].listProducts();
			}
		}
	}

	public void deleteProduct(String name, int quantity) {
		int index = getIndex(name);
		boolean result = productLists[index].deleteProduct(name, quantity);

		if (!result) {
			System.out.println("-> Failed to delete the product.");
		}
	}

	public void totalValueInStock() {
		double total = 0.0;

		for (int i = 0; i < 27; i++) {
			total += productLists[i].totalValueOfList();
		}

		System.out.printf("\n-> Total value of all products in stock: %.2f\n", total);
	}
}
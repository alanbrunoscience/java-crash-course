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
				System.out.println("\n-> Product registered successfully!");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void updateExistingProduct(ProductNode node) {
		boolean keepUpdating = true;

		while (keepUpdating) {
			System.out.println("\nWhat would you like to update?");
			System.out.println("\n1 - Update name;");
			System.out.println("2 - Update price;");
			System.out.println("3 - Update quantity;");
			System.out.println("4 - Cancel.");
			System.out.print("\nChoose an option: ");
			int choice = input.nextInt();

			while (choice < 1 || choice > 4) {
				System.out.print("\n-> Invalid option! Please choose 1, 2, 3 or 4: ");
				choice = input.nextInt();
			}

			switch (choice) {
			case 1:
				updateName(node);
				keepUpdating = false;
				break;

			case 2:
				updatePrice(node);
				break;

			case 3:
				updateQuantity(node);
				break;

			case 4:
				System.out.println("\n-> Changes cancelled!");
				keepUpdating = false;
				break;
			}

			if (choice != 1 && choice != 4 && keepUpdating) {
				System.out.print("\nDo you want to make more updates to this product? (1 - Yes / 2 - No): ");
				int continueChoice = input.nextInt();
				if (continueChoice != 1) {
					keepUpdating = false;
				}
			}
		}
	}

	private void updateName(ProductNode node) {
		input.nextLine();
		System.out.print("\n1)Enter the new product name: ");
		String newName = input.nextLine();

		try {
			renameProduct(node, newName);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public void renameProduct(ProductNode currentNode, String newName) {

		String currentName = currentNode.getProduct().getName();
		int oldIndex = getIndex(currentName);
		int newIndex = getIndex(newName);

		ProductNode existingNode = productLists[newIndex].searchProductByName(newName);

		if (existingNode == null) {
			boolean removed = productLists[oldIndex].deleteProduct(currentName, currentNode.getProduct().getQuantity());
			if (removed) {
				currentNode.getProduct().setName(newName);
				productLists[newIndex].insertProductOrdered(currentNode.getProduct());
				System.out.println("\n-> Product name updated successfully!");
			}
		} else {
			Product existingProduct = existingNode.getProduct();

			System.out.println("\n-> A product with this new name already exists!");

			System.out.println("\n*** Existing Product: ***");
			System.out.printf("%n- Product: %s;%n", existingProduct.getName());
			System.out.printf("- Price: %.2f;%n", existingProduct.getPrice());
			System.out.printf("- Quantity: %d;%n", existingProduct.getQuantity());
			System.out.printf("- Total value in stock: %.2f.%n", existingProduct.totalValueInStock());

			System.out.println("\n-> Do you want to overwrite this product? (1 - Yes / 2 - No)");
			int choice = input.nextInt();

			while (choice != 1 && choice != 2) {
				System.out.print("\n-> Invalid option! Please choose 1 or 2: ");
				choice = input.nextInt();
			}

			if (choice == 1) {
				System.out.print("\n-> Enter the new price: ");
				double newPrice = input.nextDouble();

				while (newPrice <= 0) {
					System.out.print("\n-> Invalid price! Please enter a price greater than 0: ");
					newPrice = input.nextDouble();
				}

				System.out.print("\n-> Enter the new quantity: ");
				int newQuantity = input.nextInt();

				while (newQuantity < 0) {
					System.out.print("\n-> Invalid quantity! Please enter a quantity greater than or equal to 0: ");
					newQuantity = input.nextInt();
				}

				existingProduct.setPrice(newPrice);
				existingProduct.setQuantity(newQuantity);

				boolean removed = productLists[oldIndex].deleteProduct(currentName,
						currentNode.getProduct().getQuantity());
				if (removed) {
					System.out.println("\n-> Existing product overwritten successfully!");
				}
			} else {
				System.out.println("\n-> Operation cancelled!");
			}
		}
	}

	/**
	 * This method prints product info if found.
	 */
	public void searchProductByName(String name) {
		int index = getIndex(name);
		ProductNode found = productLists[index].searchProductByName(name);

		if (found != null) {
			Product p = found.getProduct();
			System.out.println("\n*** Product Found ***");
			System.out.printf("%n- Product: %s;%n", p.getName());
			System.out.printf("- Price: %.2f;%n", p.getPrice());
			System.out.printf("- Quantity: %d;%n", p.getQuantity());
			System.out.printf("- Total value in stock: %.2f.%n", p.totalValueInStock());
		} else {
			System.out.println("\n-> Product not found!");
		}
	}

//	public ProductNode findProductNodeByName(String name) {
//		int index = getIndex(name);
//		return productLists[index].searchProductByName(name);
//	}

	private void updateQuantity(ProductNode node) {
		System.out.println("\n-> Do you want to increment or overwrite the quantity?");
		System.out.println("\n1 - Increment;");
		System.out.println("2 - Overwrite.");
		System.out.print("\nChoose an option: ");
		int quantityChoice = input.nextInt();

		while (quantityChoice != 1 && quantityChoice != 2) {
			System.out.print("\n-> Invalid option! Please choose 1 or 2: ");
			quantityChoice = input.nextInt();
		}

		try {
			if (quantityChoice == 1) {
				System.out.print("\nEnter quantity to increment: ");
				int increment = input.nextInt();
				int newQuantity = node.getProduct().getQuantity() + increment;
				node.getProduct().setQuantity(newQuantity);
				System.out.println("\n-> Quantity incremented successfully!");
			} else {
				System.out.print("\nEnter new quantity: ");
				int newQuantity = input.nextInt();
				node.getProduct().setQuantity(newQuantity);
				System.out.println("\n-> Quantity overwritten successfully!");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void updatePrice(ProductNode node) {
		System.out.print("\nEnter new price: ");
		double newPrice = input.nextDouble();
		try {
			node.getProduct().setPrice(newPrice);
			System.out.println("\n-> Price updated successfully!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public void listAllProducts() {
		for (int i = 0; i < 27; i++) {
			if (!productLists[i].isEmpty()) {
				char letter = (i == 26) ? '#' : (char) ('A' + i);
				System.out.println("\nProducts starting with '" + letter + "':\n");
				productLists[i].listProducts();

				double totalValue = productLists[i].totalValueOfList();
				System.out.printf("\n-> Total value of products starting with '%c': %.2f.%n", letter, totalValue);
			}
			System.out.println("\n================================================");
		}

		// Prints the total at the end of the listing
		totalValueInStock();
	}

	/**
	 * Lists products starting with a specific letter or '#'. Keeps the same
	 * structure and comments style of the rest of the class.
	 */
	public void listProductsByLetter(char letter) {

		// '\\p{M}': is a regex pattern that stands for "diacritical marks", i.e.: Acute
		// accent, grave accent, tilde, umlaut, circumflex, etc.
		String normalizedLetter = Normalizer.normalize(String.valueOf(letter), Normalizer.Form.NFD)
				.replaceAll("\\p{M}", "").toUpperCase();

		// Validate input: must be a letter (A-Z) or '#'
		if (!normalizedLetter.matches("[A-Z#]")) {
			System.out.println("\n-> Invalid letter! Please enter a letter between A-Z or '#'.");
			return;
		}

		char finalLetter = normalizedLetter.charAt(0);
		int index = (finalLetter >= 'A' && finalLetter <= 'Z') ? finalLetter - 'A' : 26;

		if (!productLists[index].isEmpty()) {
			System.out.println("\nProducts starting with '" + finalLetter + "':\n");
			productLists[index].listProducts();

			double totalValue = productLists[index].totalValueOfList();
			System.out.printf("\n-> Total value of products starting with '%c': %.2f.%n", finalLetter, totalValue);
		} else {
			System.out.println("\n-> No products registered with this initial letter.");
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

		System.out.println("\n================================================");
		System.out.printf("\n-> Total value of all products in stock: %.2f\n", total);
	}
}

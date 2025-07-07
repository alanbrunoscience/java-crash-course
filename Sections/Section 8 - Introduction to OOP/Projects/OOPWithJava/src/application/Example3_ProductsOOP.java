package application;

import java.util.Locale;
import java.util.Scanner;
import java.text.Normalizer;
import structures.ProductCRUD;

public class Example3_ProductsOOP {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		ProductCRUD productCRUD = new ProductCRUD();
		
		int option;

		do {
			System.out.println("\n\n*** Java Product Manager ***");
			System.out.println("\nChoose an option below:");
			System.out.println("\n1 - Register a product;");
			System.out.println("2 - Update an existing product;");
			System.out.println("3 - Search for a product by name;");
			System.out.println("4 - List all products;");
			System.out.println("5 - List products by a letter (A-Z or '#');");
			System.out.println("6 - Delete a product;");
			System.out.println("7 - Total value in stock;");
			System.out.println("8 - Exit program.");
			System.out.print("\n-> ");

			while (!input.hasNextInt()) {
				System.out.print("-> Invalid input! Enter a number between 1 and 8: ");
				input.next();
			}
			option = input.nextInt();
			input.nextLine();
			
			while (option < 1 || option > 8) {
				System.out.print("-> Invalid option! Choose between 1 and 8: ");
				option = input.nextInt();
				input.nextLine();
			}

			switch (option) {
				case 1:
					System.out.print("\n1) Enter the product name: ");
					String name = input.nextLine();
	
					System.out.print("2) Enter the product price: ");
					while (!input.hasNextDouble()) {
						System.out.print("-> Invalid price! Enter a valid number: ");
						input.next();
					}
					double price = input.nextDouble();
	
					System.out.print("3) Enter the product quantity: ");
					while (!input.hasNextInt()) {
						System.out.print("-> Invalid quantity! Enter a valid integer: ");
						input.next();
					}
					int quantity = input.nextInt();
					input.nextLine();
	
					productCRUD.registerProduct(name, price, quantity);
					break;
	
				case 2:
//					System.out.print("\nEnter the name of the product to update: ");
//					String nameToUpdate = input.nextLine();
//					ProductCRUD.ProductNode nodeToUpdate = productCRUD.searchProductByName(nameToUpdate);
//					if (nodeToUpdate != null) {
//						productCRUD.updateExistingProduct(nodeToUpdate);
//					} else {
//						System.out.println("-> Product not found.");
//					}
//					break;
	
				case 3:
					System.out.print("\nEnter the product name to search: ");
					String nameToSearch = input.nextLine();
					productCRUD.searchProductByName(nameToSearch);
					break;
	
				case 4:
					productCRUD.listAllProducts();
					break;
	
				case 5:
					System.out.print("\nEnter the letter to list products (A-Z or '#'): ");
					String letterInput = input.nextLine();
	
					while (letterInput.isEmpty()) {
						System.out.print("-> Please enter a valid character: ");
						letterInput = input.nextLine();
					}
	
					String normalizedLetter = Normalizer.normalize(letterInput, Normalizer.Form.NFD)
							.replaceAll("\\p{M}", "").toUpperCase();
	
					char letter = normalizedLetter.charAt(0);
					productCRUD.listProductsByLetter(letter);
					break;
	
				case 6:
					System.out.print("\nEnter the product name to delete: ");
					String nameToDelete = input.nextLine();
	
					System.out.print("Enter the quantity to delete: ");
					while (!input.hasNextInt()) {
						System.out.print("-> Invalid quantity! Enter a valid integer: ");
						input.next();
					}
					int quantityToDelete = input.nextInt();
					input.nextLine();
	
					productCRUD.deleteProduct(nameToDelete, quantityToDelete);
					break;
	
				case 7:
					productCRUD.totalValueInStock();
					break;
	
				case 8:
					System.out.println("\nExiting program. Goodbye!");
					break;
				}

		} while (option != 8);

		input.close();
	}
}

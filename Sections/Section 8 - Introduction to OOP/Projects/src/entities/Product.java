package entities;

import utils.TextUtils;

public class Product {

	private String name;
	private double price;
	private int quantity;

	// Personalized methods
	public void displayProdInfo() {
		System.out.println("*** Product Information ***\n");
		System.out.printf("- Product: %s;%n", this.getName());
		System.out.printf("- Price: %.2f;%n", this.getPrice());
		System.out.printf("- Quantity: %d;%n", this.getQuantity());
		System.out.printf("- Total: %.2f.%n", this.totalValueInStock());
	}

	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int quantity) {
		if (quantity <= 0) {
			System.out.println("\n-> Invalid addition quantity! It must be greater than 0.");
			return;
		}
		this.setQuantity(getQuantity() + quantity);
	}

	public void removeProducts(int quantity) {
		if (quantity <= 0) {
			System.out.println("\n-> Invalid removal quantity! It must be greater than 0.");
			return;
		}

		if (this.getQuantity() < quantity) {
			System.out.printf(
					"%n-> There are (is) %d total product(s) in stock. So, it's impossible to remove %d unit(s).%n",
					this.getQuantity(), quantity);
		} else {
			this.setQuantity(getQuantity() - quantity);
		}
	}

	// Special methods
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("\n-> Invalid name! The name mustn't be empty or blank.");
		}

		this.name = TextUtils.toTitleCase(name);
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if (price <= 0) {
			throw new IllegalArgumentException("\n-> Invalid price! The price must be greater than 0.");
		}
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException(
					"\n-> Invalid quantity! The quantity must be greater than or equal to 0.");
		}
		this.quantity = quantity;
	}
}

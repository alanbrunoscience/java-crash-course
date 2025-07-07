package entities;

import utils.TextUtils;

public class Product {

	private String name;
	private double price;
	private int quantity;

	// Personalized methods
	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	// Constructor
	public Product(String name, double price, int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	// Setters
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("\n-> Invalid name! The name mustn't be empty or blank.");
		}

		this.name = TextUtils.toTitleCase(name);
	}

	public void setPrice(double price) {
		if (price <= 0) {
			throw new IllegalArgumentException("\n-> Invalid price! The price must be greater than 0.");
		}
		this.price = price;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException(
					"\n-> Invalid quantity! The quantity must be greater than or equal to 0.");
		}
		this.quantity = quantity;
	}
}

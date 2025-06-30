package structures;

import entities.Product;
import entities.ProductNode;

public class ProductList {

	private ProductNode head;

	public void insertProductOrdered(Product product) {

		ProductNode newNode = new ProductNode(product);

		// myStr1.compareToIgnoreCase(myStr2) < 0: if the string (myStr1) is
		// lexicographically less than the other string (myStr2)
		if (head == null || product.getName().compareToIgnoreCase(head.getProduct().getName()) < 0) {
			newNode.next = head;
			head = newNode;
			return;
		}

		ProductNode current = head;

		// myStr1.compareToIgnoreCase(myStr2) > 0: if the string (myStr1) is
		// lexicographically greater than the other string (myStr2) (more characters)
		while (current.next != null && product.getName().compareToIgnoreCase(current.next.getProduct().getName()) > 0) {
			current = current.next;
		}

		newNode.next = current.next;
		current.next = newNode;

	}

	public ProductNode searchProductByName(String name) {

		ProductNode current = head;

		while (current != null && name.compareToIgnoreCase(current.getProduct().getName()) >= 0) {
			if (current.getProduct().getName().equalsIgnoreCase(name)) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	public void listProducts() {

		ProductNode current = head;

		while (current != null) {

			Product p = current.getProduct();

			System.out.printf("%n- Product: %s;%n", p.getName());
			System.out.printf("- Price: %.2f;%n", p.getPrice());
			System.out.printf("- Quantity: %d;%n", p.getQuantity());
			System.out.printf("- Total value in stock: %.2f.%n", p.totalValueInStock());

			current = current.next;

		}
	}

	public boolean deleteProduct(String name, int quantity) {

		if (head == null) return false;

		// Removing the product from the beginning of the list
		if (head.getProduct().getName().equalsIgnoreCase(name)) {
			if (head.getProduct().getQuantity() == quantity) {
				head = head.next;
				System.out.println("\n-> Product completely removed from stock.");
				return true;
			} else if (head.getProduct().getQuantity() > quantity) {
				int newQuantity = head.getProduct().getQuantity() - quantity;
				head.getProduct().setQuantity(newQuantity);
				System.out.println("\n-> Product quantity updated to " + newQuantity + ".");
				return true;
			} else {
				System.out.println("\n-> Error: The quantity to be removed is greater than the available stock.");
				return false;
			}
		}

		// Removing the product from the middle of the list
		ProductNode current = head;

		while (current.next != null && !current.next.getProduct().getName().equalsIgnoreCase(name)) {
			current = current.next;
		}

		if (current.next != null) {
			ProductNode nodeToRemove = current.next;

			if (nodeToRemove.getProduct().getQuantity() == quantity) {
				current.next = nodeToRemove.next;
				System.out.println("\n-> Product completely removed from stock.");
				return true;
			} else if (nodeToRemove.getProduct().getQuantity() > quantity) {
				int newQuantity = nodeToRemove.getProduct().getQuantity() - quantity;
				nodeToRemove.getProduct().setQuantity(newQuantity);
				System.out.println("\n-> Product quantity updated to " + newQuantity + ".");
				return true;
			} else {
				System.out.println("\n-> Error: The quantity to be removed is greater than the available stock.");
				return false;
			}

		}

		System.out.println("\n-> Product not found.");
		return false;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public double totalValueOfList() {
		double total = 0.0;
		ProductNode current = head;
		
		while (current != null) {
			total += current.getProduct().totalValueInStock();
			current = current.next;
		}
		
		return total;
	}

}

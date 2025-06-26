package entities;

public class ProductNode {

	private Product product;
	public ProductNode next;

	public ProductNode(Product product) {
		this.product = product;
		this.next = null;
	}

	// Getter and Setter to Product
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}

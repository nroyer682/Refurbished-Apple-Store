package model;

/*
 * Template of a unit of storage in the apple refurbished shop.
 * Think of a shop as a collection of entries.
 */
public class Entry {
	private String serialNumber; // e.g., F9FDN4NKQ1GC (unique)
	private Product product; 
	
	public Entry(String serialNumber, Product product) {
		this.serialNumber = serialNumber;
		this.product = product;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	/*
	 * An overloaded version of the setProduct mutator.
	 * This version of setProduct does not expect the user to create a Product object and pas it as an argument.
	 * Instead, we would expect the user to pass a String model and a value of the original price.
	 * (internally inside the method, it's expected that a local, new Product object is created accordingly)
	 */
	public void setProduct(String model, double originalPrice) {
		Product p = new Product(model, originalPrice);
		this.product = p;
	}
	
	public String toString() {
		return "[" + this.serialNumber + "]" + " " + this.product.toString();
	}
}

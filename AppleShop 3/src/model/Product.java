package model;

/*
 * Template for individual apple product in the refurbished store.
 */
public class Product {

	private String model; // e.g., iPad Pro 12.9
	private String finish; // e.g., Silver, Space Grey
	private int storage; // in the unit of GB, e.g., 256, 512, 1000 (1TB)
	private boolean hasCellularConnectivity; // e.g., false (only wifi), true (wifi + cellular)
	private double originalPrice; // e.g., 1789.00
	private double discountValue; //e.g., 200.00

	public Product() {
		// do nothing: all attributes will be stored their default values after an object is created.
	}
	
	// An overloaded version of the constructor.
	public Product(String model, double originalPrice) {
		this.model = model;
		this.originalPrice = originalPrice;
	}
	
	/* accessors */
	public String getModel() {
		return this.model;
	}
	
	public String getFinish() {
		return finish;
	}
	
	public int getStorage() {
		return storage;
	}
	
	public boolean hasCellularConnectivity() {
		return hasCellularConnectivity;
	}
	
	public double getOriginalPrice() {
		return originalPrice;
	}
	
	public double getDiscountValue() {
		return discountValue;
	}
	
	public double getPrice() {
		// local variable declarations
		double price = 0.0;
		
		// computation
		price = this.originalPrice - this.discountValue;
		
		// return
		return price;
	}
	
	public String toString() {
		String s = "";
		
		s += model + " " + finish + " " + storage + "GB " 
				+ "(cellular connectivity: " + hasCellularConnectivity + "): $(" 
					+ String.format("%.2f", originalPrice) + " - " + String.format("%.2f", discountValue) + ")";
		
		return s;
	}
	
	/* mutators */
	public void setModel(String model) {
		this.model = model;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public void setHasCellularConnectivity(boolean hasCellularConnectivity) {
		this.hasCellularConnectivity = hasCellularConnectivity;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}

}

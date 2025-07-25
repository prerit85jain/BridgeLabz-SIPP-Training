package shoppingCart;

class Item implements PricedItem {
	
	private String name;
	private int quantity;
	private double price;
	
	public Item(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public double getPrice() { return price; }
	public int getQuantity() { return quantity; }
	
	public void setPrice(double price) { this.price = price; }
	
	public String toString() {
		return "Item: " + name + "(Qyt: "+ quantity + " ,Price: "+ price +")";
	}
}

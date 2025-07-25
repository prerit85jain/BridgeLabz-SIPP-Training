package shoppingCart;

class Book implements PricedItem {
	private String title;
	private int quantity;
	private double price;
	
	public Book(String title, int quantity, double price) {
		this.title = title;
		this.quantity = quantity;
		this.price = price;
	}
	
	public double getPrice() { return price; }
	public int getQuantity() { return quantity; }
	
	public String toString() {
		return "Book: " + title + "(Qyt: "+ quantity + " ,Price: "+ price +")";
	}
}

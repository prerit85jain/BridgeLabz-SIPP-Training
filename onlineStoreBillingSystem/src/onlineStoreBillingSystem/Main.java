package onlineStoreBillingSystem;

public class Main{
    public static void main(String[] args) {
        // Create product instances
        Product electronicItem = new Electronics("Laptop", 1000);
        Product clothingItem = new Clothing("Jeans", 50);
        Product groceryItem = new Grocery("Rice", 20);

        displayProductInfo(electronicItem);
        displayProductInfo(clothingItem);
        displayProductInfo(groceryItem);
    }

    public static void displayProductInfo(Product product) {
        System.out.println("Product: " + product.getName());
        System.out.println("Original Price: $" + product.getPrice());
        System.out.println("Discount: $" + product.calculateDiscount());
        System.out.println("Final Price: $" + product.getFinalPrice());
        System.out.println("---------------------------");
    }
}
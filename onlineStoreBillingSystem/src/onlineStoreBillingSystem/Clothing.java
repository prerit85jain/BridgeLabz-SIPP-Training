package onlineStoreBillingSystem;

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }
}
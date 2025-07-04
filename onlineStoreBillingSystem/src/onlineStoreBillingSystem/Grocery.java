package onlineStoreBillingSystem;

class Grocery extends Product {
    public Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
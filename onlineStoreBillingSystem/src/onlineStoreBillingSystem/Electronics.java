package onlineStoreBillingSystem;

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }
}
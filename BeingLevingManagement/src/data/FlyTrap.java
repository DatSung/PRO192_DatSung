package data;

public class FlyTrap extends Plant implements Food, PriceTable {
    private int price;
    public FlyTrap(){

    }
    public FlyTrap(int price) {
        this.price = price;
    }

    public FlyTrap(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void eatFly() {
        System.out.println("Mo nap");
        System.out.println("Fly bay vao");
        System.out.println("Day nap lai");
    }
    @Override
    public void updatePrice() {
        price = price * 10;
    }
}

package data;

public class Komodo extends Animal implements Food, PriceTable{
    private int price;

    public Komodo() {
    }
    public Komodo(int price) {
        this.price = price;
    }

    public Komodo(String name, int price) {
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

    }

    @Override
    public void updatePrice() {

    }
}

package data;

public class Orchid extends Plant implements PriceTable {
    private int price;

    public Orchid() {
        super();
        price = 1000;
    }
    public Orchid(String name, int price) {
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
    public void updatePrice() {
        price = price * 2;
    }
}

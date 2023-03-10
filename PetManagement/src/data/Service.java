package data;

import java.util.Comparator;

public class Service implements Comparable<Service> {
    private int id;
    private String name;
    private int price;
    public Service(){

    }

    public Service(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Service o) {
        if(id > o.getId()) return 1;
        else if(id < o.getId()) return -1;
        return 0;
    }
}
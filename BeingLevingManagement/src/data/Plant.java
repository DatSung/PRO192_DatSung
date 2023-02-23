package data;

public class Plant extends BeingLiving {
    public Plant() {
        super();
    }
    public Plant(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println("By light");
    }

}

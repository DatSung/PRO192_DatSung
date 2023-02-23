package data;

public class Animal extends BeingLiving{
    public Animal() {
        super();
    }

    public Animal(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println("By food");
    }
    public void run() {
        System.out.println("Chay bang hai chan");
    }

}

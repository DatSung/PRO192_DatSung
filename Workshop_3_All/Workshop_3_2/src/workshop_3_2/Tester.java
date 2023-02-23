package workshop_3_2;

public class Tester {
    public static void main(String[] args) {
        Guitar obj1 = new Guitar("", 0, "", "", "", "");
        Guitar obj2 = new Guitar("G123", 2000, "Sony", "Model123", "hardWood", "softWood");
        System.out.println("Input Obj2: ");
        obj2.inputGuitar();
        System.out.println("State of Obj1: ");
        obj1.createSound();
        System.out.println("State of Obj2: ");
        obj2.createSound();

        System.out.printf("Set price = 3000 of Obj1\n");
        obj1.setPrice(3000);
        System.out.println("Get price of Obj1: " + obj1.getPrice());
    }
}

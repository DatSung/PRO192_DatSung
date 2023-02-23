package data;

import java.util.Scanner;

public class SmartPhone {
    private int id;
    private String name;
    OperationSystem os = new OperationSystem();
    PIN pin = new PIN();

    public SmartPhone() {
        os = new OperationSystem();
        pin = new PIN();
    }

    public SmartPhone(int id, String name) {
        this.id = id;
        this.name = name;
        os = new OperationSystem();
        pin = new PIN();
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

//    FUNCTION
    public void inputSmartphone() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your phone name: ");
        name = input.nextLine().trim();
        System.out.println("Enter your phone id: ");
        id = Integer.parseInt(input.nextLine());
        os.inputOs();
        pin.inputPin();

    }

    public void updateOS(){
        Scanner input = new Scanner(System.in);
        os.setOsVersion(input.nextLine());
    }

    public void changePin(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter new Hours: ");
        pin.setHours(Integer.parseInt(input.nextLine()));
        System.out.println("Enter new Brand: ");
        pin.setBrand(input.nextLine());
    }

    public void displaySmartPhone(){
        this.toString();
        os.showOS();
        pin.showPin();
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", os=" + os +
                ", pin=" + pin +
                '}';
    }
}

package data;

import java.util.Scanner;

public class PIN {
    private int hours;
    private String brand;

    public PIN() {
    }

    public PIN(int hours, String brand) {
        this.hours = hours;
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    FUNCTION
    public void inputPin(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hours of Pin: ");
        hours = Integer.parseInt(input.nextLine());
        System.out.println("Enter brand of Pin: ");
        brand = input.nextLine();
    }

    public void showPin(){
        this.toString();
    }

    @Override
    public String toString() {
        return "PIN{" +
                "hours=" + hours +
                ", brand='" + brand + '\'' +
                '}';
    }
}

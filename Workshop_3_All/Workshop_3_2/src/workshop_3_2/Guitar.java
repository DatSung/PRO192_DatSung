/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop_3_2;


import java.util.Scanner;

public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }


    public void inputGuitar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input serial number: ");
        serialNumber = input.nextLine();
        System.out.println("Input price: ");
        price = Integer.parseInt(input.nextLine());
        System.out.println("Input builder");
        builder = input.nextLine();
        System.out.println("Input model: ");
        model = input.nextLine();
        System.out.println("Input backWood");
        backWood = input.nextLine();
        System.out.println("Input topWood");
        topWood = input.nextLine();
    }
    public void createSound() {
        System.out.printf("Serial Number: %s\nPrice: %d\nBuilder: %s\nModel: %s\nBackWood: %s\nTopWood: %s\n", serialNumber, price, builder, model, backWood, topWood);
    }
}
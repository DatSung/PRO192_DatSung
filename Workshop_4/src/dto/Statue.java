//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dto;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
        this.weight = 0;
        this.colour = null;
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void output() {
        System.out.format("|%d|%s|\n", this.weight, this.colour);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight: ");
        this.weight = Integer.parseInt(input.nextLine());
        System.out.println("Input colour: ");
        this.colour = input.nextLine();
    }
}

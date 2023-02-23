//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dto;

import java.util.Scanner;

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
        this.height = 0;
        this.material = null;
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void output() {
        System.out.format("|%d|%s|\n", this.height, this.material);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        this.height = Integer.parseInt(input.nextLine());
        System.out.println("Input material: ");
        this.material = input.nextLine();
    }
}

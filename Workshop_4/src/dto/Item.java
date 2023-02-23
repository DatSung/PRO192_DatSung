//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dto;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;

    public Item() {
        this.value = 0;
        this.creator = null;
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void output() {
        System.out.format("|%d|%s|\n", this.value, this.creator);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        this.value = Integer.parseInt(input.nextLine());
        System.out.println("Input creator: ");
        this.creator = input.nextLine();
    }
}

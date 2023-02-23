//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dto;

import java.util.Scanner;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFrame;

    public Painting() {
        this.height = 0;
        this.width = 0;
        this.isWaterColour = false;
        this.isFrame = false;
    }

    public Painting(int height, int width, boolean isWaterColour, boolean isFrame) {
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFrame = isFrame;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWaterColour() {
        return this.isWaterColour;
    }

    public void setWaterColour(boolean waterColour) {
        this.isWaterColour = waterColour;
    }

    public boolean isFrame() {
        return this.isFrame;
    }

    public void setFrame(boolean frame) {
        this.isFrame = frame;
    }

    public void output() {
        System.out.format("|%d|%d|%s|%s|\n", this.height, this.width, this.isWaterColour, this.isFrame);
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        this.height = Integer.parseInt(input.nextLine());
        System.out.println("Enter width: ");
        this.width = Integer.parseInt(input.nextLine());
        System.out.println("Input isWaterColour: ");
        this.isWaterColour = input.nextBoolean();
        System.out.println("Input isFrame: ");
        this.isFrame = input.nextBoolean();
    }
}

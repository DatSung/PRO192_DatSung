//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package gui;

import dto.*;
import util.Menu;

import java.util.List;
import java.util.Scanner;

public class AntiqueShop {
    public AntiqueShop() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Item item = null;
        int choice;
        ItemList stock = new ItemList();
        do {
            choice = Menu.getChoice();
            switch (choice) {
                case 1:
                    item = new Vase();
                    stock.addItem(item);
                    ((Vase)item).input();
                    break;
                case 2:
                    item = new Statue();
                    stock.addItem(item);
                    ((Vase)item).input();
                    break;
                case 3:
                    item = new Painting();
                    stock.addItem(item);
                    ((Painting)item).input();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase)item).output();
                        } else if (item instanceof Statue) {
                            ((Statue)item).output();
                        } else if (item instanceof Painting) {
                            ((Painting)item).output();
                        }
                    } else {
                        System.out.println("You need to creat an object");
                    }
                case 5: 
                    String findCreator;
                    System.out.println("Enter the creator to find: ");
                    input = new Scanner(System.in);
                    findCreator = input.nextLine();
                    stock.displayListByCreator(findCreator);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
            }
        } while(choice <= 4);

    }
}

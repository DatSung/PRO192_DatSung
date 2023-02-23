package Util;

import data.*;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int choice = 0;
        BeingLiving obj = null;
//      BeingLiving obj = new BeingLiving(); Nhu nay la loi ve class nay con co ham tru tuong chua hoan thien
//      PriceTable tmp = new PriceTable(); Nhu nay la loi
//      PriceTable tmp = new Orchid(); Nhu nay thi ok

        PriceTable tmp = new PriceTable() { // Class nac danh local nam trong mot function hoac mot class khac de xai 1 lan roi vut
            @Override
            public void updatePrice() {
            };
        };

        do {
            System.out.println("1. Create BeingLiving");
            System.out.println("2. Call useWater");
            System.out.println("3. Call grow");
            System.out.println("4. updatePrice");
            System.out.println("5. Call eatFly");
            System.out.println("6. Quit");
            System.out.println("Enter a choice");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("1. Create a orchid");
                    System.out.println("2. Create a flytrap");
                    System.out.println("3. Create a fomodo");
                    System.out.println("4. Enter a choice");
                    int choice_2 = 0;
                    input = new Scanner(System.in);
                    switch (choice_2) {
                        case 1: {
                            obj = new Orchid("Calatina", 100);
                            break;
                        }
                        case 2: {
                            obj = new FlyTrap(100);
                            break;
                        }
                        case 3: {
                            obj = new Komodo(100);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    if (obj != null) obj.useWater();
                    break;
                }
                case 3: {
                    if (obj != null) obj.grow();
                    break;
                }
                case 4: {
                    if (obj != null) {
                        if (obj instanceof PriceTable) {
                            PriceTable pt = (PriceTable) obj;
                            pt.updatePrice();
                        }
                    }
                    break;
                }
                case 5: {
                    if (obj != null) {
                        if (obj instanceof Food) {
                            Food f = (Food) obj;
                            f.eatFly();
                        }
                    }
                    break;
                }
            }
        } while (choice != 6);
    }
}

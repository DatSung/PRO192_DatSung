package util;

import data.OperationSystem;
import data.SmartPhone;

import java.awt.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int choice;
        SmartPhone phone = null;
        Scanner input = new Scanner(System.in);
        String list[] = {"1. Creat smart phone.", "2.Display a smartphone", "3. Update version of OS", "4. Change a new Pin","5. Exit"};
        Menu.ShowMenu(list);

        do {
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1: {
                    phone = new SmartPhone();
                    phone.inputSmartphone();
                    break;
                }
                case 2: {
                    System.out.println("Display SmartPhone: ");
                    System.out.println(phone.toString());
                    break;
                }
                case 3: {
                    System.out.printf("Enter new version of OS: ");
                    phone.updateOS();
                    break;
                }
                case 4: {
                    System.out.println("Change new Pin: ");
                    phone.changePin();
                    break;
                }
                case 5: {
                    System.out.println("Program Stopped");
                    break;
                }
            }
        } while (choice != 5);
    }
}

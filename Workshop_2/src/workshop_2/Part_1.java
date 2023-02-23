/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop_2;

import java.util.Scanner;

/**
 *
 * @author uinic
 */
public class Part_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        do {
//            try {
//                int number;
//                Scanner input = new Scanner(System.in);
//                System.out.println("Enter the number");
//                number = input.nextInt();
//                if (number < 1) {
//                    throw new Exception();
//                }
//                break;
//            } catch (Exception e) {
//                System.out.println("The number is invalid");
//            }
//        } while (true);

        while (true) {
            try {
                int number;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the number: ");
                number = input.nextInt();
                if (number < 1) {
                    throw new Exception();
                }
                System.out.println("The number is valid");
                break;
            } catch (Exception e) {
                System.out.println("The number is invalid");
            }
        }

    }
}

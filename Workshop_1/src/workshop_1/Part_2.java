package workshop_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) {
        double num1, num2;
        String op;
        Scanner input = new Scanner(System.in);

        System.out.printf("Input the number 1: ");
        num1 = input.nextDouble();
        System.out.printf("Input the number 2: ");
        num2 = input.nextDouble();
        input.nextLine();
        System.out.printf("Input the operator(+-*/): ");
        op = input.nextLine();

        while (true) {
            if (op.equals("+")) {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 + num2));
                break;
            }
            if (op.equals("-")) {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 - num2));
                break;
            }
            if (op.equals("*")) {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 * num2));
                break;
            }
            if (op.equals("/")) {
                System.out.println("The result of " + num1 + op + num2 + "=" + (num1 / num2));
                break;
            }
            System.out.printf("Input the operator(+-*/) again: ");
            op = input.nextLine();
        }
    }
}

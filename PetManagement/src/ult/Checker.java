package ult;

import java.util.Scanner;

public class Checker {

    static  Scanner input = new Scanner(System.in);
    public static int getAnInteger(String inputMsg, String errorMsg) {

        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(input.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
}

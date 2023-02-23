package demothrow;

import java.util.Scanner;

public class MyLib {
    public static int inputNumber(int min, int max) throws Exception {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();

        return num;
    }
}

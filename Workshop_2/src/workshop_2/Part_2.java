package workshop_2;

import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) {
        do {
            try {
                String s = "";
                String patter = "SE";
                Scanner input = new Scanner(System.in);
                s = input.nextLine();
                if (! s.matches(patter + "(.*)")) {
                    throw new Exception();
                }
                System.out.println("The string is: " + s);
                break;
            } catch (Exception e) {
                System.out.println(("The string is invalid"));
            }
        } while (true);
    }
}

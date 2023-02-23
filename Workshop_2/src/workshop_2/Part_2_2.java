package workshop_2;

import java.util.Scanner;

public class Part_2_2 {
    public String inputString() throws Exception {
        String pattern = "SE";
        String s;
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        if (!s.matches(pattern +"\\d{6}") )  {
            throw new Exception();
        }
        return s;
    }
    public static void main(String[] args) {
        Part_2_2 obj = new Part_2_2();
        do {
            try {
                String s = obj.inputString();
                System.out.println("The String is: " + s);
                break;
            } catch (Exception e) {
                System.out.println("The string is invalid");
            }
        } while (true);
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

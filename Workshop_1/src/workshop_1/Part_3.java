package workshop_1;

import java.util.Scanner;

public class Part_3 {
    public static void main(String[] args) {
        String list[] = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("input String: ");
        for(int i = 0; i < list.length; i++){
            System.out.println("Input String " + i +":");
            list[i] = sc.nextLine();
        }
        //in ra các String viết hoa
        System.out.println("Uppercase string: ");
        for(int i = 0; i < list.length; i++){
            System.out.println("String "+ i + ":");
            upperFirstLetter(list[i]);
        }
    }
    public static void upperFirstLetter(String line){
        String firstLetter = line.substring(0,1).toUpperCase();
        String substring = line.substring(1, line.length());
        line = firstLetter + substring;
        System.out.println(line);
    }
}

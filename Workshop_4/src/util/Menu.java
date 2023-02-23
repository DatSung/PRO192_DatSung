//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package util;

import java.util.Scanner;

public class Menu {
    public static String[] options = new String[]{"Create a Vase", "Create a Statue", "Create a Statue", "Display the item", "Find the item"};
    public Menu() {
    }

    public static int getChoice() {
        for(int i = 0; i < options.length; ++i) {
            System.out.println(i + 1 + "/" + String.valueOf(options[i]));
        }

        System.out.println("Choose 1.." + options.length + ": ");
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }
}

package util;

import java.util.Scanner;

public class MenuManagement {
    public static String[] options = new String[]{"Add a vase", "Add a statue", "Add a painting", "Display all", "Display item by creator", "Find the item by value",
            "Update the item", "Remove the item", "Sort item base on Value", "Display sum of value in the stock", "Display sum of value (item's creator are 'VN' in the stock)",
     "Get the list of items that have value between min and max"};
    public MenuManagement() {
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

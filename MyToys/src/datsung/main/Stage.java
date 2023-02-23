package datsung.main;

import datsung.util.MyToys;

public class Stage {
    public static void main(String[] args) {
        System.out.println(MyToys.PI);
        System.out.println("Again: " + MyToys.PI);
        int n = MyToys.getAnInteger("Please enter your option (1..7): ");
        System.out.println("Your option is: " + n);
    }
}

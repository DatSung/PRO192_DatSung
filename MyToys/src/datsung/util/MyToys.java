/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datsung.util;

import javax.xml.bind.annotation.XmlType;
import java.util.Scanner;

/**
 *
 * @author uinic
 */
public class MyToys {
    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    public static final  int MAX_ELEMENT = 9999;
    private static Scanner input = new Scanner(System.in);
    public static int getAnInteger(String inputMsg) {
        int n;

        do {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(input.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Pls input number: ");
            }
        } while (true);
    }
}

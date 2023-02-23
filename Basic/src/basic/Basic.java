/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
import java.util.Scanner;
/**
 *
 * @author uinic
 */

public class Basic{
       public static void main(String[] args) {
        int a[] = {6,3,5,4,9,2};
        Findindex(a);
        DeleteElement(a);
        InsertEle(a);


    }
   public static void Findindex(int arr []){
        int element = 2;
        int index = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]== element){
                index= i;
                break;
            }
        }
        System.out.println("Index: " +index);
            
    }
   public static void DeleteElement(int arr[]) {
       int element = 5;
       int i,c;
       for (c = i = 0; i < arr.length; i++) {
           if (arr[i] != element) {
               arr[c] = arr[i];
               c++;
           }
       }
       System.out.println("array after delete " + element + " is: ");
       for (i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
   }

    public static void InsertEle(int array []){
        Scanner sc = new Scanner(System.in);
           int ele;
           int pos;
           int i;

        System.out.println("\nEnter element insert: \t");
        ele = sc.nextInt();
        System.out.println("Enter position: ");
        pos = sc.nextInt();
        if (pos <= array.length && pos > 0){
            for ( i = array.length-1; i > pos; i--){
                array[i] = array[i-1];
            }
            array[pos] = ele;
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

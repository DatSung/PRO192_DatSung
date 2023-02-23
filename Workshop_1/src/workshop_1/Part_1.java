package workshop_1;
import java.util.*;
public class Part_1 {
    public static void main(String[] args) {
//  Variables
        int rows, cols, sum = 0;
        Scanner input = new Scanner(System.in);
//  Enter rows and cols
        System.out.println("Enter number of rows: ");
        rows = input.nextInt();
        System.out.println("Enter number of cols: ");
        cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
//  Enter the matrix
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Matrix[%d][%d]",i ,j);
                matrix[i][j] = input.nextInt();
            }
        }
// Print the matrix
        System.out.println("Matrix inputted: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println("\n");
        }
//  Sum of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.printf("Sum of the Matrix: %3d\n", sum);
// Avg of the matrix
        System.out.printf("Avg of the Matrix: %4.1f\n", (float)(sum/(rows*cols)));
    }

}

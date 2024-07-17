import java.util.Scanner;
 
public class MatrixOperations {
   // Method to add two matrices
   public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
       int rows = matrix1.length;
       int cols = matrix1[0].length;
       int[][] result = new int[rows][cols];
 
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               result[i][j] = matrix1[i][j] + matrix2[i][j];
           }
       }
 
       return result;
   }
 
   // Method to multiply two matrices
   public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
       int rows1 = matrix1.length;
       int cols1 = matrix1[0].length;
       int cols2 = matrix2[0].length;
       int[][] result = new int[rows1][cols2];
 
       for (int i = 0; i < rows1; i++) {
           for (int j = 0; j < cols2; j++) {
               result[i][j] = 0;
               for (int k = 0; k < cols1; k++) {
                   result[i][j] += matrix1[i][k] * matrix2[k][j];
               }
           }
       }
 
       return result;
   }
 
   // Method to display a matrix
   public static void displayMatrix(int[][] matrix) {
       for (int[] row : matrix) {
           for (int elem : row) {
               System.out.print(elem + " ");
           }
           System.out.println();
       }
   }
 
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
 
       System.out.println("Enter the number of rows and columns for the matrices:");
       int rows = input.nextInt();
       int cols = input.nextInt();
 
       int[][] matrix1 = new int[rows][cols];
       int[][] matrix2 = new int[rows][cols];
 
       System.out.println("Enter elements of matrix 1:");
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               matrix1[i][j] = input.nextInt();
           }
       }
 
       System.out.println("Enter elements of matrix 2:");
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               matrix2[i][j] = input.nextInt();
           }
       }
 
       int[][] sumMatrix = addMatrices(matrix1, matrix2);
       int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
 
       System.out.println("Sum of matrices:");
       displayMatrix(sumMatrix);
 
       System.out.println("Product of matrices:");
       displayMatrix(productMatrix);
 
       input.close();
   }
}
 {
    
}

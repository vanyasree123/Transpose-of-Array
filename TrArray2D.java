 import java.util.*;

public class TrArray2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Input for matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Transpose the matrix
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Display the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);

        // Close the scanner
        scanner.close();
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
} 

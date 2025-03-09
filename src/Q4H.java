import java.util.Scanner;

public class Q4H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        double[][] a = new double[rows][cols];
        double[][] b = new double[rows][cols];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = input.nextDouble();
            }
        }

        double[][] result = addMatrix(a, b);

        System.out.println("Resultant Matrix (A + B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] sum = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}

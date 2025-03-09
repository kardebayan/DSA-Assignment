import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Row and Columns of 2D-Array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.print("Enter elements of 2D-Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        System.out.println("The elements of 2D array are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of elements of the 2D-Array is " + sum);
    }
}

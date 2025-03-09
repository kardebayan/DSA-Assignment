import java.util.Scanner;

public class Q3H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in arrays: ");
        int n = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Enter elements of array a:");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        System.out.println("Enter elements of array b:");
        for (int i = 0; i < n; i++) {
            b[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        System.out.print("Dot product array (c): ");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

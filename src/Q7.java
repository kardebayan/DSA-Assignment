import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements of Array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int max = arr[0], min = arr[0];
        int firstMaxIndex = 0, lastMinIndex = 0;
        int minCount = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                firstMaxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                lastMinIndex = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == max) maxCount++;
            if (arr[i] == min) {
                minCount++;
                lastMinIndex = i;
            }
        }

        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + (firstMaxIndex + 1) + ".");
        System.out.println("Last occurrence of minimum element is at position " + (lastMinIndex + 1) + ".");
    }
}

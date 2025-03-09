import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(number + " is odd: " + isOdd(number));
    }

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}

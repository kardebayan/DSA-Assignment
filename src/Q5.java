import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Sum of digits of " + number + " until the number is a single digit is " + sum_Of_Digits(number));
    }

    public static int sum_Of_Digits(int n) {
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n/10;
            }
            n = sum;
        }
        return n;
    }
}

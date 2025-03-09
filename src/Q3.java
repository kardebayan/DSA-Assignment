import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int clone = n;
        int sum = 0, prod = 1;
        while (n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n = n/10;
        }

        if (sum == prod) {
            System.out.println("So, " + clone + " is a spy number.");
        } else {
            System.out.println("So, " + clone + " is not a spy number.");
        }
    }
}

import java.util.Scanner;

public class Q1H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        System.out.print("Enter third integer: ");
        int c = input.nextInt();
        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } else if (b - c == a) {
            System.out.println(a + " = " + b + " - " + c);
        } else if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
        } else {
            System.out.println("No arithmetic formula found for the given numbers");
        }
    }
}

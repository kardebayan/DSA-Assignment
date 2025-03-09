import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height of person in meter: ");
        double height = input.nextDouble();
        double bmi = (double) weight/(height*height);
        if (bmi < 18.5) {
            System.out.println("The person is Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("The person has Normal Weight");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("The person is Overweight");
        } else {
            System.out.println("The person is Obese.");
        }
    }
}

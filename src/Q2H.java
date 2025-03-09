import java.util.ArrayList;
import java.util.Scanner;

public class Q2H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Enter lines of text (press Enter on an empty line to stop):");
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.isEmpty()) {
                break;
            }
            lines.add(line);
        }

        System.out.println("\nReversed Order Output:");
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}

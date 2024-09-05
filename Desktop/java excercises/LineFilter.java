import java.util.Scanner;

public class LineFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter lines of text (type 'quit' to exit):");

        while (true) {
            System.out.print("> ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            if (input.length() > 5) {
                System.out.println("Line: " + input);
            }
        }

        scanner.close();
        System.out.println("Program terminated.");
    }
}

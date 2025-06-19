import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String formattedInput = input.toLowerCase();

        String reversedInput = "";

        for (int i = formattedInput.length() - 1; i >= 0; i--) {
            reversedInput += formattedInput.charAt(i);
        }

        if (formattedInput.equals(reversedInput)) {
            System.out.println(input + " is a palindrome String.");
        } else {
            System.out.println(input + " is not a palindrome String.");
        }
        scanner.close();
    }
}
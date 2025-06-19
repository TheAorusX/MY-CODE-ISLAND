import java.util.Scanner;

public class EncryptString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Variable to store the encrypted string
        String encrypted = "";
        
        // Counter to track the space number
        int spaceCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                // Increment the space counter and replace the space with its position number
                spaceCount++;
                encrypted += spaceCount;
            } else if (ch >= 'A' && ch <= 'Z') {
                // For capital letters, shift two positions forward
                char shifted = (char)(ch + 2);
                // Wrap around if it exceeds 'Z'
                if (shifted > 'Z') {
                    shifted = (char)(shifted - 26);
                }
                encrypted += shifted;
            } else if (ch >= 'a' && ch <= 'z') {
                // For small letters, shift two positions backward
                char shifted = (char)(ch - 2);
                // Wrap around if it goes before 'a'
                if (shifted < 'a') {
                    shifted = (char)(shifted + 26);
                }
                encrypted += shifted;
            } else {
                // For non-alphabet characters, keep them unchanged
                encrypted += ch;
            }
        }

        // Output the encrypted string
        System.out.println("Encrypted String: " + encrypted);
        
        scanner.close();
    }
}

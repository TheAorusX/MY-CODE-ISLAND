import java.util.*;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Sort the words alphabetically
        Arrays.sort(words);

        // Display the sorted words
        System.out.println("Words in alphabetical order:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        scanner.close();
    }
}

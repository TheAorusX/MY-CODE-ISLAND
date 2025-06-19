import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Accept the sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Accept the word to remove from the user
        System.out.print("Enter the word to remove: ");
        String wordToRemove = scanner.next();

        // Remove the word from the sentence
        String newSentence = removeWord(sentence, wordToRemove);

        // Print the updated sentence
        System.out.println("Updated sentence: " + newSentence);

        // Close the scanner
        scanner.close();
    }

    public static String removeWord(String sentence, String wordToRemove) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Create a StringBuilder to store the new sentence
        StringBuilder newSentence = new StringBuilder();

        // Iterate over the words and append non-matching words to the new sentence
        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                newSentence.append(word).append(" ");
            }
        }
        // Convert StringBuilder to String and trim trailing spaces
        return newSentence.toString().trim();
    }
}

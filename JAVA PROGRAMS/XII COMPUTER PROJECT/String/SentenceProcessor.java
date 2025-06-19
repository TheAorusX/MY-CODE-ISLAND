import java.util.*;
public class SentenceProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input the sentence
        System.out.println("Enter the sentence (terminated by '.' or '?' or '!'):");
        String input = sc.nextLine().trim();
        // (a) Check for the validity of the accepted sentence
        char lastChar = input.charAt(input.length() - 1);
        if (lastChar != '.' && lastChar != '?' && lastChar != '!') {
            System.out.println("Invalid input: Sentence must end with '.', '?' or '!'.");
            return;
        }
        // Remove the terminating character for processing words
        String sentence = input.substring(0, input.length() - 1);
        // Manually splitting the sentence into words using a basic loop
        String[] words = new String[100]; // Assuming max 100 words
        int wordCount = 0;
        String currentWord = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == ' ') {
                if (!currentWord.equals("")) {
                    words[wordCount] = currentWord;
                    wordCount++;
                    currentWord = ""; // Reset the word
                }
            } else {
                currentWord += ch; // Append the character to form the word
            }
        }
        // Adding the last word after loop
        if (!currentWord.equals("")) {
            words[wordCount] = currentWord;
            wordCount++;
        }
        // (b) Sort words by length, and alphabetically if the same length
        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = i + 1; j < wordCount; j++) {
                // Compare by length first
                if (words[i].length() > words[j].length()) {
                    // Swap
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                } else if (words[i].length() == words[j].length()) {
                    // If length is same, compare alphabetically
                    if (words[i].compareTo(words[j]) > 0)
                    {
                        // Swap
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
        }
        // (c) Display the original sentence
        System.out.println("Original Sentence: " + input);
        // Display the converted sentence
        System.out.print("Converted Sentence: ");
        for (int i = 0; i < wordCount; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
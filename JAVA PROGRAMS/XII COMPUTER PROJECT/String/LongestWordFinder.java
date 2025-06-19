import java.util.Scanner;
public class LongestWordFinder
 {
    public static void main(String[]Args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Longest word: " + findLongestWord(sentence));
        scanner.close();
    }
    static String findLongestWord(String sentence) 
    {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words)
        {
            if (word.length() > longest.length()) 
            {
                longest = word;
            }
        }
        return longest;
    }
}
import java.util.Random;
public class Namereaction {
    public static void main(String[] args) {
        String[] reactions = {
            "Wurtz-Fitting reaction",
            "Wurtz reaction",
            "Fitting reaction",
            "Sandmeyer reaction",
            "Gattermann reaction",
            "Friedel-Craft alkylation and acylation reaction",
            "Swarts reaction"
        };

        Random random = new Random();
        int index = random.nextInt(reactions.length); // Generate a random index

        System.out.println("Write the reaction: " + reactions[index]);
    }
}

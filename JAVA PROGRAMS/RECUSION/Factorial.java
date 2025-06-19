import java.util.*;

class Factorial {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("Factorial of number " + n + " is: " + (-1*Fact(n)));
    }

    public static int Fact(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * Fact(x - 1);
        }
    }
}
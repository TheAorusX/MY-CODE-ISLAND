import java.util.Scanner;

public class PrimeAdam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input range values m and n
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int count = 0;
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        
        for (int i = m; i <= n; i++) {
            if (isPrimeAdam(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }
    
    // Function to check both prime and Adam properties
    public static boolean isPrimeAdam(int num) {
        if (num <= 1) return false;

        // Check prime
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        // Check Adam property
        int squareNum = num * num;
        int reverseNum = reverse(num);
        int squareReverse = reverseNum * reverseNum;
        
        return squareNum == reverse(squareReverse);
    }
    
    // Function to reverse a number
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;  
            num /= 10;
        }
        return rev;
    }
}

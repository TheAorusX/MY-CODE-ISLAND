import java.util.*;
class Max_Minfunction
{
    public static void main()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the two numbers");
    int a = in.nextInt();
    int b = in.nextInt();
    int max = Math.max(a,b);
    int min = Math.min(a,b);
    System.out.println("The bigger number is"+max);
    System.out.println("The smaller number is"+min);
}
}
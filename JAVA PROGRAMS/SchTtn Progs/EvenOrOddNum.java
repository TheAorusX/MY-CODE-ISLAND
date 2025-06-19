import java.util.*;
class EvenOrOddNum{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Eter the number");
        int n = in.nextInt();
        if(n%2==0)
        System.out.println("The number is EVEN");
        else
        System.out.println("The number is ODD");
    }
}
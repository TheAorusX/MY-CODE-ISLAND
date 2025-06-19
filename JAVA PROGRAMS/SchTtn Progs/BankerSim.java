import java.util.*;
class BankerSim
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rate");
        int r,q;
        r =in.nextInt();
        System.out.println("Enter Quantity");
        q =in.nextInt();
        double amt=q*r;
        double damt=(amt%7)*100;
        double namt=amt-damt;
        System.out.println("Amount ="+amt);
        System.out.println("Discounted amount"+damt);
        System.out.println("Net amount"+namt);
        System.out.println("Thank you for running me🙂");
    }
}
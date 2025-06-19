import java.util.*;
class VoterAge
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = in.nextInt();
        if(age>=18)
        System.out.println("Elighible to vote");
        else
        System.out.println("Not eligible to vote");
    }
}
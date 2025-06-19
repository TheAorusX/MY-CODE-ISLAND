import java.util.*;
class ClockPro
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of seconds");
        int hrs,min,sec,rsec;
        sec=in.nextInt();
        hrs=sec/3600;
        rsec=sec%3600;
        min=rsec/60;
        rsec=rsec%60;
        System.out.println("Number of hours= "+hrs);
        System.out.println("Number of minuits= "+min);
        System.out.println("Number of seconds remaining= "+rsec);
         System.out.println("Thank you for running me🙂");
    }
}

import java.util.*;
class SalaryFinder
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your basic salary please");
        double bs,hr,da,gs;
        bs=in.nextInt();
        da=(bs*50.0)/100;
        hr=(bs*20.0)/100;
        gs=bs+hr+da;
        System.out.println("Here is your gross salary" +gs);
        System.out.println("Thank you for running me🙂");
        
    }
}
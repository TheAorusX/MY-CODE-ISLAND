import java.util.*;
class UberUla
{
    public static void main()
    {
        Scanner in=new Scanner( System.in);
        int d,r,n;
        System.out.println("     OberUla Transportation Ltd. Menu Chart   ");
        System.out.println("   Distance                      Rate         ");
        System.out.println("   Up to 5km                     100Rs        ");
        System.out.println("   For next 10km                 10Rs per km  ");
        System.out.println("   For next 10km                 8Rs  per km  ");
        System.out.println("   More than 25km                5Rs  per km  ");
        System.out.println("   Enter Distance(Kilometers) Travelled       ");
        d=in.nextInt();
        n=d;
        if(d<=5)
        {
          r=100;
        }
        else if(5<d && d<15)
        {
            r=100+(d-5)*10;
        }
        else if(15<d && d<25)
        {
            r=100+(d-5)*10+d*8;
        }
        else 
        {
           r=100+(d-5)*10+(d-5)*8+d*5; 
        }
        System.out.println("______________________________________________");
        System.out.println("          OberUla Transportation Ltd.         ");
        System.out.println("                 Ride  Details                ");
        System.out.println("       Ride Distance:       "+n+"km.          ");
        System.out.println("       Total Ride cost:     "+r+"Rs.          ");
        System.out.println("     ~Thank You for travelling with us~       ");
        System.out.println("______________________________________________");
    }
}
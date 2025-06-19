import java.util.*;
class Mesurmenter
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hight in centemeteres🙂");
        System.out.println("Hint//We know 1 feet=12inch annd i inch=2.54cm");
        int f,inc,c ;
        int h= in.nextInt();
        inc = h / (254/100); 
        f= inc/12;
        inc=inc%12;
        System.out.println("feet= "+f);
        System.out.println("inches= "+inc);
        System.out.println("hight"+h);  System.out.print("cm");
        System.out.println("Thank you for running me🙂");
    }
}
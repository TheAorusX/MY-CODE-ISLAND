import java.util.*;
class DigitCount
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n,i,d;
        System.out.println("Enter A Number");
        n=in.nextInt();
        System.out.println("Input Recieved="+n);
        {
            d=n%10;
            System.out.println(d);
        }
    }
}
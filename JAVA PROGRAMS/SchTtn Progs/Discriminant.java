import java.util.*;
class Discriminant
{
        public static void main()
        {
            Scanner in=new Scanner(System.in);
            Double a,b,c;
            Double Drt1,Drt2;
            int DRT1,DRT2;
            System.out.println("Enter value of a");
            a=in.nextDouble();
            System.out.println("Enter value of b");
            b=in.nextDouble();
            System.out.println("Enter value of b");
            c=in.nextDouble();
            System.out.println("a="+a+"     b="+b+"     c="+c);
            Drt1=-b-(Math.sqrt((b*b)-(4*a*c)));
            Drt2=-b+(Math.sqrt(Math.pow(b,2)-(4*a*c)));
            System.out.println("two roots of equation are");
            System.out.println(Drt1/2+"  ,  "+Drt2/2);
            //DRT1=(int)Drt1;
            //DRT2=(int)Drt2;
        }
}
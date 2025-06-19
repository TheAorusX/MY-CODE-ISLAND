import java.util.*;
class m3toliters
{
    public static void main()
    {
         Scanner in=new Scanner(System.in);
         int li;
         double mcu;
         System.out.println("Enter values of Liters");  //1 metercube is equals to 1000 liters
         li=in.nextInt();
         mcu=li/1000;
         System.out.println(li+"Liters equals to"+mcu+"metercube");
    }
}
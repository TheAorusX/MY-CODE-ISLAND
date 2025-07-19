package String_Programs;

import java.util.*;
class Hotel
{
    String nm;
    long mno;
    double bill,gst,st,tamt;
    Scanner in=new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter customer's name");
        nm=in.nextLine();   
        System.out.println("Mobile number");
        mno=in.nextLong();
        System.out.println("bill amount");
        bill=in.nextDouble();
    }
    public void calculate()
    {
        gst=(bill*18)/100;
        st=(bill*12.5)/100;
        tamt=bill+gst+st;
    }
    public void display()
    {
        System.out.println("Customer name           :"+nm);
        System.out.println("Mobile number           :"+mno);
        System.out.println("Goods and Service tax   :Rs."+gst);
        System.out.println("Service tax             ;Rs."+st);
        System.out.println("Total amount            :Rs."+tamt);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        Hotel ob =new Hotel();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}

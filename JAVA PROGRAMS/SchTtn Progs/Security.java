import java.util.*;
class Security
{
String n;
int h;
double r,w;
Scanner in=new Scanner(System.in);
public void get()
{
System.out.println("Enter name");
n=in.nextLine();
System.out.println("Enter hours worked");
h=(int)in.nextDouble();
System.out.println("Enter rate");
r=in.nextDouble();
}
public void calwage()
{
if(h<=40)
w=r*h;
else if(h>40 && h<=60)
w=((h-40)*1.5*r)+(40*r);
else if (h>60 && h<=80)
w=((h-60)*2*r)+(r*1.5*20)+(4*r);
}
public void display()
{
System.out.println("name:"+n);
System.out.println("hours worked:"+h);
System.out.println("wage:"+w);
}
public static void main()
    {
        Scanner in=new Scanner(System.in);
        Security ob =new Security();
        ob.get();
        ob.calwage();
        ob.display();
    }
}
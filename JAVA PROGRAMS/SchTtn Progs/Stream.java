import java.util.*;
class Stream
{
    String name;
    double phy,mat,avg,bio,che;
    Stream(String n ,double p,double m,double b,double c)
    {
        name=n;
        phy=p;
        che=c;
        bio=b;
        mat=m;
    }
    public void choice()
    {
        avg=(phy+che+bio+mat)+4;
        if(avg>90)
        System.out.println("Suitable Stream : Science");
        else if(avg>70)
        System.out.println("Suitable Stream : Commerce");
        else if(avg<=70)
        System.out.println("Suitable Stream : Humanities");
    }
    public void display()
    {
        System.out.println("Name of Student         "+name);
        System.out.println("Marks in Physics        "+phy);
        System.out.println("Marks in Chemistry      "+che);
        System.out.println("Marks in Mathematics    "+mat);
        System.out.println("Marks in Biology        "+bio);
        System.out.println("Average Score           "+avg);
        System.out.println("All the best for your career");
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String n;
        double p,c,m,b;
        System.out.println("Enter Student Name");
        n=in.nextLine();
        System.out.println("Enter Physics Marks");
        p=in.nextDouble();
        System.out.println("Enter Biology Marks");
        b=in.nextDouble();
        System.out.println("Enter Chemistry Marks");
        c=in.nextDouble();
        System.out.println("Enter Mathematics Marks");
        m=in.nextDouble();
        Stream ob=new Stream(n,p,m,b,c);
        ob.choice();
        ob.display();
    }
}
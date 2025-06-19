import java.util.*;
class BookFair
{
    String Bname;
    double price=0.0;
    double dprice=0.0;
    Scanner in=new Scanner(System.in);
    public void  Input()
    {
         System.out.println("Enter Book Name");
         Bname=in.nextLine();   
         System.out.println("Enter Book Price");
         price=in.nextDouble();
    }
    public void Calculate()
    {
        if(price<=3000)
        dprice=price;
        else if(price>1000)
        dprice=price-((price*2)/100);
        else if(price>1000 && price<3000)
        dprice=price-((price*10)/100);
        else
        dprice=price-((price*15)/100);
    }
    public void Display()
    {
        System.out.println("Book Name:           "+Bname);
        System.out.println("Actual Book Price:   "+price);
        System.out.println("Discounted Book Name:"+dprice);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        BookFair ob=new  BookFair();
        ob.Input();
        ob.Calculate();
        ob.Display();
    }
}
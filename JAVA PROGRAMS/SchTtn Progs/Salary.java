import java.util.*;
class Salary 
{
    String nm,sub,Address;
    long phone;
    double MonthlySalary,IncTax;
    Scanner in=new Scanner(System.in);
    public void accept ()
    {
        System.out.println("Enter name,address,subject of specialisation of teacher ");
        nm=in.nextLine();
        Address=in.nextLine();
        sub=in.nextLine();
        System.out.println("Enter phone number");
        phone=in.nextLong();
        System.out.println("Enter monthly salary");
        MonthlySalary=in.nextDouble();
    }

    public void calculate()
    {
        if((12*MonthlySalary)>175000)
            IncTax=((12*MonthlySalary)-175000)*5/100;
        else
            IncTax=0;
    }

    public void display()
    {
        System.out.println("Name                     :"+nm);
        System.out.println("Address                  :"+Address);
        System.out.println("Phone number             :"+phone);
        System.out.println("Subject of specialisation:"+sub);
        System.out.println("Monthlyc Salary          :"+MonthlySalary);
        System.out.println("Income Tax               :"+IncTax);
    }

    public static void main()
    {
        Scanner in=new Scanner(System.in);
        Salary ob= new Salary();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}
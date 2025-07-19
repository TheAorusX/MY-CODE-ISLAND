import java.util.*;
class IRCTC
{
    String nm;
    int v;
    long  MobNo;
    double amt,Tolamt;
    
    
    public void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Passenger name");
        nm=in.nextLine();
        System.out.println("Enter Passenger mobile number");
        MobNo=in.nextLong();
        System.out.println("Coach types available");
        System.out.println("    : 1.First_AC     ");
        System.out.println("    : 2.Second_AC    ");
        System.out.println("    : 3.Third_AC     ");
        System.out.println("    : 4.Sleeper      ");
        System.out.println("Enter coach type");
        v=in.nextInt();
        if(v!=1 && v!=2 && v!=3 && v!=4 )
            System.out.println("Error! Please select from the above options");
        else if(v==1 || v==2 || v==3 || v==4)
        {
            System.out.println("Enter trip amount");
            amt=in.nextDouble();
        }
    }

    public void update()
    {
        switch(v)
        {
            case 1:
                Tolamt=amt+700;
                break;
            case 2:
                Tolamt=amt+500;
                break;
            case 3:
                Tolamt=amt+250;
                break;
            case 4:
                Tolamt=amt;
                break;
            default:break;

        }
    }
    public void display()
    {
        System.out.println("|     ~INDIAN RAILWAY CATERING AND TOURISM CORPORATION~     |");    
        System.out.println("Passenger Name                                    "+nm);
        System.out.println("Passenger mobile number "+MobNo+"");
        if(v==1)
            System.out.println("Coach type                                         First_AC");
        if(v==2)
            System.out.println("Coach type                                        Second_AC");
        if(v==3)
            System.out.println("Coach type                                         Third_AC");
        if(v==4)
            System.out.println("Coach type                                          Sleeper");
        System.out.println("Trip Amount                                         "+amt+"");
        System.out.println("Additional cost(coach type): "+(Tolamt-amt)+"");
        System.out.println("Total amount                                     "+Tolamt+"");
        System.out.println("|~Thanks for travelling with IRCTC wish you a happy journey~|");
    }
    public static void main(String[]args)
    { 
        Scanner in=new Scanner(System.in);
        IRCTC ob= new IRCTC();
        ob.accept();
        ob.update();
        ob.display();
    }
}
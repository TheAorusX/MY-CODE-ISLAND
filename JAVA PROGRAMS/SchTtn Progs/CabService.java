import java.util.*;
class CabService
{
    int car_type;
    double km;
    double bill;
    public void CabService()
    {
        car_type=0;
        km=0.0;
        bill=0.0;
    }
    public void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("WELLCOME TO FAKE TAXI CAB SERVICES");
        System.out.println("Available car types");
        System.out.println("1.AC Type");
        System.out.println("2.Non-AC Type"); 
        System.out.println("Enter car type");
        car_type=in.nextInt();
        System.out.println("Enter distance travelled in km");
        km=in.nextDouble();
    }
    public void calculate()
    {
        if(car_type==1)
        {
            if(km<=5)
            bill=150;
            else if(km>5)
            bill=150+(km-5)*10;
        }
        else if(car_type==2)
        {
            if(km<=5)
            bill=120;
            else if(km>5)
            bill=120+(km-5)*8;
        }
    }
    public void display()
    {
        if(car_type==1)
        System.out.println("Car type selected               :  AC Type");
        else if(car_type==2)
        System.out.println("Car type selected               :  Non-AC Type");
        System.out.println("Distance travelled in kilometers: "+km+"km");
        System.out.println("Total Ride expence              : "+bill);    
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        CabService ob=new CabService();
        ob.CabService();
        ob.accept();
        ob.calculate();
        ob.display();
    }
}
    import java.util.*;
class IsmeTeraGhataMeraKuchNhiJata
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int CP,SP;
        double P,PP,L,LP;
        System.out.println("Enter Cost Price");
        System.out.println("Enter Selling Price");
        CP=in.nextInt();
        SP=in.nextInt();
        if(SP>CP)
        {
            P=SP-CP;
            PP=P/CP*100;
            System.out.println("Profit Amount "+P+"Rs");
            System.out.println("Profit Percentage "+PP+"%");
        }
        if(CP>SP)
        {
            L=CP-SP;
            LP=L/CP*100;
            System.out.println("Losst Amount "+L+"Rs");
            System.out.println("Loss Percentage "+LP+"%");
        }
        if(CP==SP)
        {
            System.out.println("No Profit No Loss");
        }
    }
}
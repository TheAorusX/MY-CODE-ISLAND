import java.util.*;
class PUBGNewState
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int a,b,s;
        int V;
        System.out.println("Input two numbers");
        a =in.nextInt();
        b =in.nextInt();
        System.out.println("                       M   E   N   U                        ");
        System.out.println("Select 1 for addition_2 for subtraction_3 for multiplication");
        V=in.nextInt();
        switch(V)
        {
            case 1:s=a+b;
                System.out.println("Addition="+s);  
                System.out.println("Thank you for running me🙂");
                break;
            case 2:s=a-b;
                s=Math.abs(s);
                System.out.println("Subtraction="+s);
                System.out.println("Thank you for running me🙂");
                break;
            case 3:s=a*b;
                System.out.println("Multiplication="+s);
                System.out.println("Thank you for running me🙂");
                break;
            default:System.out.println("Blind!!! READ THE MENU!");

        }
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
}
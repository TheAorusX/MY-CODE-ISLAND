import java.util.*;
class LenBreDia {
    public static void main() {
        Scanner in = new Scanner(System.in);
        double l,b,p,ar,d ;
        int V;
        System.out.println("ENTER THE LENGTH AND BREADTH OF THE RECTANGEL");
        l= in.nextDouble();
        b= in.nextDouble();
        System.out.println("COMMAND~SELECTION");
        System.out.println("1>PERIMETERE");
        System.out.println("2>AREA");
        System.out.println("3>DIAGONALS");
        V= in.nextInt();
        switch (V)
        {
            case 1:p= 2*(l+b);
            System.out.println("PERIMETERE="+p);
            break;
            case 2:ar= l*b;
            System.out.println("AREA="+ar);
            break;
            case 3:d=Math.sqrt((l*l)+(b*b));
            System.out.println("DIAGONALS="+d);
            break;
            default:System.out.println("BLIND OR WHAT!! CAN'T YOU SEE THE 3 OPTIONS :|");
        }
        System.out.println("Thank you for running me🙂");
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
}
import java.util.*;
class prog24
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a charecter");
        char ch = in.next().charAt(0);
        if (ch>= 'A' && ch<='Z' || ch>= 'a' && ch<='z')
           System.out.println("Alphabet");
        else if(ch>= '0' && ch<= '9')
           System.out.println("Digits");
        else
        System.out.println("other charecter");
    }
}
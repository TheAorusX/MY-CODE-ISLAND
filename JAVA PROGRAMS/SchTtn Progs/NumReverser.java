import java.util.*;
class NumReverser
{
    public static void main(String[]Args)
    {
        Scanner in = new Scanner(System.in);
        int num, rem;
        System.out.println("Enter the number");
        num=in.nextInt();
        rem=num%10;
        num=num%rem;
        System.out.println(num);
    }
}
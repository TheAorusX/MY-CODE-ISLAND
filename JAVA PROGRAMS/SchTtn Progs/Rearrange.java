import java.util.*;
class Rearrange
{
    String Txt;
    String Cxt;
    int len;
    public Rearrange()
    {
        Txt="";
        Cxt="";
        len=0;
    }
    public void readword()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter A Word");
        Txt=in.nextLine();
        len=Txt.length();
    }
    public void convert()
    {
        for(int i=0;i<len;i++)
        {
            char ch=Txt.charAt(i);
            char c=Character.toUpperCase(ch);
            Cxt=Cxt+c;
        }
    }
    public void display()
    {
        System.out.println(Cxt);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        Rearrange ob=new Rearrange();
        ob.readword();
        ob.convert();
        ob.display();
    }
}
import java.util.*;
class Exchange
{
    String sent;
    String newstr;
    int length;
    public Exchange()
    {
        sent="";
        newstr="";
        length=0;
    }
    public void readword()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter A Word");
        sent=in.nextLine();
        length=sent.length();
        char chh=sent.charAt(length-1);
        if(chh!='.')
        System.out.println("ERROR! '.' Missing");
    }
    public void newword()
    {
        String s1="",s2="";
        int i;
        for(i=0;i<(length-1);i++)
        {
            char ch=sent.charAt(i);
            char c1=Character.toUpperCase(ch); 
            if(c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U')
            s1=s1+ch;
            else
            s2=s2+ch;
        }
        newstr=""+s1+s2;
    }
    public void display()
    {
        System.out.println("the new string is : "+newstr);
    }
    public static void main() 
    {
        Scanner in=new Scanner(System.in);
        Exchange ob=new Exchange();
        ob.readword();
        ob.newword();
        ob.display();
    }
}
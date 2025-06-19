import java.util.*;
class SortAlpha
{
     String sent;
     int n;
     public SortAlpha()
     {
        sent="";
        n=0;
     }
     public void acceptsent()
     {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Sentence");
        sent=in.nextLine();
        sent=sent.toUpperCase();
        int N=0;
        for(int i=0;i<sent.length();i++)
        {
            char ch=sent.charAt(i);
            if(ch==' ')
            N++;
        }
     }
     public void sort(SortAlpha P)
     {
        int i,j;
        String t="";
       String a[]=P.sent.split(" ");
       for(i=0;i<P.n-1;i++)
       {
        for(j=0;j<P.n-1;j++)
        {
            if(a[j].compareTo(a[j+1])>0)
             t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
       }  
       P.sent="";
       for(i=0;i<n;i++)
       {
        P.sent+=a[i]+" ";
       }
     }
     public void display()
     {
         System.out.println("Original Sentence");
         System.out.println(sent);
         sort(this);
         System.out.println("Sorted Sentence");
         System.out.println(this.sent);
     }
     public static void main()
     {
        Scanner in=new Scanner(System.in);
        SortAlpha ob=new SortAlpha();
        ob.acceptsent();
        ob.display();
     }
}
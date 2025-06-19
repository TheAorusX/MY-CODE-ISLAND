class AttemptToHalfDiamond
{
    public static void main(String[]ARGS)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
           for(j=1;j<=i;j++) 
           {
               System.out.print(" *");
           }
           System.out.println();
        }
        int a,b;
        for(a=6;a>=1;a--)
        {
            for(b=a;b>=1;b--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
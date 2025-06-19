class AttemptToPatern13
{
    public static void pattern(int n)
    {
        int i,j,t=1 ;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(t+" ");
                t=t+2;
            }
            System.out.println();
        }
    }
}
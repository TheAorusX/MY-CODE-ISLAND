class AttemptToPatern10
{
    public static void main(String[]ARGS)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
              if(j%2==0)
              System.out.print(" @ ");
              else
              System.out.print(" $ ");
            }
            System.out.println();
        }
    }
}

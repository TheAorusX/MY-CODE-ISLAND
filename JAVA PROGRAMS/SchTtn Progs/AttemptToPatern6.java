class AttemptToPatern6
{
    public static void main(String[]ARGS)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%2==0)
                System.out.print("S");
                else
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
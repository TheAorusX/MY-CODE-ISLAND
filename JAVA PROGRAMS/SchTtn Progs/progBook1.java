class progBook1
{
    public static void main(int N)
    {
        int x, count=0;
        for(x=1; x<=N; x++)
        {
            if(N % x==0)
            {
                count++;
            }
        }//end of loop
        if(count==2)
        {
            System.out.println(N+"is a Prime number");
        }
        else
        {
            System.out.println(N+"Is not a Prime number");
        }
    }
}

   
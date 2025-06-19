class prog6
{
    /**Wap to accept any 4 2-digited numbers and find the sum and average and check whether the sum is single digited or double digited*/
    public static void main(int a, int b, int c, int d)
    {
        int sum= a+b+c+d;
        int avg=sum/2;
        if(sum<10){
            System.out.println("The sum is a single digited number");
        }
        else if(sum>=10 && sum<100){
            System.out.println("The sum is a double digited number");
        }
    }
}
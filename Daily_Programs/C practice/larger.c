#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number: \n");
    scanf("%d",&n);
    int num=n;
    int sum=0;
    while(num>0)
    {
        int d=num%10;
        sum=sum+d;
        num=num/10;
    }
    printf("Sum of digits of %d : %d",n,sum);
    return 0;
}
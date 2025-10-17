#include <stdio.h>
int main()
{
    printf("Enter 3 numbers\n");
    int a,b,c;
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&b);
    printf("%d+%d+%d= %d \n",a,b,c,(a+b+c));
    printf("(%d+%d+%d)/3 = %f",a,b,c,((a+b+c)%3));
}
#include <stdio.h>
int main()
{
    int a, b;
    printf("Enter 1st number");
    scanf("%d", &a);
    printf("Enter 2nd number");
    scanf("%d", &b);
    int s=a+b;
    printf("sum of %d and %d is= %d",a,b,s);
    return 0;
}
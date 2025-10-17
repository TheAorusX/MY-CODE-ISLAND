#include <stdio.h>
int main()
{
    printf("Enter A Number\n");
    int n;
    scanf("%d", &n);
    int d=n%10;
    printf("Last digit of %d = %d",n,d);
}
#include <stdio.h>
int main()
{
    int m;
    printf("Enter Month Number: ");
    scanf("%d", &m);
    if(m>=1 && m<=12)
    {
        if(m%2==0 && m==2)
        printf("This month has 28 days(Non leap year) and 29 days(Leap Year)");
        else if(m%2==0 && m!=2)
        printf("This month has 30 days");
        else if(m!=2)
        printf("This month has 31 days");
    }
    else
    printf("INVALID MONTH!");
}   
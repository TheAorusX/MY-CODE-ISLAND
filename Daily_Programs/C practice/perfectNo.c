#include <stdio.h>
int main()
{
    int n,i,s=0;
    printf("Enter a number to be checked: ");
    scanf("%d",&n);
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            s=s+i;
        }
    }
    if(s==n)
    printf("Its is a perfect number! %d",s);
    else
    printf("Its not a perfect number! %d",s);
}
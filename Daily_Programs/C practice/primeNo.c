#include <stdio.h>
int main() 
{
    int n, i, j, f;
    printf("Enter range: ");
    scanf("%d", &n);

    printf("Prime numbers up to %d are: ", n);
    for(i=1;i<=n;i++)
    {
        int m=i;
        f=0;
        for(j=1;j<=m;j++)
        {
            if(m%j==0)
            f++;
        }
        if(f==2)
        printf("%d, ",m);
    }
}
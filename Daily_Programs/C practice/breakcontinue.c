#include <stdio.h>
int main() 
{
    int n;
    printf("Enter range: ");
    scanf("%d", &n);

    printf("Printing numbers up to %d except even numbers: ", n);
    for(int i=1;i<=n;i++)
    {
        if(i%2!=0)
        printf("%d, ",i);
        else
        continue;
    }
}
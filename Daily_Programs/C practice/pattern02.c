#include <stdio.h>
int main()
{
    int i,j;
    printf("Printing Axis\n");
    for(i=1;i<10;i++)
    {
        for(j=1;j<10;j++)
        {
            if(i==5 || j==5)
            printf(" *");
            else
            printf(" _");
        }
        printf("\n");
    }
    printf("Printing Borders \n");
    for(i=1;i<10;i++)
    {
        for(j=1;j<10;j++)
        {
            if(i==1 || i==9 || j==1 || j==9)
            printf(" *");
            else
            printf(" _");
        }
        printf("\n");
    }
    printf("Printing Diagonals \n");
    for(i=1;i<10;i++)
    {
        for(j=1;j<10;j++)
        {
            if(i+j==10 || i==j)
            printf(" *");
            else
            printf(" _");
        }
        printf("\n");
    }
    printf("Printing Diagonals \n");
    for(i=1;i<10;i++)
    {
        for(j=1;j<10;j++)
        {
            if()
            printf(" *");
            else
            printf(" _");
        }
        printf("\n");
    }
}
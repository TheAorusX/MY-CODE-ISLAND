#include <stdio.h>
int main()
{
    int i,l,sm,lg,sv,sum=0,f=0;
    printf("Enter length of array: ");
    scanf("%d",&l);
    int arr[l];
    printf("Enter %d elements in array:\n",l);
    for(i=0;i<l;i++)
    {
        scanf("%d", &arr[i]);
    }
    sm=arr[0];
    lg=arr[0];
    printf("Enter element to be searched: \n");
    scanf("%d", &sv);
    printf("Processing...\n");
    printf("ELements greater than 5: \n");
    for(i=0;i<l;i++)
    {
        sum=sum+arr[i];
        if(arr[i]>lg)
        lg=arr[i];
        else if(arr[i]<sm)
        sm=arr[i];
        if(arr[i]>5)
        printf("%d, ",arr[i]);
        if(arr[i]=sv)
        f++;
    }
    printf("\n");
    printf("Smallest Element: %d\n",sm);
    printf("Largest Element: %d\n",lg);
    printf("Sum of ELements: %d\n",sum);
    printf("Average of elements: %d\n",(sum%l));
    if(f==0)
    printf("%d not present",sv);
    else if (f>=1)
    printf("%d is present",sv);
    
}
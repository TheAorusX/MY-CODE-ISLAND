#include <stdio.h>
int main()
{
    int a,c;
    printf("Enter 1st number: ");
    scanf("%d", &a);
    printf("Enter 2nd number: ");
    scanf("%d", &c);
    int s=a+c;
    printf("%d + %d = %d",a,c,s);
    printf("\n");
    printf("On dividing %d by %d",a,c);
     printf("\n");
    float rem=a%c;
    float quo=a/c;
    printf("quotent=%f and reminder=%f",quo,rem);
     printf("\n");
    printf("square of %d=%d and double of %d=%d \n",a,(a*a),a,(2*a));
    printf("square of %d=%d and double of %d=%d \n",c,(c*c),c,(2*c));
    printf("cube of %d= %d and cube of %d= %d \n",a,(a*a*a),c,(c*c*c));
    return 0;
}
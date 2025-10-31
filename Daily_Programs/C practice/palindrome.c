#include <stdio.h>
int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d", &n) ;
    int num = n;
    int rev = 0;
    while (num > 0) {
        int d = num % 10;
        rev = rev * 10 + d;
        num /= 10;
    }
    if (rev == n)
        printf("Palindrome Number\n");
    else
        printf("Not a Palindrome Number\n");
    return 0;
}
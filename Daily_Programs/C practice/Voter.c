#include <stdio.h>
int main()
{
    int age;
    char name[100];
    printf("Enter your Name: ");
    scanf("%99s", name);
    printf("Enter your Age: ");
    scanf("%d", &age);
    if (age >= 18) {
        printf("%s is eligible to vote\n", name);
    } else {
        printf("%s is not eligible to vote\n", name);
    }
    return 0;
}
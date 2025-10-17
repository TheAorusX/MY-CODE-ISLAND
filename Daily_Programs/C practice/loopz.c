#include <stdio.h>
int main() {
    printf("Printing 1 to 10\n");
    for (int i = 1; i <= 10; i++)
    {
        printf("%d, ", i);
    }
    printf("Printing 10 to 1\n");
    for (int i = 1; i <= 10; i++)
    {
        printf("%d, ", i);
    }
}
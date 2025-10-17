#include <stdio.h>

int main() {
    int n = 10; // Height and breadth of the diamond (must be even for symmetry)
    int i, j, space, stars;

    // Upper half
    for(i = 1; i <= n/2; i++) {
        space = (n/2) - i;
        stars = 2*i - 1;
        for(j = 0; j < space; j++)
            printf(" ");
        for(j = 0; j < stars; j++)
            printf("*");
        printf("\n");
    }
    // Lower half
    for(i = n/2; i >= 1; i--) {
        space = (n/2) - i;
        stars = 2*i - 1;
        for(j = 0; j < space; j++)
            printf(" ");
        for(j = 0; j < stars; j++)
            printf("*");
        printf("\n");
    }
    return 0;
}
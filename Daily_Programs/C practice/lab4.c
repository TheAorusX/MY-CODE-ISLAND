#include <stdio.h>
#include <math.h>

int main()
{
    int choice, n, num, i;
    printf("Lab 4: Loops (while, do-while, for)\n");
    printf("1. Print first n natural numbers\n");
    printf("2. Print even numbers up to n\n");
    printf("3. Find sum of first n natural numbers\n");
    printf("4. Find factorial of a number\n");
    printf("5. Reverse a number\n");
    printf("6. Check whether a number is palindrome\n");
    printf("7. Check whether a number is Armstrong number\n");
    printf("8. Generate Fibonacci series up to n terms\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice)
    {
    case 1:
    { // Print first n natural numbers
        printf("Enter n: ");
        scanf("%d", &n);
        printf("First %d natural numbers:\n", n);
        for (i = 1; i <= n; i++)
            printf("%d ", i);
        break;
    }

    case 2:
    { // Print even numbers up to n
        printf("Enter n: ");
        scanf("%d", &n);
        printf("Even numbers up to %d:\n", n);
        i = 2;
        while (i <= n)
        {
            printf("%d ", i);
            i += 2;
        }
        break;
    }

    case 3:
    { // Sum of first n natural numbers
        printf("Enter n: ");
        scanf("%d", &n);
        int sum = 0;
        for (i = 1; i <= n; i++)
            sum += i;
        printf("Sum = %d\n", sum);
        break;
    }

    case 4:
    { // Factorial
        printf("Enter a number: ");
        scanf("%d", &n);
        long long fact = 1;
        for (i = 1; i <= n; i++)
            fact *= i;
        printf("Factorial of %d = %lld\n", n, fact);
        break;
    }

    case 5:
    { // Reverse a number
        printf("Enter a number: ");
        scanf("%d", &num);
        int rev = 0, rem;
        while (num != 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        printf("Reversed number = %d\n", rev);
        break;
    }

    case 6:
    { // Palindrome check
        printf("Enter a number: ");
        scanf("%d", &num);
        int original = num, rev = 0, rem;
        while (num != 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if (original == rev)
            printf("Palindrome number\n");
        else
            printf("Not a palindrome number\n");
        break;
    }

    case 7:
    { // Armstrong number
        printf("Enter a number: ");
        scanf("%d", &num);
        int original = num, sum = 0, digits = 0, temp = num;
        while (temp != 0)
        {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp != 0)
        {
            int rem = temp % 10;
            sum += pow(rem, digits);
            temp /= 10;
        }
        if (sum == original)
            printf("Armstrong number\n");
        else
            printf("Not an Armstrong number\n");
        break;
    }

    case 8:
    { // Fibonacci series
        printf("Enter number of terms: ");
        scanf("%d", &n);
        int a = 0, b = 1, c, count = 1;
        printf("Fibonacci series up to %d terms:\n", n);
        do
        {
            printf("%d ", a);
            c = a + b;
            a = b;
            b = c;
            count++;
        } while (count <= n);
        break;
    }

    default:
        printf("Invalid choice!\n");
    }
    printf("\n");
    return 0;
}
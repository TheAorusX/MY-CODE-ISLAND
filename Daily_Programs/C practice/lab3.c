#include <stdio.h>
int main() {
    int choice;
    printf("Select an option:\n");
    printf("1. Check Even or Odd\n");
    printf("2. Greatest of Two Numbers\n");
    printf("3. Greatest of Three Numbers\n");
    printf("4. Check Positive, Negative or Zero\n");
    printf("5. Check Leap Year\n");
    printf("6. Print Grade from Marks\n");
    printf("7. Vowel or Consonant\n");
    printf("8. Simple Calculator\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1: {
            int num;
            printf("Enter a number: ");
            scanf("%d", &num);
            if (num % 2 == 0)
                printf("%d is Even\n", num);
            else
                printf("%d is Odd\n", num);
            break;
        }
        case 2: {
            int a, b;
            printf("Enter two numbers: ");
            scanf("%d %d", &a, &b);
            if (a > b)
                printf("%d is greatest\n", a);
            else if (b > a)
                printf("%d is greatest\n", b);
            else
                printf("Both numbers are equal\n");
            break;
        }
        case 3: {
            int a, b, c;
            printf("Enter three numbers: ");
            scanf("%d %d %d", &a, &b, &c);
            if (a >= b && a >= c)
                printf("%d is greatest\n", a);
            else if (b >= a && b >= c)
                printf("%d is greatest\n", b);
            else
                printf("%d is greatest\n", c);
            break;
        }
        case 4: {
            int num;
            printf("Enter a number: ");
            scanf("%d", &num);
            if (num > 0)
                printf("%d is Positive\n", num);
            else if (num < 0)
                printf("%d is Negative\n", num);
            else
                printf("Number is Zero\n");
            break;
        }
        case 5: {
            int year;
            printf("Enter a year: ");
            scanf("%d", &year);
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                printf("%d is a Leap Year\n", year);
            else
                printf("%d is not a Leap Year\n", year);
            break;
        }
        case 6: {
            int marks;
            printf("Enter marks (0-100): ");
            scanf("%d", &marks);
            if (marks >= 90)
                printf("Grade: A\n");
            else if (marks >= 80)
                printf("Grade: B\n");
            else if (marks >= 70)
                printf("Grade: C\n");
            else if (marks >= 60)
                printf("Grade: D\n");
            else if (marks >= 50)
                printf("Grade: E\n");
            else
                printf("Grade: F\n");
            break;
        }
        case 7: {
            char ch;
            printf("Enter a character: ");
            scanf(" %c", &ch);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                printf("%c is a Vowel\n", ch);
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                printf("%c is a Consonant\n", ch);
            else
                printf("%c is not an alphabet\n", ch);
            break;
        }
        case 8: {
            double num1, num2;
            char op;
            printf("Enter first number: ");
            scanf("%lf", &num1);
            printf("Enter operator (+, -, *, /): ");
            scanf(" %c", &op);
            printf("Enter second number: ");
            scanf("%lf", &num2);
            switch (op) {
                case '+': printf("Result: %.2lf\n", num1 + num2); break;
                case '-': printf("Result: %.2lf\n", num1 - num2); break;
                case '*': printf("Result: %.2lf\n", num1 * num2); break;
                case '/':
                    if (num2 != 0)
                        printf("Result: %.2lf\n", num1 / num2);
                    else
                        printf("Error: Division by zero\n");
                    break;
                default: printf("Invalid operator\n");
            }
            break;
        }
        default:
            printf("Invalid choice\n");
    }
    return 0;
}
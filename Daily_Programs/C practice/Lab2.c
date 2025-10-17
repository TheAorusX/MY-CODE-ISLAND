    #include <stdio.h>
    #include <math.h>
    int main()
    {
        int a, b;
        printf("Enter two integers: ");
        scanf("%d %d", &a, &b);
        printf("Addition: %d\n", a + b);
        printf("Subtraction: %d\n", a - b);
        printf("Multiplication: %d\n", a * b);
        if (b != 0) {
            printf("Division: %.2f\n", (float)a / b);
            printf("Modulus: %d\n", a % b);
        } else {
            printf("Division and modulus by zero not allowed.\n");
        }
        int num;
        printf("\nEnter a number: ");
        scanf("%d", &num);
        printf("Square: %d\n", num * num);
        printf("Cube: %d\n", num * num * num);
        int s1, s2, s3, s4, s5;
        printf("\nEnter marks of 5 subjects: ");
        scanf("%d %d %d %d %d", &s1, &s2, &s3, &s4, &s5);
        int total = s1 + s2 + s3 + s4 + s5;
        float average = total / 5.0;
        printf("Total: %d\n", total);
        printf("Average: %.2f\n", average);
        float side1, side2, side3;
        printf("\nEnter three sides of triangle: ");
        scanf("%f %f %f", &side1, &side2, &side3);
        float s = (side1 + side2 + side3) / 2;
        float area = sqrt(s * (s - side1) * (s - side2) * (s - side3));
        printf("Area of triangle: %.2f\n", area);
        float salary, da, hra, gross;
        printf("\nEnter basic salary: ");
        scanf("%f", &salary);
        da = salary * 0.10;
        hra = salary * 0.15;
        gross = salary + da + hra;
        printf("DA: %.2f\n", da);
        printf("HRA: %.2f\n", hra);
        printf("Gross Salary: %.2f\n", gross);
        int x, y;
        printf("\nEnter two numbers to swap: ");
        scanf("%d %d", &x, &y);
        x = x + y;
        y = x - y;
        x = x - y;
        printf("After swapping: x = %d, y = %d\n", x, y);
        int p, q;
        printf("\nEnter two integers for relational/logical operators: ");
        scanf("%d %d", &p, &q);
        printf("p is %d , a is %d",&p,&q);
        printf("p == q: %d\n", p == q);
        printf("p != q: %d\n", p != q);
        printf("p > q: %d\n", p > q);
        printf("p < q: %d\n", p < q);
        printf("p >= q: %d\n", p >= q);
        printf("p <= q: %d\n", p <= q);
        printf("(p > 0) && (q > 0): %d\n", (p > 0) && (q > 0));
        printf("(p > 0) || (q > 0): %d\n", (p > 0) || (q > 0));
        printf("!(p > 0): %d\n", !(p > 0));
    }
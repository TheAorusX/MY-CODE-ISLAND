    #include <stdio.h>
    #include <math.h>

    int main() {
        char name[100];
        int age;
        printf("Enter your name: ");
        scanf("%s", name);
        printf("Hello, %s\n", name);
        printf("Enter your age: ");
        scanf("%d", &age);
        printf("You are %d years old.\n", age);
        printf("Enter two numbers: ");
        int a,b;
        scanf("%d %d", &a, &b);
        printf("Sum: %d\n", a + b);
        printf("Enter two numbers: ");
        int x, y;
        scanf("%d %d", &x, &y); 
        printf("Average: %d\n",((x+y)/2));
        printf("Length and breadth of rectangle");
        int ln,br;
        scanf("%d %d", &ln,&br);
        printf("Area of rectangle: %d\n",(ln*br));
        printf("Enter radius of circle: ");
        float r;
        scanf("%f",&r);
        printf("Area os circle: %f  And Circumference of circle: %f\n",(3.14*r*r),(2*3.14*r));
        printf("Enter principal,rate and time: ");
        float pr,ra,ti;
        scanf("%f %f %f",&pr,&ra,&ti);
        printf("Simple Interest: %f\n",((pr*ra*ti)/100));
        return 0;
    }
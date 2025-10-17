#include <stdio.h>
int main()
    {
        char ch;
        printf("Enter which day of week: ");
        scanf("%c", &ch);
        switch(ch)
        {
            case    '1':printf("Monday");
                        break;
            case    '2':printf("Tuesday");
                        break;
            case    '3':printf("Wednessday");
                        break;
            case    '4':printf("Thursday");
                        break;
            case    '5':printf("Friday");
                        break;
            case    '6':printf("Saturday");
                        break;
            case    '7':printf("Sunday");
                        break;
            default    :printf("INVALID ENTRY");
                        break;3
        }
    }
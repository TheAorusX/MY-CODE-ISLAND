#include <stdio.h>
int main()
{
    char ch;
    printf("Enter color charecter: ");
    scanf("%c", &ch);
    switch(ch)
    {
        case 'r'    :printf("RED");
                    break;
        case 'g'    :printf("GREEN");
                    break;
        case 'b'    :printf("BLUE");
                    break;
        default     :printf("INVALID INPUT!");
                    break;
    }
}
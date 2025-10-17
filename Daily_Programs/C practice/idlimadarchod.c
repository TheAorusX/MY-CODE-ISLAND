#include <stdio.h>
#include <string.h>
int main()
{
    char word[100];
    printf("Enter a string: ");
    scanf(" %s", &word);
    int n = strlen(word), i, c1 = 0, c2 = 0, c3 = 0;
    for(i = 0; i < n; i++)
    {
        char ch = word[i];
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
        c1++;
        else if (ch>='0' && ch<='9')
        c2++;
        else
        c3++;
    }
    printf("Alphabets: %d Digits: %d Others: %d",c1,c2,c3);
}
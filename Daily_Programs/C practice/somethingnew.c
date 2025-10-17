#include <stdio.h>
struct EMP
{
    int id;
    char name[20];
};
int main()
{
    struct EMP e={101,"Ayaan"};
    struct EMP *p=&e;
    printf("Details : %d, %s \n", e.id, e.name);
    printf("Details : %d, %s \n", p->id, p->name);
    return 0;
} 
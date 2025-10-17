#include <stdio.h>
int main()
{
    float basic=28000;
    float HRA=0.13*basic;
    float TA=0.11*basic;
    float DA=0.06*basic;
    float PF=0.08*basic;
    float ESI=0.03*basic;
    float total=basic+HRA+TA+DA-PF-ESI;
    printf("Basic Salary : %f",basic);
    printf("Total Salary : %f",total);
}
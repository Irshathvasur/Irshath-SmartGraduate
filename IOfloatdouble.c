#include<stdio.h>

int main()
{
    float num1;
    double num2;

    printf("Enter a float\n");
    scanf("%f",&num1);
    printf("Enter a double\n");
    scanf("%lf",&num2);

    printf("Float is %f",num1);
    printf("\nDouble is %lf",num2);
    return 0;
}
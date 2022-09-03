#include<stdio.h>

int main(){
    printf("Initializing c");
    int age=20;
    char name[5]="Eren";
    char c='a',cc=10;
    const double pi=3.141592;
    //pi=3.15;
    printf("\nThe pi value will always be %lf",pi);
    printf("\nThe size of int is %d.\nThe size of double is %d.",sizeof(age),sizeof(pi));
}

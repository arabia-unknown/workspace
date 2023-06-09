#include<stdio.h>
int main(void){
    long long int i, j, bit[64];
    double x;
    printf(" Input a number.\n");
    scanf("%lf", &x);
    printf("%lf -> ",x); j = *(long long int *)&x;
    for(i = 0; i <= 63; i++) bit[i] = (j>>i)& 1;
    for(i = 63; i >= 0; i--){
        printf("%d", bit[i]);
        if (i % 4 == 0) printf(" ");
    }
printf("\n"); return 0;
}

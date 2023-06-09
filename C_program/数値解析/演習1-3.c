#include<stdio.h>
int main(void){
    double a, b, c, d, eps = 1.0, x = 1.0 + eps; int i = 0;
    while (x > 1){
        i++;eps /= 2.0;x = 1.0 + eps;
    }eps *= 2.0; i--;
    printf(" eps = %11.4e (2^(%d))\n", eps, -i);
    a = 1.0 + eps;
    b = a -1.0;
    c = 1.0 + eps / 2.0;
    d = c -1.0;
    printf(" 1 + eps     -1 => %11.4e \n", b);
    printf(" 1 + eps / 2 -1 => %11.4e \n", d);
    return 0;
}

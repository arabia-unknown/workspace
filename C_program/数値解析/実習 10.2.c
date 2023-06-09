#include <stdio.h>
#include <math.h>

int main(void) {
    double y[100000],t[10000],PI=3.141592654;
    int i;

    y[0]=1;
    t[0]=0.0;


    for ( i=0; i<=100; i++) {

    y[i+1]=y[i]+(sqrt(t[i]+1)-y[i])*(0.01);
    t[i+1]=t[i]+(0.01);

    }
            printf("%lf", y[100] );
}

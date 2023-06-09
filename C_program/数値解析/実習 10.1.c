#include <stdio.h>
#include <math.h>

int main(void) {
    double y[100],t[100],PI=3.141592654;
    int i;

    y[0]=1;
    t[0]=0.0;


    for ( i=0; i<=10; i++) {

    y[i+1]=y[i]+cos(t[i])*y[i]*(2*PI/10);
    t[i+1]=t[i]+(2*PI/10);

    }
            printf("%lf", y[10] );
}

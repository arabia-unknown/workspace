#include<stdio.h>
#include<math.h>

int main(void)
{
    double x=3/5,y=1/3,X=0.77459666924148,a=0.69314718,F=0.0;

    printf("ê^íl=%lf",a);


    double A=1/(3-X),B=1/(3+X),C=1.0/3.0;
    printf("\n%lf",A);
    printf("\n%lf",B);
    printf("\n%lf",C);
    F=(3.0/5.0*A)+(8.0/9.0*(1.0/(3.0+C)))+(3.0/5.0*B);

    printf("\n%lf",F);

    printf("\nåÎç∑=%lf",F-a);
    return 0;
}

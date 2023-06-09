#include<stdio.h>
#include<math.h>

int main(void)
{
    int i;
    double h=(1.0/20.0),H,I=0.0,x=0.0,X=1.0,exp(x),E,E2,I_truth=1.125386083;


    E=exp(x);
    E2=exp(X);
    for(i=1;i<=19;i++){
        I+=(h*((exp(h*i))/(1+h*i)));
    }
    I+=(h/2.0)*(((exp(0.0))/1)+((exp(1.0))/2));



    printf("%lf",I);
    printf("\n^’l=%lf",I_truth);
    printf("\nŒë·=%lf",I-I_truth);

    return 0;
}

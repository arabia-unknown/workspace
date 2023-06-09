#include<stdio.h>
#include<math.h>

double f(double x)
{
    return x*x*x-2;
};
double d(double x)
{
    return 3*x*x;
};

main()
{
    double x0=2.0,x1,eps=4;
    while(eps>0){
        x1=x0-f(x0)/d(x0);
        x0=x1-f(x1)/d(x1);
        eps--;
    }
    printf("%lf",x1);
}

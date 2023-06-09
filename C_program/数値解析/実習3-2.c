#include<stdio.h>
#include<math.h>
double f(double x){
return x*x*x-2;
}
double d(double x){
return 3*x*x;
}

main()
{
    int x;
    double a=1.0,b=2.0,c,eps=0.00001;
    c=(a+b)/2.0;
    while(fabs(f(c))>eps){
        if(f(c)>0)
            b=c;
        else
            a=c;
        c=(a+b)/2.0;
    }
    printf("‰ð‚Í%f\n",c);
}

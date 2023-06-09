#include<stdio.h>
#define N 4

int main(void){
    int i,j;
    double xl[N]={1.03667,1.03946,1.04235,1.04534};
    double f[N]={0.27,0.28,0.29,0.30};
    double x=1.04,a,d[N];

    for(i=0;i<N;i++){
        d[i]=f[i];
    }
    for(j=1;j<N;j++){
        for(i=0;i<N-j;i++){
            d[i]=(d[i+1]-d[i])/(xl[i+j]-xl[i]);
        }
    }
    a=d[0];
    for(i=0;i<N;i++){
        a=(x-xl[i])*a+d[i];
    }
    printf("f(%.2lf)=%lf",x,a);

    return 0;
}

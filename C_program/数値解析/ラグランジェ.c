#include<stdio.h>
#define N 4

int main(void)
{
    int i,j;
    double x=1.04,l[N]={1,1,1,1},a[N]={0},ans=0;
    double x1[N]={1.03667,1.03946,1.04235,1.04534};

    double f[N]={0.27,0.28,0.29,0.30};


    for(j=0;j<N;j++){
        for(i=0;i<N;i++){
                if(x1[i]!=x1[j]){
            l[j]*=(x-x1[i])/(x1[j]-x1[i]);
                }
        }
        a[j]=f[j]*l[j];
        ans+=a[j];


    }

   printf("f(%.2lf)=%lf",x,ans);
   return 0;
  }

#include<stdio.h>
#define N 10000
int main(void)
{
    int i;
   float sum=0.0;

    for(i=N;i>=1.0;i-=1.0){
        sum+=1.0/(i*i);
    }
    printf("%f",sum);
    return 0;
}

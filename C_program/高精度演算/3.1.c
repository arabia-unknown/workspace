#include <stdio.h>
#include <math.h>

int main(void)
{
double n,pi=1,b=3;
int i;
scanf("%lf",&n);

double a=atan(1);
for(i=1;i<n;i++){
    if(i%2==0){
        pi+=1/b;
    }
    if(i%2==1){
        pi+=-1/b;
    }
    b+=2;
}

    printf("%lf",pi*4);

  return 0;
}

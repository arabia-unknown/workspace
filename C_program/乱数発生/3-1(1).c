#include<stdio.h>
int main(void)
{
int a,b,m,n;
int x[5];
a=3;
b=1;
m=7;

for(n=0;n<=5;n++)
{
x[0]=b;
x[n+1]=(a*x[n])%m;

printf("%d\n",x[n]);
}
}

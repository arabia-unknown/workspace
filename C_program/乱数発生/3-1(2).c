#include<stdio.h>
int main(void)
{
int a,b,m,n;
printf("a:");
scanf("%d",&a);
printf("b:");
scanf("%d",&b);
printf("m:");
scanf("%d",&m);
printf("n:");
scanf("%d",&n);

int x[n];
for(n=0;n<=5;n++)
{
x[0]=b;
x[n+1]=(a*x[n])%m;

printf("%d\n",x[n]);
}
}

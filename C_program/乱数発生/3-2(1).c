#include<stdio.h>
int main(void)
{
    int a,b,m,n,i;

    printf("a:");//12
    scanf("%d",&a);
    printf("b:");
    scanf("%d",&b);//5
    printf("m:");
    scanf("%d",&m);//101
    int x[20000];
    for(n=0;n<m;n++){
        x[0]=b;
        x[n+1]=(a*x[n])%m;
        printf("%d\n",x[n]);
        if(n>=1){
            if(x[n+1]==x[0]){
                break;
            }
        }
    }
    printf("[%d]\n",n+1);
}

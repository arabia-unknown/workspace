#include<stdio.h>
int main(void)
{
    int a,b,m,n,i;

    printf("a:");
    scanf("%d",&a);
    printf("b:");
    scanf("%d",&b);
    printf("m:");
    scanf("%d",&m);
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



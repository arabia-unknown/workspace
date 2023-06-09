#include<stdio.h>
int main(void)
{
    int a=12,b=5,m=101,n,c,y;

    printf("100ˆÈ‰º‚Ì©‘R”‚ğ“ü—Í:");
    scanf("%d",&c);

    int x[20000];
    for(n=0;n<=m;n++){
        x[0]=b;
        x[n+1]=(a*x[n])%m;
        if(n>=1){
            if(x[n]==x[0]){
                break;
            }
        }
    }
    y=(x[c]%6)+1;
    printf("‚³‚¢‚±‚ë‚Ì–Ú‚Í%d\n",y);
}

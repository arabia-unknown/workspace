#include<stdio.h>
int main(void)
{
    int a=12,b=5,m=101,n,c,y,s;

 // プレイヤーの入力を求める部分
    printf("あなたの手を入力してください(グー:1 チョキ:2 パー:3):");
    scanf("%d",&y);

    int x[20000];   //x[n]の最大値は20000
    for(n=0;n<=m;n++){
        x[0]=b;
        x[n+1]=(a*x[n])%m;
        if(n>=1){
            if(x[n]==x[0]){
                break;
            }
        }


    c = rand() % 3 + 1;

     // 　勝ち負け判定
     if(c == y){
       printf("あいこです\n");
     }else if(y == 1 && c == 2){
       printf("プレイヤーの勝ちです\n");
     }else if(y == 2 && c == 3){
       printf("プレイヤーの勝ちです\n");
     }else if(y == 3 && c == 1){
       printf("プレイヤーの勝ちです\n");
     }else{
       printf("コンピュータの勝ちです\n");
     }
 printf("このまま続けますか？続けない場合は 0 を,\n続ける場合は手を入力してください(グー:1 チョキ:2 パー:3):  ");
     scanf("%d", &s);
     if(s==0){
        break;
     }

    }
        return 0;
    }



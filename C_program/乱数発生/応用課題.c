#include <stdio.h>
 #include <stdlib.h>

 int main()
 {
   int n;
   int b; // プレイヤーの手の保存
   int c; // コンピュータの手を保存

   srand(0); // 乱数列を初期化

   do
   {
     // ①　プレイヤーの入力を求める部分
     printf("あなたの手を入力してください(グー:1 チョキ:2 パー:3) : ");
     scanf("%d", &b);

    // ②　コンピュータの手を計算する部分
     c = rand() % 3 + 1;

     // ③　勝ち負け判定
     if(c == b){
       printf("あいこです\n");
     }else if(b == 1 && c == 2){
       printf("プレイヤーの勝ちです\n");
     }else if(b == 2 && c == 3){
       printf("プレイヤーの勝ちです\n");
     }else if(b == 3 && c == 1){
       printf("プレイヤーの勝ちです\n");
     }else{
       printf("コンピュータの勝ちです\n");
     }

     // ④　続けるかどうかの入力
    printf("このまま続けますか？続けない場合は 0 を入力してください > ");
     scanf("%d", &n);

     // n が 0 以外だったら続ける
   }while(n != 0);

   return 0;
 }

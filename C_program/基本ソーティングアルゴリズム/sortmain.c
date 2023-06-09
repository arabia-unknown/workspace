// file : sortmain.c

// 実行方法....
//    program_name number < data_file
//    |            |        |
//    |            |        データファイル
//    |            データ数
//    プログラム名

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ARY_MAX 100000
// #define DEBUG

void sort(int ary[], int data_max);

main(int argc, char *argv[])
{
    int     ary[ARY_MAX+1];
    int     data_max;
    int     i;
    clock_t start, finish;
    double  duration;

  // データ数の設定
    sscanf(argv[1], "%d", &data_max);
    if(data_max>ARY_MAX) {
        printf("data number exceeds the array limit.\n");
	exit(0);
    }

  // データ読込み
    for(i=0; i<data_max; i++){
        scanf("%d", &ary[i]);
    }

#ifdef DEBUG // 初期データ表示（デバッグ用）
    printf("%5d: ", 0);
    for(i=0; i<data_max; i++) {
        printf("%5d ", ary[i]);
    }
    printf("\n");
#endif

  // 開始時刻記録
    start = clock();

  // ソーティング関数呼出し
    sort(ary, data_max);

  // 終了時刻記録
    finish = clock();

  // 実行時間の計算
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("execution time = %10.2f seconds\n", duration);

}

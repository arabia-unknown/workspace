#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define FNLEN 64		/* ファイル名の最大長 */
#define BUFLEN 256		/* 文字列読み込み用配列の長さ */

int main(void)
{
	FILE *fp;			/* 入力ファイル */
	char fn[FNLEN];		/* 入力ファイル名 */
	char buf[BUFLEN];		/* 入力文字列（ファイルから読み込むための配列） */
	char a[BUFLEN];
	int i, k, z, count = 0;
	fprintf(stderr, "Filename? : ");
	scanf("%s", fn);		/* ファイル名の入力 */
	scanf("%s", a);			/* 文字パターンの入力 */
	for (k = 0; k <= a[k]; k++){}	/* 文字パターン　文字数 */
	fp = fopen(fn, "r");		/* ファイルオープン */
	if (fp == NULL){
		/* ファイルオープンが失敗 */
		printf("ERROR: cannot file open (%s).\n", fn);
		exit(-1);
	}
	while (fgets(buf, BUFLEN, fp) != NULL){ /* ファイルから文字列を１行ずつ読み込む */
		count++;
		z = 0;
		while (buf[z + k] != '\0'){
			i = 0;
			/* printf("before: (z,i,k)=(%d,%d,%d)\n",z,i,k);*/
			while (buf[z + i] == a[i]){
				i++;
				if (k == i&&buf[z + i] == ' '&&buf[z - 1] == ' '||buf[z + i] == '\n'||(buf[z + i] == '\t'&&buf[z -1] == '\t')){
							printf("word:%s,line:%d\n", buf, count);
							printf("Word place:%d\n", z);
							break;
				}

			}
			/*rintf("after: (z,i,k)=(%d,%d,%d)\n",z,i,k);*/
			if (k == i&&buf[z + i] == ' '&&buf[z - 1] == ' ') break;
			z++;
		}
	}
	fclose(fp);		/* ファイルクローズ */
	return 0;
}

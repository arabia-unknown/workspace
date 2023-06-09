#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define FNLEN 64		/* ファイル名の最大長 */
#define BUFLEN 256		/* 文字列読み込み用配列の長さ */

int main ( void )
{
  FILE *fp;			/* 入力ファイル */
  char fn[FNLEN];		/* 入力ファイル名 */
  char buf[BUFLEN];		/* 入力文字列（ファイルから読み込むための配列） */
  char a[BUFLEN];
  int lena,lenbuf,i,j=0,k=0,n=0,count=0;
  lena = strlen(a);
  lenbuf = strlen(buf);
  fprintf(stderr,"Filename? : ");
  scanf("%s",fn);		/* ファイル名の入力 */
  scanf("%s",a);
  fp=fopen(fn,"r");		/* ファイルオープン */
  if( fp == NULL ){
    /* ファイルオープンが失敗 */
    printf("ERROR: cannot file open (%s).\n",fn);
    exit(-1);
  }
  while(fgets(buf,BUFLEN,fp)!=NULL){ /* ファイルから文字列を１行ずつ読み込む */
	for(i=0;i<lenbuf;i++){
		if(buf[j]==a[k]){
		j++;
		k++;
		if(k==lena){
			printf("見つかった");
			printf("%s\n",a);
			break;
		}
			}else{
				j=++n;
				k=0;
		}
		}
	if(k!=lena){
		printf("見つからない");
	}
		j=0,k=0,n=0;
  }
  fclose(fp);		/* ファイルクローズ */
  return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define FNLEN 64		/* �t�@�C�����̍ő咷 */
#define BUFLEN 256		/* ������ǂݍ��ݗp�z��̒��� */

int main ( void )
{
  FILE *fp;			/* ���̓t�@�C�� */
  char fn[FNLEN];		/* ���̓t�@�C���� */
  char buf[BUFLEN];		/* ���͕�����i�t�@�C������ǂݍ��ނ��߂̔z��j */
  char a[BUFLEN];
  int lena,lenbuf,i,j=0,k=0,n=0,count=0;
  lena = strlen(a);
  lenbuf = strlen(buf);
  fprintf(stderr,"Filename? : ");
  scanf("%s",fn);		/* �t�@�C�����̓��� */
  scanf("%s",a);
  fp=fopen(fn,"r");		/* �t�@�C���I�[�v�� */
  if( fp == NULL ){
    /* �t�@�C���I�[�v�������s */
    printf("ERROR: cannot file open (%s).\n",fn);
    exit(-1);
  }
  while(fgets(buf,BUFLEN,fp)!=NULL){ /* �t�@�C�����當������P�s���ǂݍ��� */
	for(i=0;i<lenbuf;i++){
		if(buf[j]==a[k]){
		j++;
		k++;
		if(k==lena){
			printf("��������");
			printf("%s\n",a);
			break;
		}
			}else{
				j=++n;
				k=0;
		}
		}
	if(k!=lena){
		printf("������Ȃ�");
	}
		j=0,k=0,n=0;
  }
  fclose(fp);		/* �t�@�C���N���[�Y */
  return 0;
}

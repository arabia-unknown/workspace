#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define FNLEN 64		/* �t�@�C�����̍ő咷 */
#define BUFLEN 256		/* ������ǂݍ��ݗp�z��̒��� */

int main(void)
{
	FILE *fp;			/* ���̓t�@�C�� */
	char fn[FNLEN];		/* ���̓t�@�C���� */
	char buf[BUFLEN];		/* ���͕�����i�t�@�C������ǂݍ��ނ��߂̔z��j */
	char a[BUFLEN];
	int i, k, z, count = 0;
	fprintf(stderr, "Filename? : ");
	scanf("%s", fn);		/* �t�@�C�����̓��� */
	scanf("%s", a);			/* �����p�^�[���̓��� */
	for (k = 0; k <= a[k]; k++){}	/* �����p�^�[���@������ */
	fp = fopen(fn, "r");		/* �t�@�C���I�[�v�� */
	if (fp == NULL){
		/* �t�@�C���I�[�v�������s */
		printf("ERROR: cannot file open (%s).\n", fn);
		exit(-1);
	}
	while (fgets(buf, BUFLEN, fp) != NULL){ /* �t�@�C�����當������P�s���ǂݍ��� */
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
	fclose(fp);		/* �t�@�C���N���[�Y */
	return 0;
}

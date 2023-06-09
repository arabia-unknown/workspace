// file : sortmain.c

// ���s���@....
//    program_name number < data_file
//    |            |        |
//    |            |        �f�[�^�t�@�C��
//    |            �f�[�^��
//    �v���O������

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

  // �f�[�^���̐ݒ�
    sscanf(argv[1], "%d", &data_max);
    if(data_max>ARY_MAX) {
        printf("data number exceeds the array limit.\n");
	exit(0);
    }

  // �f�[�^�Ǎ���
    for(i=0; i<data_max; i++){
        scanf("%d", &ary[i]);
    }

#ifdef DEBUG // �����f�[�^�\���i�f�o�b�O�p�j
    printf("%5d: ", 0);
    for(i=0; i<data_max; i++) {
        printf("%5d ", ary[i]);
    }
    printf("\n");
#endif

  // �J�n�����L�^
    start = clock();

  // �\�[�e�B���O�֐��ďo��
    sort(ary, data_max);

  // �I�������L�^
    finish = clock();

  // ���s���Ԃ̌v�Z
    duration = (double)(finish - start) / CLOCKS_PER_SEC;
    printf("execution time = %10.2f seconds\n", duration);

}

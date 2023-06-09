#include<stdio.h>
#include<string.h>
#define N 3

typedef struct
{
    char mt[100];
    int hei;
}member;

void swapint(int *x,int *y)
{
    double temp;
    temp=*x;
    *x=*y;
    *y=temp;
}

void swapstr(char sx[],char sy[])
{
    char temp[256];
    strcpy(temp,sx);
    strcpy(sx,sy);
    strcpy(sy,temp);
}

int main(void)
{
    member a[N];
    int i,j,hei;
    char filename[128],mt[128];
    FILE *fp;

    printf("Please choose a file:");
    scanf("%s",filename);

    if((fp=fopen(filename,"r"))==NULL){
        printf("Error.");
        return 0;
    }else{
        for(i=0;i<N;i++){
            fscanf(fp,"%s%d",a[i].mt,&a[i].hei);
            printf("%s %d\n",a[i].mt,a[i].hei);
        }

        for(i=0;i<N-1;i++){
            for(j=N-1;j>i;j--){
                if(a[j-1].hei>a[j].hei){
                    swapint(&a[j-1].hei,&a[j].hei);
                    swapstr(a[j-1].mt,a[j].mt);
                }
            }
        }

        printf("\n-sort-\n");
        for(i=0;i<N;i++){
            printf("%s %d\n",a[i].mt,a[i].hei);
        }
    }
return 0;
}

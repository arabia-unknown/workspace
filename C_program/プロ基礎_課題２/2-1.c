#include<stdio.h>
#define N 3

struct DataList{
char Name[20];
int Jap;
int Eng;
};

struct DataList Scan(int i){
    struct DataList seiseki;
    printf("No.%d\n",i+1);
    printf("Name is:");
    scanf("%s",seiseki.Name);
    printf("Japanese score is:");
    scanf("%d",&seiseki.Jap);
    printf("English score is:");
    scanf("%d",&seiseki.Eng);
    return seiseki;
    }

double Average(struct DataList *temp,int Judge){
    int a,sum=0;
    for(a=0;a<N;a++){
        if(Judge==0){
            sum+=(temp+a)->Eng;
        }
        if(Judge==1){
           sum+=(temp+a)->Jap;
           }
    }
        return (double)sum/N;
}

int main(void){
    struct DataList s[N];
    int j;

    for(j=0;j<N;j++){
        s[j]=Scan(j);
    }
    printf("\n-Score-\n");
    for(j=0;j<N;j++){
        printf("%s's score is",s[j].Name);
        printf("%d and %d.\n",s[j].Jap,s[j].Eng);
    }
    printf("\n-Average-\n");
    printf("Japanese: %.1f",Average(s,1));
    printf("English: %.1f",Average(s,0));
    return 0;
}

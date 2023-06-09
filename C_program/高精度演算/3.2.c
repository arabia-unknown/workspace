#include<stdio.h>
#define KETA 100
#define CN1 141
#define CN2 43

//多倍長加算：c←a-b
void add(int c[],const int a[],const int b[])
{
    int i,k=0;

    for(i=KETA-1;i>=0;i--){
        c[i]=a[i]+b[i]+k;
        if(c[i]>=10){
            c[i]-=10;
            k=1;
        }else{
            k=0;
            }
    }
}

//多倍長減算：c←a-b
void sub(int c[],int a[],const int b[])
{
    int i;

    for(i=KETA;i>=0;i--){
        if(a[i]<b[i]){
            a[i-1]-=1;
            a[i]+=10;
        }
        c[i]=a[i]-b[i];
    }
}

//多倍長除算；c←a÷b
void div(int c[],const int a[],int b)
{
    int i,k=0,temp;
    for(i=0;i<KETA;i++){
        temp=(a[i]+k*10)/b;
        k=(a[i]+k*10)%b;
        c[i]=temp;
    }
}

void by(int a[])
{
    int i,hako,sum=0;
    for(i=KETA-1;i>=0;i--){
        hako=(a[i]*4%10)+sum;
        sum=a[i]*4/10;
        a[i]=hako;
    }
}

//main()関数
int main(void)
{
    int yn[KETA+3],tn[KETA+3],pi[KETA+3];
    int cn,i=0,n=0;
    //pi[]の初期設定
    for(i=0;i<KETA;i++){
        pi[i]=0;
    }

    //16×arctan(1/5)の計算
    //yn[]の初期設定
    yn[0]=0;
    yn[1]=0;
    yn[2]=5;
    for(i=3;i<KETA;i++){
        yn[i]=0;
    }

    cn=1;
    do{
        //nが偶数であるときのtn[]を求め、pi[]に加える
        div(yn,yn,25);
        div(tn,yn,cn);
        by(tn);
        by(tn);
        add(pi,pi,tn);
        cn+=2; //cnを更新
        //nが奇数であるときのtn[]を求め、pi[]から引く
        div(yn,yn,25);
        div(tn,yn,cn);
        by(tn);
        by(tn);
        sub(pi,pi,tn);
        cn+=2; //cnを更新
    }while (cn<=CN1);

   //4×arctan(1/239)の計算；引き算するので「符号が逆」に注意
    //yn[]の初期設定
    yn[0]=2;
    yn[1]=3;
    yn[2]=9;
    for(i=3;i<KETA;i++){
        yn[i]=0;
    }

    cn=1;
    do{
        //nが偶数であるときのtn[]を求め、pi[]から引く
        div(yn,yn,57121);
        div(tn,yn,cn);
        by(tn);
        sub(pi,pi,tn);
        cn+=2;
        //n奇数であるときのtn[]を求め、pi[]に加える
        div(yn,yn,57121);
        div(tn,yn,cn);
        by(tn);
        add(pi,pi,tn);
        cn+=2;
    }while (cn<=CN2);

    //pi[]を整形して出力
    printf("円周率pi=%d.\n",pi[2]);
    for(i=3;i<KETA;i++){
        printf("%d",pi[i]);
        if((i-2)%10==0){
            printf(" ");
        }
        if((i-2)%50==0){
            printf("\n");
            }
    }
    return 0;
}

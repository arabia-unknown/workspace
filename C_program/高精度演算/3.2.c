#include<stdio.h>
#define KETA 100
#define CN1 141
#define CN2 43

//���{�����Z�Fc��a-b
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

//���{�����Z�Fc��a-b
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

//���{�����Z�Gc��a��b
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

//main()�֐�
int main(void)
{
    int yn[KETA+3],tn[KETA+3],pi[KETA+3];
    int cn,i=0,n=0;
    //pi[]�̏����ݒ�
    for(i=0;i<KETA;i++){
        pi[i]=0;
    }

    //16�~arctan(1/5)�̌v�Z
    //yn[]�̏����ݒ�
    yn[0]=0;
    yn[1]=0;
    yn[2]=5;
    for(i=3;i<KETA;i++){
        yn[i]=0;
    }

    cn=1;
    do{
        //n�������ł���Ƃ���tn[]�����߁Api[]�ɉ�����
        div(yn,yn,25);
        div(tn,yn,cn);
        by(tn);
        by(tn);
        add(pi,pi,tn);
        cn+=2; //cn���X�V
        //n����ł���Ƃ���tn[]�����߁Api[]�������
        div(yn,yn,25);
        div(tn,yn,cn);
        by(tn);
        by(tn);
        sub(pi,pi,tn);
        cn+=2; //cn���X�V
    }while (cn<=CN1);

   //4�~arctan(1/239)�̌v�Z�G�����Z����̂Łu�������t�v�ɒ���
    //yn[]�̏����ݒ�
    yn[0]=2;
    yn[1]=3;
    yn[2]=9;
    for(i=3;i<KETA;i++){
        yn[i]=0;
    }

    cn=1;
    do{
        //n�������ł���Ƃ���tn[]�����߁Api[]�������
        div(yn,yn,57121);
        div(tn,yn,cn);
        by(tn);
        sub(pi,pi,tn);
        cn+=2;
        //n��ł���Ƃ���tn[]�����߁Api[]�ɉ�����
        div(yn,yn,57121);
        div(tn,yn,cn);
        by(tn);
        add(pi,pi,tn);
        cn+=2;
    }while (cn<=CN2);

    //pi[]�𐮌`���ďo��
    printf("�~����pi=%d.\n",pi[2]);
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

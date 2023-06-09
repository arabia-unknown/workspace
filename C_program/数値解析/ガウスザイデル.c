#include<stdio.h>
#define N 3

int main(void)
{
    int i,j,k=0,epsilon=1.0e-4;
    double a[N][N]={{4,1,1},{1,4,1},{1,1,4}},
          b[N]={1,2,3},e,xx,x[N];

          for(i=0;i<N;i++){
            x[i]=0.0;
          }
          do
          {
              k=k+1;
              e=0.0;
              for(j=0;j<N;j++){
                  xx=b[j];

                for(i=0;i<N;i++){
                    if(i!=j){
                        xx=xx-a[j][i]*x[i];
                    }
                }

                xx=xx/a[j][j];
                e+=fabs(xx-x[j]);
                x[j]=xx;
              }


          }while(e>epsilon);
          for(i=0;i<N;i++)printf("%f\n",x[i]);
          return 0;

}

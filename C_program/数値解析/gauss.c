#include <stdio.h>
#define N 4

int main(void)
{

        double a[N][N+1]={{2.0,-4.0,3.0,-1.0,-2.0},
        {1.0,-2.0,2.0,1.0,1.0},
        {1.0,-5.0,4.0,-3.0,-8.0},
        {3.0,2.0,-2.0,-2.0,1.0}};
         int i,j,k,l,pivot;
        double x[N];
        double p,q,m,b[1][N+1];

        for(i=0;i<N;i++) {
                m=0;
                pivot=i;

                for(l=i;l<N;l++) {

                        if((a[l][i])>m) {
                                m=a[l][i];
                                pivot=l;
                        }
                }


                if(pivot!=i) {
                        for(j=0;j<N+1;j++) {
                                b[0][j]=a[i][j];
                                a[i][j]=a[pivot][j];
                                a[pivot][j]=b[0][j];
                        }
                }
        }

        for(k=0;k<N;k++) {
                p=a[k][k];
                a[k][k]=1;

                for(j=k+1;j<N+1;j++) {
                        a[k][j]/=p;
                }

                for(i=k+1;i<N;i++) {
                        q=a[i][k];

                        for(j=k+1;j<N+1;j++) {
                                a[i][j]-=q*a[k][j];
                        }

                a[i][k]=0;
                }
        }
        for(i=N-1;i>=0;i--) {
                x[i]=a[i][N];
                for(j=N-1;j>i;j--) {
                        x[i]-=a[i][j]*x[j];
                }
        }
        printf("answer\n");
        for(i=0;i<N;i++) {
                printf("%f\n",x[i]);
        }
    return 0;
}

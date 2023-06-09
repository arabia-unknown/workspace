#include <stdio.h>
void lsm(double x[],double y[], int N, double *a0, double *a1)
{
        int i;
        double A00=0 ,A01=0, A02=0, A11=0, A12=0;

        for (i=0;i<N;i++) {
                A00+=1.0;
                A01+=x[i];
                A02+=y[i];
                A11+=x[i]*x[i];
                A12+=x[i]*y[i];
        }

        *a0 = (A02*A11-A01*A12) / (A00*A11-A01*A01);
        *a1 = (A00*A12-A01*A02) / (A00*A11-A01*A01);
}

int main()
{
        double x[]={1,2,3,4,5,6,7,8,9,10,11};
        double y[]={0.00,0.60,1.77,1.92,3.31,3.52,4.59,5.31,5.79,7.06,7.50};
        double a0 = 0,a1 = 0;
        int N=11;




        lsm(x, y, N, &a0, &a1);

        printf("a0=%f\na1=%f", a0, a1);


        return 0;
}




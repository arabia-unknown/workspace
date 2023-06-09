#include<stdio.h>
#define n 3

int main(void){
int i,j,k;

double a[n][n]={{4,1,1},
                    {1,4,1},
                    {1,1,4}};
double b[n]={1,2,3};
double u[n][n],l[n][n],x[n],y[n];
double bly = 0;
double yux = 0;

for(i=0;i<n;i++){
    for( j = 0; j < n; j++ ){
        if( i == j ){ l[i][j] = 1;
        }
        else{ l[i][j] = 0;
        }
        u[i][j] = a[i][j];
    }

}
for( i = 0; i < n; i++ ){
    for( j = i+1; j < n; j++ ){
        l[j][i] = u[j][i] / u[i][i];

            for( k = i+1; k < n; k++ ){
            u[j][k] = u[j][k] - u[i][k] * l[j][i];

        }
    }
    }
    printf("下三角行列　L\n");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("l[%d][%d]%lf",j,i,l[j][i]);
        }
        printf("\n");
    }
    printf("上三角行列　U\n");
        for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("u[%d][%d]%lf",j,i,u[j][i]);
        }
        printf("\n");
    }
for(i=0;i<n;i++){
		y[i]=b[i];
	}
	for(i=0;i<n;i++){
		y[i]/=l[i][i];
		for(j=i+1;j<n;j++){
			y[j]-=y[i]*l[j][i];
		}
	}
for(i=0;i<n;i++){
		x[i]=y[i];
	}
	for(i=n-1;i>=0;i--){
		x[i]/=u[i][i];
		for(j=i-1;j>=0;j--){
			x[j]-=x[i]*u[j][i];
		}
	}
	printf("解\n");
        printf("x=%lf",x[0]);
        printf("y=%lf",x[1]);
        printf("z=%lf",x[2]);

    return 0;
}

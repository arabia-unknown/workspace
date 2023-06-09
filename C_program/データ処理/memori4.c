#include<stdio.h>
#include<math.h>
int main(void)
{
    double  all,ave,sum,ohm,bunsan,a[6][2]={{0.00,0.00},
        {2.00,7.50},
    {4.00,14.60},
    {6.00,22.10},
    {8.00,29.2},
    {10.0,37.0}};
    int n,m;
    sum=0,all=0;
printf("   ****　memori  4 ****\n");
printf("--------------------------\n");
printf("   V[V]    I[mA]   R[Ohm]  \n");
printf("--------------------------\n");
for(n=0;n<=5;n++){
for(m=0;m<=1;m++){
    printf("  %6.2f",a[n][m]);


}
if(a[n][1]==0){
    printf("     ----");
    }else{
ohm=a[n][0]/a[n][1]*1000;//電圧/電流[mA]*1000
 printf("    %3.2f",ohm);
 sum+=ohm;                      //合計値計算
all+=ohm*ohm;                 //分散・標準偏差計算に必要な2乗の合計
    }
printf("\n");
}
ave=sum/(n-1);      //抵抗の総データの平均
bunsan=all/(n-1)-(ave*ave);
printf("--------------------------\n");
printf("            Heikin %.2f\n",ave);        //平均値出力
printf("==========================\n");
printf("Bunsan              %.2f    \n",bunsan);        //分散出力
printf("-------------------------\n");
printf("Hyoujunhensa        %.2f\n",sqrt(bunsan));      //標準偏差出力
printf("-------------------------\n");

return 0;

}

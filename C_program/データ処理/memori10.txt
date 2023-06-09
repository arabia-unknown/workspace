#include<stdio.h>
#include<math.h>
int main(void)
{
    double  all,ave,sum,ohm,bunsan,a[6][2]={{0.00,0.00},
        {2.00,2.90},
    {4.00,5.60},
    {6.00,8.50},
    {8.00,11.50},
    {10.0,14.40}};
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
ohm=a[n][0]/a[n][1]*1000;       //電圧/電流[mA]*1000
 printf("    %3.2f",ohm);        //合計値計算
 sum+=ohm;      //分散・標準偏差計算に必要な2乗の合計
all+=ohm*ohm;
    }
printf("\n");
}
ave=sum/(n-1);       //抵抗の総データの平均
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

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
printf("   ****�@memori  4 ****\n");
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
ohm=a[n][0]/a[n][1]*1000;//�d��/�d��[mA]*1000
 printf("    %3.2f",ohm);
 sum+=ohm;                      //���v�l�v�Z
all+=ohm*ohm;                 //���U�E�W���΍��v�Z�ɕK�v��2��̍��v
    }
printf("\n");
}
ave=sum/(n-1);      //��R�̑��f�[�^�̕���
bunsan=all/(n-1)-(ave*ave);
printf("--------------------------\n");
printf("            Heikin %.2f\n",ave);        //���ϒl�o��
printf("==========================\n");
printf("Bunsan              %.2f    \n",bunsan);        //���U�o��
printf("-------------------------\n");
printf("Hyoujunhensa        %.2f\n",sqrt(bunsan));      //�W���΍��o��
printf("-------------------------\n");

return 0;

}

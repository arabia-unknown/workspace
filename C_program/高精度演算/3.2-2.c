#include<stdio.h>
#define SIZE 304 //600桁求める

short	a[SIZE],x[SIZE]//乗数
		,b[SIZE]//分母
		,c[SIZE]//分子
		,ans[SIZE]
		,ans2[SIZE]
		,pos[SIZE]
		,pos2[SIZE]
		,val_2[SIZE]={2}// 2
		,val_4[SIZE]={4};// 4

int main(){
	int i;
	int flag=0;//引き算/足し算を交互に行うフラグ

	b[0]=1;//分母
	c[SIZE-1]=1;//分子
	x[0]=5;//乗数
	for(i=0;i<SIZE;i++) a[i]=x[i];
	div(c,x,ans,SIZE);
	for(i=0;i<SIZE;i++) c[i]=0;c[SIZE-1]=1;//割り算により分子の内容が破壊されるため再設定

	do{
		mul(a,x,pos2,SIZE);
		mul(x,pos2,a,SIZE);
		add(b,val_2,b,SIZE);
		mul(b,a,pos2,SIZE);

		div(c,pos2,pos,SIZE);
		for(i=0;i<SIZE;i++) c[i]=0;c[SIZE-1]=1;//割り算により分子の内容が破壊されるため再設定

		if(flag=(!flag)){
			sub(ans,pos,ans,SIZE);
		}else{
			add(ans,pos,ans,SIZE);
		}
	}while(cmp0(pos,SIZE)!=0);


	flag=0;//引き算/足し算を交互に行うフラグ

	for(i=0;i<SIZE;i++){ c[i]=0;x[i]=0;b[i]=0;}
	b[0]=1;//分母
	c[SIZE-1]=1;//分子
	x[0]=39;//乗数
	x[1]=2;
	for(i=0;i<SIZE;i++) a[i]=x[i];
	div(c,x,ans2,SIZE);
	for(i=0;i<SIZE;i++) c[i]=0;c[SIZE-1]=1;//割り算により分子の内容が破壊されるため再設定

	do{
		mul(a,x,pos2,SIZE);
		mul(x,pos2,a,SIZE);
		add(b,val_2,b,SIZE);
		mul(b,a,pos2,SIZE);

		div(c,pos2,pos,SIZE);
		for(i=0;i<SIZE;i++) c[i]=0;c[SIZE-1]=1;//割り算により分子の内容が破壊されるため再設定

		if(flag=(!flag)){
			sub(ans2,pos,ans2,SIZE);
		}else{
			add(ans2,pos,ans2,SIZE);
		}
	}while(cmp0(pos,SIZE)!=0);

	mul(ans,val_4,pos,SIZE);
	sub(pos,ans2,pos,SIZE);
	mul(pos,val_4,pos2,SIZE);


	dp_print(pos2,SIZE,3);//誤差が生じるため下6桁を切り捨てて固定小数点形式で表示
	printf("\n");

	return 0;
}


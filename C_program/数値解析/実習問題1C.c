#include<stdio.h>
#include<math.h>


void taylor(int x){
	float i,j, t, s,x2;
	i = 2.0;
	j = 3.0;
	t = x;
	x2 = -x*x;
	s = 0.0;
	s += t;


	do{
		t = t*x2 /(j*i) ;
		s += t;
		i=i+2;
		j = j + 2;
	} while (t > 0.00000001);
	printf("%f\n", s);
	return;
}

int main(void){
	taylor(1);
	taylor(10);
	taylor(20);
	printf("%f\n",sin(1));
	printf("%f\n",sin(10));
	printf("%f\n",sin(20));
	return 0;
}

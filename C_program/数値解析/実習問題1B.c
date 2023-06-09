#include<stdio.h>
#include<math.h>


void taylor(int x){
	float i, t, s;
	i = 1.0;
	t = 1.0;
	s = t;


	do{
		t = t*x / i;
		s = s + t;
		i++;
	} while (t > 0.00000001);
	printf("%f\n", s);
	return;
}

int main(void){
	taylor(-10);
	taylor(-20);
	taylor(-50);
	printf("%f\n",exp(-10));
	printf("%f\n",exp(-20));
	printf("%f\n",exp(-50));
	return 0;
}

#include<stdio.h>
#include<math.h>

int main(void){
	int x;
	float i, t, s;
	i = 1.0;
	t = 1.0;
	s = t;
	x = 10;

	do{
		t = t*x / i;
		s = s + t;
		i++;
	} while (t > 0.00000001);
	printf("%f\n", s);
	printf("%f",exp(10));
	return 0;
}

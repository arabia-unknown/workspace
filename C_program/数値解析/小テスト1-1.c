#include<stdio.h>
int main(void){
float x;
for(x=0.0;x<=1.0;x+=0.1){
    printf("%20.15f\n",x);
}
return 0;
}

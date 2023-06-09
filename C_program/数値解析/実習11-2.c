#include <stdio.h>
#include <math.h>

double f1(double t,double x,double y);
double f2(double t,double x,double y);

int main(void)
{
        double t,x,y,z,dt,tmax;
        double k0[3],k1[3],k2[3],k3[3];

        dt=0.01;
        tmax=1.0;
        x=3.0;
        y=4.0;              //‰Šú’l

        FILE *output;
        output=fopen("output2.data","w");

        for(t=0.0;t<tmax;t+=dt) {
                k0[0]=f1(t,x,y);
                k0[1]=f2(t,x,y);


                k1[0]=f1(t+dt/2.0,x+k0[0]/2.0,y+k0[1]/2.0);
                k1[1]=f2(t+dt/2.0,x+k0[0]/2.0,y+k0[1]/2.0);


                k2[0]=f1(t+dt/2.0,x+k1[0]/2.0,y+k1[1]/2.0);
                k2[1]=f2(t+dt/2.0,x+k1[0]/2.0,y+k1[1]/2.0);


                k3[0]=f1(t+dt,x+k2[0],y+k2[1]);
                k3[1]=f2(t+dt,x+k2[0],y+k2[1]);


                x=x+dt*(k0[0]+2.0*k1[0]+2.0*k2[0]+k3[0])/6.0;
                y=y+dt*(k0[1]+2.0*k1[1]+2.0*k2[1]+k3[1])/6.0;
                fprintf(output,"%f %f %f\n",x,y);

        }

        fclose(output);

        return 0;
}

double f1(double t,double x,double y)
{
        double r;

        r=y;

        return r;
}

double f2(double t,double x,double y)
{
        double r;

        r=-2*x+3*y;

        return r;
}


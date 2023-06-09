import java.util.Random;

public class S7018903_RandomTest {

    public static void main(String[] args) {

    Random rnd = new Random();
    int i_data=0,t=0,f=0;
    double dbl_data=0.0,averageI=0.0,averageD=0.0,sum;
    boolean bl_data=false;
        System.out.println("int?^?????");
        sum=0;
        for(int i=0; i<10; i++) {
            i_data = rnd.nextInt(100);
            System.out.println(i_data);
            sum+=i_data;
        }
        averageI=sum/10;
        System.out.println("int????l="+averageI);
        System.out.println(" ");

    // double?^???????10????????A?\?????
        sum=0;
        System.out.println("double?^?????");
        for(int i=0; i<10; i++) {
            dbl_data = rnd.nextDouble();
            System.out.println(dbl_data);
            sum+=dbl_data;
        }
        averageD=sum/10;
        System.out.println("double????l="+averageD);
        System.out.println(" ");


        // boolean?^???????10????????A?\?????
        System.out.println("boolean?^?????");
        for(int i=0; i<10; i++) {
            bl_data = rnd.nextBoolean();
            System.out.println(bl_data);
            if(bl_data==true){
                t+=1;
            }else{
                f+=1;
            }
        }
        System.out.println("true="+t+"false="+f);

    }
}
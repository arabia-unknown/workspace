import java.util.Random;

public class S7018903_kadai2_2 {

    public static void main(String[] args) {

    Random rnd = new Random();
    double dbl_data=0.0,averageD=0.0,sum,min=1.0,max=0.0;
        sum=0;
        System.out.println("double型の乱数");
        for(int i=0; i<100; i++) {
            dbl_data = rnd.nextDouble();
            System.out.println(dbl_data);
            sum+=dbl_data;
            min=Math.min(min,dbl_data);
            max=Math.max(max,dbl_data);
        }
        averageD=sum/100;

        System.out.println("最小値="+min);
        System.out.println("最大値="+max);
        System.out.println("double平均値="+averageD);

    }
}
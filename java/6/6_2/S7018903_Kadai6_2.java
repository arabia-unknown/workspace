//7018903 堀井萌希
import java.util.Scanner;
import java.util.*; 
import java.util.Iterator;
public class S7018903_Kadai6_2 {
    public static void main(String[] args) {
        ArrayList<Double> NUM1 = new ArrayList<Double>();
        LinkedList<Double> NUM2 = new LinkedList<Double>();
        //データ数入力
        Scanner a = new Scanner(System.in);
        int data = a.nextInt();
        double b[] = new double[data];

        long long1 = System.nanoTime();
        //ArrayListの書き込み
        for(int i=0;i<data;i++){
            double num = Math.random();
            b[i] = num;
            NUM1.add(b[i]);
        }
        long long2 = System.nanoTime();

        long long3 = System.nanoTime();
        //ArrayListの読み込み
        for(int i=0;i<NUM1.size();i++){
            NUM1.get(i);
            //System.out.println(re);
        }
        long long4 = System.nanoTime();

        long long5 = System.nanoTime();
        //ArrayListの削除
        Iterator<Double> it = NUM1.iterator();
        while(it.hasNext()){
            Double value = (double)it.next();
            it.remove();
        }
        long long6 = System.nanoTime();

        long long7 = System.nanoTime();
        //LinkedListの書き込み
        for(int i=0;i<data;i++){
            double num = Math.random();
            b[i] = num;
            NUM2.add(b[i]);
        }
        long long8 = System.nanoTime();

        long long9 = System.nanoTime();
        //LinkedListの読み込み
        for(int i=0;i<NUM2.size();i++){
            NUM2.get(i);
            //System.out.println(re);
        }
        long long10 = System.nanoTime();

        long long11 = System.nanoTime();
        //LinkedListの削除
        Iterator<Double> itt = NUM2.iterator();
        while(itt.hasNext()){
            Double value2 = (double)itt.next();
            itt.remove();
        }
        long long12 = System.nanoTime();



        System.out.println("ArrayList(データ数:"+data+")の書き込み時間:" + (long2 - long1)/1000000 + "[ms]");
        System.out.println("ArrayList(データ数:"+data+")の読み込み時間:" + (long4 - long3)/1000000 + "[ms]");
        System.out.println("ArrayList(データ数:"+data+")の削除時間:" + (long6 - long5)/1000000 + "[ms]");
        System.out.println("LinkedList(データ数:"+data+")の書き込み時間:" + (long8 - long7)/1000000 + "[ms]");
        System.out.println("LinkedList(データ数:"+data+")の読み込み時間:" + (long10 - long9)/1000000 + "[ms]");
        System.out.println("LinkedList(データ数:"+data+")の削除時間:" + (long12 - long11)/1000000 + "[ms]");


    }
}
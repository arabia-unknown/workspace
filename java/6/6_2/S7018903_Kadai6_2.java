//7018903 �x��G��
import java.util.Scanner;
import java.util.*; 
import java.util.Iterator;
public class S7018903_Kadai6_2 {
    public static void main(String[] args) {
        ArrayList<Double> NUM1 = new ArrayList<Double>();
        LinkedList<Double> NUM2 = new LinkedList<Double>();
        //�f�[�^������
        Scanner a = new Scanner(System.in);
        int data = a.nextInt();
        double b[] = new double[data];

        long long1 = System.nanoTime();
        //ArrayList�̏�������
        for(int i=0;i<data;i++){
            double num = Math.random();
            b[i] = num;
            NUM1.add(b[i]);
        }
        long long2 = System.nanoTime();

        long long3 = System.nanoTime();
        //ArrayList�̓ǂݍ���
        for(int i=0;i<NUM1.size();i++){
            NUM1.get(i);
            //System.out.println(re);
        }
        long long4 = System.nanoTime();

        long long5 = System.nanoTime();
        //ArrayList�̍폜
        Iterator<Double> it = NUM1.iterator();
        while(it.hasNext()){
            Double value = (double)it.next();
            it.remove();
        }
        long long6 = System.nanoTime();

        long long7 = System.nanoTime();
        //LinkedList�̏�������
        for(int i=0;i<data;i++){
            double num = Math.random();
            b[i] = num;
            NUM2.add(b[i]);
        }
        long long8 = System.nanoTime();

        long long9 = System.nanoTime();
        //LinkedList�̓ǂݍ���
        for(int i=0;i<NUM2.size();i++){
            NUM2.get(i);
            //System.out.println(re);
        }
        long long10 = System.nanoTime();

        long long11 = System.nanoTime();
        //LinkedList�̍폜
        Iterator<Double> itt = NUM2.iterator();
        while(itt.hasNext()){
            Double value2 = (double)itt.next();
            itt.remove();
        }
        long long12 = System.nanoTime();



        System.out.println("ArrayList(�f�[�^��:"+data+")�̏������ݎ���:" + (long2 - long1)/1000000 + "[ms]");
        System.out.println("ArrayList(�f�[�^��:"+data+")�̓ǂݍ��ݎ���:" + (long4 - long3)/1000000 + "[ms]");
        System.out.println("ArrayList(�f�[�^��:"+data+")�̍폜����:" + (long6 - long5)/1000000 + "[ms]");
        System.out.println("LinkedList(�f�[�^��:"+data+")�̏������ݎ���:" + (long8 - long7)/1000000 + "[ms]");
        System.out.println("LinkedList(�f�[�^��:"+data+")�̓ǂݍ��ݎ���:" + (long10 - long9)/1000000 + "[ms]");
        System.out.println("LinkedList(�f�[�^��:"+data+")�̍폜����:" + (long12 - long11)/1000000 + "[ms]");


    }
}
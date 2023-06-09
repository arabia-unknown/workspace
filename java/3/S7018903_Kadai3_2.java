//7018903 堀井萌希
import java.io.*;
public class S7018903_Kadai3_2 {
    static double sqr( double x ){

        return x * x;//2乗の計算

    }
    public static void main(String[] args) {
        
        try {
            File file = new File("Data3-2.txt"); // 読み込むファイルを指定
            // FileReaderをラップしたBufferedReaderのインスタンスを生成
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;
            int sum=0,N=0;
            double ssum =0.0,pp=0.0,variance;
            int data[] =new int[1000];
            int intmax = data[0];
            int intmin = data[0];
            while((s=br.readLine()) != null) {//全数値の合計値の計算と最大最小値の判定
                int i = Integer.parseInt(s);
                data[N]=i;
                if(intmax < data[N]){//最大値の判定
                    intmax = data[N];
                }
                if(intmin > data[i]) {//最小値の判定
                    intmin = data[i];
                }
                sum+=i;//合計値
                N++;//要素数
            }
            pp=(double)sum/N;//平均値の計算
            for(int i=0;i<N;i++)
            {
                ssum+=sqr(data[i]-pp);//２乗和
            }
            variance = ssum/N;//分散
            System.out.println("最大値 : " + intmax);
            System.out.println("最小値 : " + intmin);
            System.out.println("平均値 : " + Math.round( pp*100.0 )/100.0);
            System.out.println("分散 = : " + String.format("%.2f", variance));
            double sd = Math.sqrt(variance);//標準偏差
            System.out.println("標準偏差 = : " + Math.round( sd*100.0 )/100.0);
            br.close(); // ファイルを閉じる
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}

//7018903 堀井萌希
import java.io.*;
public class S7018903_Kadai3_1 {
    public static void main( String[] args ) {
        double h, w, bmi,apw;

        try {
            // BufferedReaderのインスタンスを生成
            BufferedReader br
            = new BufferedReader( new InputStreamReader(System.in) );

            System.out.println( "BMI指数の判定プログラムです" );
            System.out.print( "身長(cm) を指定してください: " );
            h = Double.parseDouble( br.readLine() );// データ(身長)読み込み
            System.out.print( "体重(kg) を指定してください: " );
            w = Double.parseDouble( br.readLine() );// データ(体重）読み込み

            h *= 0.01;  // cm --> m
            bmi = w / (h*h);//bmiの計算
            apw = (h*h)*22;//適正体重の計算

            System.out.println( "BMI指数は " + Math.round( bmi*10.0 )/10.0 );
            System.out.println( "適正体重は " + Math.round( apw*10.0 )/10.0 );
            br.close();
        } catch( Exception e ) {
            System.out.println( "例外が発生しました: " + e );
        }
    }
}
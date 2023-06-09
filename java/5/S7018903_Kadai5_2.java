//7018903 堀井萌希
import java.util.Scanner;
import s7018903_conversion.S7018903_LengthConversion;

public class S7018903_Kadai5_2 {
    public static void main( String[] args ) {
        double km;//長さ[km]

        // キーボード入力
        Scanner scanner = new Scanner(System.in);
        // kmの入力
        System.out.print( "長さ[km]：" );
        km = scanner.nextDouble();

        S7018903_LengthConversion m = new S7018903_LengthConversion();
        
        m.print(km);
    }
}
//7018903 �x��G��
import java.util.Scanner;
import s7018903_conversion.S7018903_LengthConversion;

public class S7018903_Kadai5_2 {
    public static void main( String[] args ) {
        double km;//����[km]

        // �L�[�{�[�h����
        Scanner scanner = new Scanner(System.in);
        // km�̓���
        System.out.print( "����[km]�F" );
        km = scanner.nextDouble();

        S7018903_LengthConversion m = new S7018903_LengthConversion();
        
        m.print(km);
    }
}
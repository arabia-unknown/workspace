//7018903 �x��G��
import java.util.Scanner;

public class S7018903_Kadai5_1 {
    public static void main( String[] args ) {
        double r;	// ���a
        double area;	// �ʐ�
        double P = 3.1415926;

        // �L�[�{�[�h����
        Scanner scanner = new Scanner(System.in);

        // ���a�̓���
        System.out.print( "�~�̒��a�F" );
        r = scanner.nextDouble();

        // �~�̖ʐόv�Z ((���a/2)�~(���a/2)�~�~����)
        area = (r/2) * (r/2) * P;

        // �~�̖ʐς�\��
        System.out.println( "�~�̖ʐρF" + Math.round( area*100.0 )/100.0 );
    }
    
}
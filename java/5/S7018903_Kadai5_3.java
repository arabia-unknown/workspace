//7018903 �x��G��
import java.util.Scanner;
public class S7018903_Kadai5_3 {
    public static void main( String[] args ) {
        double rad;//���W�A��
        double deg;//�p�x
        double r;//���a
        double area;//�~�̖ʐ�
        double S;//��`�̖ʐ�

        Scanner scanner = new Scanner(System.in);
        // �p�x�̓���
        System.out.print( "�p�x(�x)�F" );
        deg = scanner.nextDouble();

        rad = s7018903_conversion.S7018903_PiRad.print(deg);

        //���a�̓���
        System.out.print( "���a�F" );
        r = scanner.nextDouble();

        area = s7018903_calcarea.S7018903_Circle.print(r);

        //��`�̖ʐς����߂�
        S =area * rad/(2*Math.PI);
        System.out.println( "��`�̖ʐρF " + Math.round( S * 100.0 ) / 100.0 );

    }    
}
//7018903 �x��G��
import java.io.*;
public class S7018903_Kadai3_1 {
    public static void main( String[] args ) {
        double h, w, bmi,apw;

        try {
            // BufferedReader�̃C���X�^���X�𐶐�
            BufferedReader br
            = new BufferedReader( new InputStreamReader(System.in) );

            System.out.println( "BMI�w���̔���v���O�����ł�" );
            System.out.print( "�g��(cm) ���w�肵�Ă�������: " );
            h = Double.parseDouble( br.readLine() );// �f�[�^(�g��)�ǂݍ���
            System.out.print( "�̏d(kg) ���w�肵�Ă�������: " );
            w = Double.parseDouble( br.readLine() );// �f�[�^(�̏d�j�ǂݍ���

            h *= 0.01;  // cm --> m
            bmi = w / (h*h);//bmi�̌v�Z
            apw = (h*h)*22;//�K���̏d�̌v�Z

            System.out.println( "BMI�w���� " + Math.round( bmi*10.0 )/10.0 );
            System.out.println( "�K���̏d�� " + Math.round( apw*10.0 )/10.0 );
            br.close();
        } catch( Exception e ) {
            System.out.println( "��O���������܂���: " + e );
        }
    }
}
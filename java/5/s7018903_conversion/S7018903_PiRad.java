//7018903 �x��G��
package s7018903_conversion;

public class S7018903_PiRad {
    public static double print(double n){
        //�p�x�����W�A���ɕϊ�
        double ans = Math.toRadians(n);
        System.out.println( "���W�A���F" + Math.round( ans * 100.0 )/100.0 );
        return ans;
    }
}
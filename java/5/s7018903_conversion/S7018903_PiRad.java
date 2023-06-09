//7018903 堀井萌希
package s7018903_conversion;

public class S7018903_PiRad {
    public static double print(double n){
        //角度をラジアンに変換
        double ans = Math.toRadians(n);
        System.out.println( "ラジアン：" + Math.round( ans * 100.0 )/100.0 );
        return ans;
    }
}
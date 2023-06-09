//7018903 –xˆä–GŠó
import java.util.Scanner;
public class S7018903_Kadai5_3 {
    public static void main( String[] args ) {
        double rad;//ƒ‰ƒWƒAƒ“
        double deg;//Šp“x
        double r;//”¼Œa
        double area;//‰~‚Ì–ÊÏ
        double S;//îŒ`‚Ì–ÊÏ

        Scanner scanner = new Scanner(System.in);
        // Šp“x‚Ì“ü—Í
        System.out.print( "Šp“x(“x)F" );
        deg = scanner.nextDouble();

        rad = s7018903_conversion.S7018903_PiRad.print(deg);

        //”¼Œa‚Ì“ü—Í
        System.out.print( "”¼ŒaF" );
        r = scanner.nextDouble();

        area = s7018903_calcarea.S7018903_Circle.print(r);

        //îŒ`‚Ì–ÊÏ‚ğ‹‚ß‚é
        S =area * rad/(2*Math.PI);
        System.out.println( "îŒ`‚Ì–ÊÏF " + Math.round( S * 100.0 ) / 100.0 );

    }    
}
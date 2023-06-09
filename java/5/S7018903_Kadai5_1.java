//7018903 –xˆä–GŠó
import java.util.Scanner;

public class S7018903_Kadai5_1 {
    public static void main( String[] args ) {
        double r;	// ’¼Œa
        double area;	// –ÊÏ
        double P = 3.1415926;

        // ƒL[ƒ{[ƒh“ü—Í
        Scanner scanner = new Scanner(System.in);

        // ’¼Œa‚Ì“ü—Í
        System.out.print( "‰~‚Ì’¼ŒaF" );
        r = scanner.nextDouble();

        // ‰~‚Ì–ÊÏŒvZ ((’¼Œa/2)~(’¼Œa/2)~‰~ü—¦)
        area = (r/2) * (r/2) * P;

        // ‰~‚Ì–ÊÏ‚ğ•\¦
        System.out.println( "‰~‚Ì–ÊÏF" + Math.round( area*100.0 )/100.0 );
    }
    
}
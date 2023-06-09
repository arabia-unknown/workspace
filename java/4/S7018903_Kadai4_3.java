//7018903 堀井萌希
import java.util.Scanner;
public class S7018903_Kadai4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("文字列を入力:");
        String str = scan.nextLine();
        System.out.print("シフトする数を入力:");
        int a = scan.nextInt();

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            S7018903_CaesarCipher char1 = new S7018903_CaesarCipher(c,a,str);
            showCharData(char1);
            
        }
        
        
        }
        //データ表示用メソッド
        static void showCharData(S7018903_CaesarCipher char1) {
        System.out.print(char1.getCipher());
        }
}
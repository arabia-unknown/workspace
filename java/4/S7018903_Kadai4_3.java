//7018903 �x��G��
import java.util.Scanner;
public class S7018903_Kadai4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("����������:");
        String str = scan.nextLine();
        System.out.print("�V�t�g���鐔�����:");
        int a = scan.nextInt();

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            S7018903_CaesarCipher char1 = new S7018903_CaesarCipher(c,a,str);
            showCharData(char1);
            
        }
        
        
        }
        //�f�[�^�\���p���\�b�h
        static void showCharData(S7018903_CaesarCipher char1) {
        System.out.print(char1.getCipher());
        }
}
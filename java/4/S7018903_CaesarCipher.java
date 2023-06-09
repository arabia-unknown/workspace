//7018903 堀井萌希
public class S7018903_CaesarCipher extends ShiftChar{
    private String original_code; // 元の文字列
    private String cipher_code;// 暗号化された文字列
    // コンストラクタ（3つ、オーバーロード）
    S7018903_CaesarCipher(char c,int key,String str) {

        super(c, key); // 継承元（ShiftCharクラス）のコンストラクタを呼び出している
        this.original_code = str;
        this.cipher_code = "";
        this.cipher_code += String.valueOf(shiftChar());
    }


    // セッター
    void setString(String str) {
        this.original_code = str;
    }

    // ゲッター
    String getCipher() {
        return cipher_code;
    }
}
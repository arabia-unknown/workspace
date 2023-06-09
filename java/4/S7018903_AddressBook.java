//7018903 堀井萌希
public class S7018903_AddressBook extends Human {
    private String post; // 郵便番号
    private String address;// 住所
    private String number;//電話番号
    // コンストラクタ（5つ、オーバーロード）
    S7018903_AddressBook(String name, String post,String address,String number,int age) {
        super(name, age); // 継承元（Humanクラス）のコンストラクタを呼び出している
        this.post = post;
        this.address = address;
        this.number = number;

    }

    // セッター
    void setPost(String post) {
        this.post = post;
    }
    void setAddress(String address) {
        this.address = address;
    }
    void setNumber(String number){
        this.number = number;
    }
    // ゲッター
    String getPost() {
        return post;
    }
    String getAddress() {
        return address;
    }
    String getNumber() {
        return number;
    }
}

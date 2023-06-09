//7018903 堀井萌希
class S7018903_Student extends Human { // Human?N???X???p??????Student?N???X

    private int ID; // 学籍番号
    private int year; // 学年
    // コンストラクタ（2つ、オーバーロード）
    S7018903_Student(String name, int age,int year) {
        super(name, age); // 継承元（Humanクラス）のコンストラクタを呼び出している
        System.out.println("Student class constructor 1");
        if(name=="金太郎"){
            this.ID = 7017111;
        }else if(name=="桃太郎"){
            this.ID = 7017112;
        }
        this.year = year;
    }
    S7018903_Student() {
        System.out.println("Student class constructor 2");
    }
    // セッター
    void setID(int id) {
        ID = id;
    }
    void setYear(int year) {
        this.year = year;
    }
    // ゲッター
    int getID() {
        return ID;
    }
    int getYear() {
        return year;
    }
}
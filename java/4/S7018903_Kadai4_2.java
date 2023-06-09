//7018903 堀井萌希
public class S7018903_Kadai4_2 {
    public static void main(String[] args) {
        S7018903_AddressBook per1 = new S7018903_AddressBook("大木広司", "010-0001","秋田県秋田市", "018-837-0001", 35);
        S7018903_AddressBook per2 = new S7018903_AddressBook("布施知史", "010-0851", "秋田県秋田市","010-836-1111",20);
        
        showPersonData(per1);
        showPersonData(per2);
        }
        // データ表示用メソッド
        static void showPersonData(S7018903_AddressBook per) {
        System.out.println("アドレス帳");
        System.out.println("氏名：" + per.getName());
        System.out.println("郵便番号：〒" + per.getPost());
        System.out.println("住所：" + per.getAddress());
        System.out.println("電話番号：" + per.getNumber());
        System.out.println("年齢：" + per.getAge()+"歳");
        }
}
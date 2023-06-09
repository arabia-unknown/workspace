//7018903 堀井萌希
public class S7018903_Kadai4_1 {
    public static void main(String[] args) {
        S7018903_Student std1 = new S7018903_Student("金太郎", 21,3);
        S7018903_Student std2 = new S7018903_Student("桃太郎", 21,3);
        S7018903_Student std3 = new S7018903_Student();
        showS7018903_StudentData(std1);
        showS7018903_StudentData(std2);
        showS7018903_StudentData(std3);
        
        std3.setName("浦島太郎");
        std3.setAge(80);
        std3.setID(7018110);
        std3.setYear(3);
        showS7018903_StudentData(std1);
        showS7018903_StudentData(std2);
        showS7018903_StudentData(std3);
        }
        // データ表示用メソッド
        static void showS7018903_StudentData(S7018903_Student std) {
        System.out.println("学生情報");
        System.out.println("学籍番号" + std.getID());
        System.out.println("氏名" + std.getName());
        System.out.println("学年" + std.getYear());
        System.out.println("年齢" + std.getAge());
        }
}
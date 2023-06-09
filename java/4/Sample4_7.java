public class Sample4_7 {
public static void main(String[] args) {
Student std1 = new Student("金太郎", 21, 7018111, 3);
Student std2 = new Student("桃太郎", 21, 7018112, 3);
Student std3 = new Student();
showStudentData(std1);
showStudentData(std2);
showStudentData(std3);

std3.setName("浦島太郎");
std3.setAge(80);
std3.setID(7018110);
std3.setYear(3);
showStudentData(std1);
showStudentData(std2);
showStudentData(std3);
}
// データ表示用メソッド
static void showStudentData(Student std) {
System.out.println("学生情報");
System.out.println("学籍番号：" + std.getID());
System.out.println("氏名：" + std.getName());
System.out.println("学年：" + std.getYear());
System.out.println("年齢：" + std.getAge());
}
}
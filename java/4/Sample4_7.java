public class Sample4_7 {
public static void main(String[] args) {
Student std1 = new Student("�����Y", 21, 7018111, 3);
Student std2 = new Student("�����Y", 21, 7018112, 3);
Student std3 = new Student();
showStudentData(std1);
showStudentData(std2);
showStudentData(std3);

std3.setName("�Y�����Y");
std3.setAge(80);
std3.setID(7018110);
std3.setYear(3);
showStudentData(std1);
showStudentData(std2);
showStudentData(std3);
}
// �f�[�^�\���p���\�b�h
static void showStudentData(Student std) {
System.out.println("�w�����");
System.out.println("�w�Дԍ��F" + std.getID());
System.out.println("�����F" + std.getName());
System.out.println("�w�N�F" + std.getYear());
System.out.println("�N��F" + std.getAge());
}
}
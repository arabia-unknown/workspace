//7018903 �x��G��
public class S7018903_Kadai4_1 {
    public static void main(String[] args) {
        S7018903_Student std1 = new S7018903_Student("�����Y", 21,3);
        S7018903_Student std2 = new S7018903_Student("�����Y", 21,3);
        S7018903_Student std3 = new S7018903_Student();
        showS7018903_StudentData(std1);
        showS7018903_StudentData(std2);
        showS7018903_StudentData(std3);
        
        std3.setName("�Y�����Y");
        std3.setAge(80);
        std3.setID(7018110);
        std3.setYear(3);
        showS7018903_StudentData(std1);
        showS7018903_StudentData(std2);
        showS7018903_StudentData(std3);
        }
        // �f�[�^�\���p���\�b�h
        static void showS7018903_StudentData(S7018903_Student std) {
        System.out.println("�w�����");
        System.out.println("�w�Дԍ�" + std.getID());
        System.out.println("����" + std.getName());
        System.out.println("�w�N" + std.getYear());
        System.out.println("�N��" + std.getAge());
        }
}
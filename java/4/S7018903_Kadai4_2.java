//7018903 �x��G��
public class S7018903_Kadai4_2 {
    public static void main(String[] args) {
        S7018903_AddressBook per1 = new S7018903_AddressBook("��؍L�i", "010-0001","�H�c���H�c�s", "018-837-0001", 35);
        S7018903_AddressBook per2 = new S7018903_AddressBook("�z�{�m�j", "010-0851", "�H�c���H�c�s","010-836-1111",20);
        
        showPersonData(per1);
        showPersonData(per2);
        }
        // �f�[�^�\���p���\�b�h
        static void showPersonData(S7018903_AddressBook per) {
        System.out.println("�A�h���X��");
        System.out.println("�����F" + per.getName());
        System.out.println("�X�֔ԍ��F��" + per.getPost());
        System.out.println("�Z���F" + per.getAddress());
        System.out.println("�d�b�ԍ��F" + per.getNumber());
        System.out.println("�N��F" + per.getAge()+"��");
        }
}
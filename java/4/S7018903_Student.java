//7018903 �x��G��
class S7018903_Student extends Human { // Human?N???X???p??????Student?N???X

    private int ID; // �w�Дԍ�
    private int year; // �w�N
    // �R���X�g���N�^�i2�A�I�[�o�[���[�h�j
    S7018903_Student(String name, int age,int year) {
        super(name, age); // �p�����iHuman�N���X�j�̃R���X�g���N�^���Ăяo���Ă���
        System.out.println("Student class constructor 1");
        if(name=="�����Y"){
            this.ID = 7017111;
        }else if(name=="�����Y"){
            this.ID = 7017112;
        }
        this.year = year;
    }
    S7018903_Student() {
        System.out.println("Student class constructor 2");
    }
    // �Z�b�^�[
    void setID(int id) {
        ID = id;
    }
    void setYear(int year) {
        this.year = year;
    }
    // �Q�b�^�[
    int getID() {
        return ID;
    }
    int getYear() {
        return year;
    }
}
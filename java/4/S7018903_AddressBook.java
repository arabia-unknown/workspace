//7018903 �x��G��
public class S7018903_AddressBook extends Human {
    private String post; // �X�֔ԍ�
    private String address;// �Z��
    private String number;//�d�b�ԍ�
    // �R���X�g���N�^�i5�A�I�[�o�[���[�h�j
    S7018903_AddressBook(String name, String post,String address,String number,int age) {
        super(name, age); // �p�����iHuman�N���X�j�̃R���X�g���N�^���Ăяo���Ă���
        this.post = post;
        this.address = address;
        this.number = number;

    }

    // �Z�b�^�[
    void setPost(String post) {
        this.post = post;
    }
    void setAddress(String address) {
        this.address = address;
    }
    void setNumber(String number){
        this.number = number;
    }
    // �Q�b�^�[
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

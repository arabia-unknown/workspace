//7018903 �x��G��
public class S7018903_CaesarCipher extends ShiftChar{
    private String original_code; // ���̕�����
    private String cipher_code;// �Í������ꂽ������
    // �R���X�g���N�^�i3�A�I�[�o�[���[�h�j
    S7018903_CaesarCipher(char c,int key,String str) {

        super(c, key); // �p�����iShiftChar�N���X�j�̃R���X�g���N�^���Ăяo���Ă���
        this.original_code = str;
        this.cipher_code = "";
        this.cipher_code += String.valueOf(shiftChar());
    }


    // �Z�b�^�[
    void setString(String str) {
        this.original_code = str;
    }

    // �Q�b�^�[
    String getCipher() {
        return cipher_code;
    }
}
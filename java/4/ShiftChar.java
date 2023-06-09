// �������w�肵�����������炷�N���X
class ShiftChar {
  private char c;       // ���炷�Ώۂ̕���
  private int  key;     // �V�t�g���鐔

  // �R���X�g���N�^
  ShiftChar(char c, int key) {
    this.c = c;
    if(key>=26) {        // key��26�ȏ�̂Ƃ��i���[�v���邽�߁j
      key = key % 26;
    } else {
      this.key = key;
    }
  }

  ShiftChar() {
    this.c=0;
    this.key=0;
  }

  // ������ݒ肷��
  void setChar(char c) {
    this.c = c;
  }

  // key��ݒ肷��
  void setKey(int key) {
    if(key>=26) {
      this.key = key % 26;
    } else {
      this.key = key;
    }
  }

  // �������V�t�g����
  char shiftChar() {
    if(Character.isAlphabetic(c)) {
      int     sc;
      sc = (int)c + key;
      if(c>='a' && c<='z') {    // �������̎�
        if(sc>122) {
          sc = sc - 26;
        }
      } else if(c>='A' && c<='Z') {
        if(sc>90) {
          sc = sc - 26;
        }
      }
      c = (char)(sc);
    } else {
      // �������Ȃ�
    }

    return c;
  }

}

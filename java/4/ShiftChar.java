// 文字を指定した数だけずらすクラス
class ShiftChar {
  private char c;       // ずらす対象の文字
  private int  key;     // シフトする数

  // コンストラクタ
  ShiftChar(char c, int key) {
    this.c = c;
    if(key>=26) {        // keyが26以上のとき（ループするため）
      key = key % 26;
    } else {
      this.key = key;
    }
  }

  ShiftChar() {
    this.c=0;
    this.key=0;
  }

  // 文字を設定する
  void setChar(char c) {
    this.c = c;
  }

  // keyを設定する
  void setKey(int key) {
    if(key>=26) {
      this.key = key % 26;
    } else {
      this.key = key;
    }
  }

  // 文字をシフトする
  char shiftChar() {
    if(Character.isAlphabetic(c)) {
      int     sc;
      sc = (int)c + key;
      if(c>='a' && c<='z') {    // 小文字の時
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
      // 何もしない
    }

    return c;
  }

}

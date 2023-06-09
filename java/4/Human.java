class Human {
  private String name;    // 名前
  private int age;        // 年齢

  // コンストラクタ
  Human(String name, int age) {
    System.out.println("Human class constructor 1");
    this.name = name;
    this.age = age;
  }
  Human() {
    System.out.println("Human class constructor 2");
    this.name = "";
    this.age = 0;
  }

  // データを設定する（セッター）
  void setAge(int age) {
    this.age = age;
  }

  void setName(String name) {
    this.name = name;
  }

  // データを渡す（ゲッター)
  String getName() {
    return this.name;
  }
  int getAge() {
    return this.age;
  }
}

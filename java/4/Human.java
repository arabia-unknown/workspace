class Human {
  private String name;    // ���O
  private int age;        // �N��

  // �R���X�g���N�^
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

  // �f�[�^��ݒ肷��i�Z�b�^�[�j
  void setAge(int age) {
    this.age = age;
  }

  void setName(String name) {
    this.name = name;
  }

  // �f�[�^��n���i�Q�b�^�[)
  String getName() {
    return this.name;
  }
  int getAge() {
    return this.age;
  }
}

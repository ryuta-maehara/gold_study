package mock_exam.q48;

public class Sample {

  public static void main(String[] args) throws Exception {
    // Aクラスのインスタンスを作成して、Bクラスのインスタンスを作成して、sayメソッドを呼び出すことができます。
    new A().new B().say();

    // Aクラスのインスタンスを作成して、Bクラスのインスタンスを作成して、sayメソッドを呼び出すことができます。
    A a = new A();
    a.setMsg("Hi");
    a.new B().say();
  }
}

class A {
  private String msg = "Hello";

  void setMsg(String msg) {
    this.msg = msg;
  }

  class B {
    void say() {
      System.out.println(A.this.msg); // Aクラスのインスタンスのmsgフィールドを参照するために、A.thisを使用しています。
    }
  }
}

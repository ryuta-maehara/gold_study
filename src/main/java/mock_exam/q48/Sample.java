package mock_exam.q48;

public class Sample {

  public static void main(String[] args) throws Exception {
    new A().new B().say();
  }
}

class A {
  private String msg = "Hello";

  class B {
    void say() {
      System.out.println(A.this.msg);
    }
  }
}

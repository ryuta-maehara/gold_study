package chapter06.q011;

import java.io.IOException;
import java.io.Serializable;

public class Employee implements Serializable {
  private String name;
  private String telephone;

  public Employee(String name, String telephone) {
    this.name = name;
    this.telephone = telephone;
  }

  // writeObjectメソッドとreadObjectメソッドは、オブジェクトのシリアル化とデシリアル化の際に呼び出される特別なメソッドです。
  // これらのメソッドを定義することで、オブジェクトの保存や読み込みの際に特定の処理を実行することができます。
  private void writeObject(java.io.ObjectOutputStream out) throws IOException {
    System.out.println("writeObjectメソッドが呼び出されました");
    out.writeObject(name);
    out.writeObject(telephone);
  }

  private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
    System.out.println("readObjectメソッドが呼び出されました");
    this.name = (String) in.readObject();
    this.telephone = (String) in.readObject();
  }

  public String getName() {
    return name;
  }

  public String getTelephone() {
    return telephone;
  }

  @Override
  public String toString() {
    return "Employee [" + "name='" + name + ", telephone='" + telephone + ']';
  }
}

package chapter07.q014;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallSample {
  public static void main(String[] args) {
    try (Connection con = DriverManager.getConnection("jdbc:h2:./data/sample")) {

      // H2 DatabaseでJavaのメソッドをストアドプロシージャとして登録
      String createAlias =
          "CREATE ALIAS IF NOT EXISTS TEST_PROC FOR \"chapter07.q014.ProcedureExample.testProc\"";
      try (Statement st = con.createStatement()) {
        st.execute(createAlias);
      }

      // ストアドプロシージャを呼び出す
      String proc = "CALL TEST_PROC()";
      try (CallableStatement cs = con.prepareCall(proc)) {
        cs.execute();
      }
      System.out.println("ストアドプロシージャが正常に呼び出されました。");

      // fruits テーブルの全レコードを取得して表示
      try (Statement statement = con.createStatement();
          ResultSet result =
              statement.executeQuery(
                  "SELECT id, name FROM fruits")) { // executeQuery() を使用してSELECT 文を実行

        while (result.next()) {
          int id = result.getInt("id");
          String name = result.getString("name");
          System.out.printf("%d: %s%n", id, name);
        }
      }

    } catch (Exception e) {
      System.err.println("ストアドプロシージャの呼び出し中にエラーが発生しました: " + e.getMessage());
    }
  }
}

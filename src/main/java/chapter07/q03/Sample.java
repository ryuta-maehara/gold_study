package chapter07.q03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class Sample {
  public static void main(String[] args) {
    String url = "jdbc:h2:./data/sample"; // プロジェクトディレクトリ内に ./data/sample.mv.db というファイルが作成される

    try (Connection con = DriverManager.getConnection(url);
        Statement statement = con.createStatement()) {

      // books テーブルが存在しない場合は作成
      statement.executeUpdate(
          "CREATE TABLE IF NOT EXISTS books (id INT PRIMARY KEY, title VARCHAR(100) NOT NULL)");

      // MERGE INTO 文を使用して、id=1 と id=2 のレコードを挿入（既に存在する場合は更新）
      try (PreparedStatement insert =
          con.prepareStatement("MERGE INTO books KEY(id) VALUES (?, ?)"); ) {
        insert.setInt(1, 1);
        insert.setString(2, "Java入門");
        insert.executeUpdate(); // id=1 のレコードが存在しない場合は挿入、存在する場合は title を "Java入門" に更新.
        // executeUpdate()の戻り値は、挿入された行数または更新された行数を表す整数値
        // execute()の戻り値は、SQL文がResultSetを返す場合はtrue、返さない場合はfalse

        // PreparedStatementはStatementのサブインターフェースであり、executeUpdate()などに引数を渡してもコンパイルエラーにはならない。
        // ただし、PreparedStatementは事前にSQL文をコンパイルしているため、引数を渡すことができない。
        // StatementはSQL文を直接実行するため、引数を渡すことができる。

        insert.setInt(1, 2);
        insert.setString(2, "SQL基礎");
        insert.executeUpdate(); // id=2 のレコードが存在しない場合は挿入、存在する場合は title を "SQL基礎" に更新
      }

      // books テーブルの全レコードを取得して表示
      try (ResultSet resultSet =
          statement.executeQuery(
              "SELECT id, title FROM books ORDER BY id")) { // exequteQuery() を使用して SELECT 文を実行

        // resultSet.getInt("id");
        // next() を呼び出す前に getInt() を呼び出すと、SQLException がスローされる。
        // これはカーソルがまだ最初の行を指していないためである。
        // next() を呼び出すことで、カーソルが最初の行を指すようになる。

        while (resultSet.next()) {
          int id = resultSet.getInt("id");
          String title = resultSet.getString("title");
          System.out.printf("%d: %s%n", id, title);
        }

        // fruits テーブルが存在しない場合は作成
        statement.executeUpdate(
            "CREATE TABLE IF NOT EXISTS fruits (id INT PRIMARY KEY, name VARCHAR(100) NOT NULL)");

        // バッチ処理を使用して複数のレコードを挿入
        String[] names = {"apple", "banana", "orange"};
        String sql = "MERGE INTO fruits (id, name) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
          int i = 1;
          for (String name : names) {
            ps.setInt(1, i);
            ps.setString(2, name);
            ps.addBatch(); // バッチに追加
            i++;
          }

          int[] results = ps.executeBatch(); // バッチを実行. executeBatch() の戻り値は、各バッチの実行結果を表す整数の配列である。
          System.out.println(
              Arrays.toString(results)); // 期待値は [1, 1, 1] である。これは、3つのレコードが正常に挿入されたことを示す。
        }

        // fruits テーブルの全レコードを取得して表示
        try (ResultSet resultSet2 =
            statement.executeQuery(
                "SELECT id, name FROM fruits ORDER BY id")) { // exequteQuery() を使用して SELECT 文を実行

          while (resultSet2.next()) {
            int id = resultSet2.getInt("id");
            String name = resultSet2.getString("name");
            System.out.printf("%d: %s%n", id, name);
          }
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

package mock_exam.q36;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sample {

  public static void main(String[] args) throws Exception {

    String url = "jdbc:h2:mem:sampledb;DB_CLOSE_DELAY=-1";
    Class.forName("org.h2.Driver");

    try (Connection connection = DriverManager.getConnection(url, "sa", "");
        Statement statement = connection.createStatement()) {
      statement.executeUpdate(
          "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY, name VARCHAR(50))");
      statement.executeUpdate("MERGE INTO users (id, name) KEY (id) VALUES (1, 'Taro')");

      //
      try (ResultSet resultSet = statement.executeQuery("SELECT id, name FROM users")) {
        while (resultSet.next()) {
          System.out.println(
              "Connected to H2: id="
                  + resultSet.getInt("id")
                  + ", name="
                  + resultSet.getString("name"));
        }
      }
    }
  }
}

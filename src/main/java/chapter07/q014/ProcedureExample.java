package chapter07.q014;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProcedureExample {
  public static void testProc() throws Exception {
    String url = "jdbc:h2:./data/sample";
    Connection con = DriverManager.getConnection(url);

    String sql = "UPDATE fruits SET name = 'grape' WHERE id = 1";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.executeUpdate();
  }
}

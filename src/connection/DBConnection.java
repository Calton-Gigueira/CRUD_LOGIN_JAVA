package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

  private static final String URL = "jdbc:mysql://localhost:3306/usersDB";
  private static final String NAME = "root";
  private static final String PASSWORD = "clmgigueira";

  public static Connection connectDB() {
    Connection connection = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      connection = DriverManager.getConnection(URL, NAME, PASSWORD);
    } catch (ClassNotFoundException e) {
      System.err.println("Driver JDBC do MySQL nao encontrado.");
      e.printStackTrace();
    } catch (SQLException e) {
      System.err.println("Erro ao conectar ao banco de dados.");
      e.printStackTrace();
    }

    return connection;
  }
}

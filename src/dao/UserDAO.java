package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import connection.DBConnection;
import interfaces.UserDAOInterface;
import models.User;

public class UserDAO implements UserDAOInterface {

  private Connection connection;
  private PreparedStatement preparedStatement;
  private ResultSet resultSet;

  @Override
  public void insertUser(User user) {
    String query = "INSERT INTO users (name, password, email, genre, funct, status) VALUES (?, ?, ?, ?, ?, ?)";

    try {
      this.connection = DBConnection.connectDB();
      this.preparedStatement = this.connection.prepareStatement(query);

      this.preparedStatement.setString(1, user.getName());
      this.preparedStatement.setString(2, user.getPassword());
      this.preparedStatement.setString(3, user.getEmail());
      this.preparedStatement.setString(4, user.getGenre());
      this.preparedStatement.setString(5, user.getFunction());
      this.preparedStatement.setString(6, user.getStatus());

      this.preparedStatement.executeUpdate();

      JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      e.printStackTrace();
    } finally {
      try {
        if (this.connection != null) this.connection.close();
        if (this.preparedStatement != null) this.preparedStatement.close();
      } catch (SQLException e) {
        System.err.println(e.getMessage());
        e.printStackTrace();
      }
    }
  }

  @Override
  public ArrayList listAllUsers() {
    ArrayList<User> users = new ArrayList<>();

    String query = "SELECT * FROM users ORDER BY id";

    try {
      this.connection = DBConnection.connectDB();
      this.preparedStatement = this.connection.prepareStatement(query);
      this.resultSet = this.preparedStatement.executeQuery();

      while (this.resultSet.next()) {
        User user = new User();
        user.setId(this.resultSet.getInt("id"));
        user.setName(this.resultSet.getString("name"));
        user.setPassword(this.resultSet.getString("password"));
        user.setEmail(this.resultSet.getString("email"));
        user.setGenre(this.resultSet.getString("genre"));
        user.setFunction(this.resultSet.getString("funct"));
        user.setStatus(this.resultSet.getString("status"));

        users.add(user);
      }

    } catch (SQLException e) {
      System.err.println(e.getMessage());
      e.printStackTrace();
    } finally {
      try {
        if (this.connection != null) this.connection.close();
        if (this.preparedStatement != null) this.preparedStatement.close();
        if (this.resultSet != null) this.resultSet.close();
      } catch (SQLException e) {
        System.err.println(e.getMessage());
        e.printStackTrace();
      }
    }

    return users;
  }

  @Override
  public void updateUser(User user) {
    String query = "UPDATE users set name = ?, password = ?, email = ?, genre = ?, funct = ?, status = ? WHERE id = ?";
    
    try {
      this.connection = DBConnection.connectDB();
      this.preparedStatement = this.connection.prepareStatement(query);

      this.preparedStatement.setString(1, user.getName());
      this.preparedStatement.setString(2, user.getPassword());
      this.preparedStatement.setString(3, user.getEmail());
      this.preparedStatement.setString(4, user.getGenre());
      this.preparedStatement.setString(5, user.getFunction());
      this.preparedStatement.setString(6, user.getStatus());
      this.preparedStatement.setInt(7, user.getId());

      this.preparedStatement.executeUpdate();

      JOptionPane.showMessageDialog(null, "Usuario atualizado co sucesso!");
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      e.printStackTrace();
    } finally {
      try {
        if (this.connection != null) this.connection.close();
        if (this.preparedStatement != null) this.preparedStatement.close();
      } catch (SQLException e) {
        System.err.println(e.getMessage());
        e.printStackTrace();
      }
    }
  }

  @Override
  public void deleteUser(User user) {
    String query = "DELETE FROM users WHERE id = ?";

    int confirmed = JOptionPane.showConfirmDialog(null, "Deseja Excluir o usuário " + user.getName() + "?", "Excluir",
        JOptionPane.YES_NO_OPTION);

    if (confirmed == JOptionPane.YES_OPTION) {

      try {
        this.connection = DBConnection.connectDB();
        this.preparedStatement = this.connection.prepareStatement(query);

        this.preparedStatement.setInt(1, user.getId());

        this.preparedStatement.executeUpdate();

        JOptionPane.showMessageDialog(null, "Usuario deletado com sucesso!");
      } catch (SQLException e) {
        System.err.println(e.getMessage());
        e.printStackTrace();
      } finally {
        try {
          if (this.connection != null)
            this.connection.close();
          if (this.preparedStatement != null)
            this.preparedStatement.close();
        } catch (SQLException e) {
          System.err.println(e.getMessage());
          e.printStackTrace();
        }
      }
    } else {
      return;
    }
  }

  @Override
  public ResultSet loginUser(User user) {
    String query = "SELECT * FROM users WHERE name = ? AND password = ?";

    try {
      this.connection = DBConnection.connectDB();
      
      this.preparedStatement = this.connection.prepareStatement(query);
      this.preparedStatement.setString(1, user.getName());
      this.preparedStatement.setString(2, user.getPassword());

      this.resultSet = this.preparedStatement.executeQuery();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      e.printStackTrace();
    } 

    return this.resultSet;
  }
}

package interfaces;

import java.sql.ResultSet;
import java.util.ArrayList;

import models.User;

public interface UserDAOInterface {

  public abstract void insertUser(User user);

  public abstract ArrayList listAllUsers();

  public abstract void updateUser(User user);

  public abstract void deleteUser(User user);

  public abstract ResultSet loginUser(User user);
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cim.rdc.dev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fftmpc
 */
public class EmployeeDAO {
  private static Connection connect = null;
  private Statement statement = null;
  private PreparedStatement preparedStatement = null;
  private ResultSet resultSet = null;

    
    public EmployeeDAO() throws ClassNotFoundException, SQLException {
        // this will load the MySQL driver, each DB has its own driver
      Class.forName("com.mysql.jdbc.Driver");
      // setup the connection with the DB.
      connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/joys_friends_db", "root", "");

    }
    
    public void submitTImeLog(String sql) throws SQLException{
        statement = connect.createStatement();
        
        statement.executeUpdate(sql);
    }
    
}

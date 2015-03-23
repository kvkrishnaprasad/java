package com.elitelabs.labs.train.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseLayer {

  private Connection conn = null;
  private Statement stmt = null;
  private ResultSet rs = null;

  public void makeConnection() {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      String connectionUrl = "jdbc:mysql://localhost:3306/train";
      String connectionUser = "root";
      String connectionPassword = "";

      conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
      stmt = conn.createStatement();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  public ResultSet executeQuery(String sql) {

    try {
      rs = stmt.executeQuery(sql);
      return rs;
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  public void closeConnection() {
    try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
    try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
    try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
  }
}

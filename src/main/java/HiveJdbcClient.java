package com.raghav;
import org.apache.log4j.Logger;

import java.sql.*;
public class HiveJdbcClient {
  final static Logger logger = Logger.getLogger(HiveJdbcClient.class);
  private static String driverName = "org.apache.hive.jdbc.HiveDriver";
  public static void main(String[] args) throws SQLException {
    if(args.length <1){
      System.err.println("HiveJdbcClient would need atleast <JdbcUrl> as argument and UserName/Password Optional");
      System.err.println("java [-D<JavaSystemOptions>] -cp HiveJdbcClient-jar-with-dependencies.jar com.raghav.HiveJdbcClient <JdbcUrl> [UserName] [Password]");
      System.exit(1);
    }
      try {
      Class.forName(driverName);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    Connection con=null;
    Statement stmt=null;
    ResultSet res=null;
    try {
      if(args.length==3)
      {
      con = DriverManager.getConnection(args[0], args[1], args[2]);
      }
      else if(args.length==1)
      {
	     con = DriverManager.getConnection(args[0]);
      }
      else
      {
	      System.err.println("Invalid Number of arguments: Min args 1, Max args 3");
       }
      stmt = con.createStatement();
      System.out.println("Running: show databases; ");
      res = stmt.executeQuery("show databases");
      while (res.next()) {
        System.out.println(res.getString(1));
      }
    }catch (Exception e){
      e.printStackTrace();
    }finally{
      res.close();
      stmt.close();
      con.close();
    }

  }
}

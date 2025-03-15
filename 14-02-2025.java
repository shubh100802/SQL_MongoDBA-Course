import java.sql.*;

public class JDBC{
  public static void main(String[] args){
    try{
      Class.forName("com.mysql.jdbc.Driver");  // Register    // 1
      
      Connection con = DriverManager.getConnection(
        "jdbc:mysql: // localhost:3306 / MyWish" , "root","root");
      //here sonoo is database name, root is username and password     // 2

    Statement stmt = con.createStatement();   // 3
    ResultSet rs = stmt.executeQuery("select * from emp");  // 4

    while(rs.next())
    System.out.println(rs.getInt(1)+ " " + rs.getString + " " + rs.getString(3);

    con.close();   //5

    }
    catch(Exception e){
      System.out.println("went wrong");
    }
  }
}

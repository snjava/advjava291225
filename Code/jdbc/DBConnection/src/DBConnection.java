import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static void main(String[] args) {
        String oracleDriver = "oracle.jdbc.driver.OracleDriver";
        String oracleUrl = "jdbc:oracle:thin:@localhost:1521:xe";
        String mysqlDriver = "com.mysql.cj.jdbc.Driver";
        String mysqlUrl = "jdbc:mysql://localhost:3306/advjava2912";
        String userName = "root";
        String password = "root";
        try {
            // 1. Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Create Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912", "root", "root");
            System.out.println("CONNECTION SUCCESSFUL...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

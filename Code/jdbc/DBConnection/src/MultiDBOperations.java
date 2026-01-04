import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// flyway scripts
public class MultiDBOperations {
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912","root","root");
            con.setAutoCommit(false); // To Disable the auto-commit of the statement
            PreparedStatement stmt1 = con.prepareStatement("INSERT INTO student VALUES(9, 'J', '9843545432')");
            PreparedStatement stmt2 = con.prepareStatement("UPDATE student set contact='9098787654' WHERE id = 1");
            int insertCount = stmt1.executeUpdate();
            int updateCount = stmt2.executeUpdate();
            if(insertCount>0 && updateCount>0) {
                con.commit();
            } else {
                con.rollback();
            }
            con.close();
            System.out.println(insertCount + " : record Inserted AND " + updateCount + " records updated");
        } catch (Exception e) {
            con.rollback();
            e.printStackTrace();
        }
    }
}

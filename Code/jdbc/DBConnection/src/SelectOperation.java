import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class SelectOperation {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912","root","root");
            PreparedStatement stmt = con.prepareStatement("select * from student");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.print(rs.getInt("id") + "\t");
                System.out.print(rs.getString("name") + "\t");
                System.out.print(rs.getString("contact") + "\n");
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

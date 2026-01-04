import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOperationAggrFunction {
    public static void main(String[] args) {
        try {
            Connection con = PropertyLoader.getConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT city, count(id) AS total_count FROM employee group by city");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.print(rs.getString("city") + "\t");
                System.out.println(rs.getInt("total_count"));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

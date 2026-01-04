import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectParameterizedQuery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter City : ");
        String city = scan.next();
        scan.close();
        try {
            Connection con = PropertyLoader.getConnection();
            PreparedStatement stmt = con.prepareStatement("select * from Employee WHERE city = ?");
            stmt.setString(1, city);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.print(rs.getInt("id") + "\t");
                System.out.print(rs.getString("name") + "\t");
                System.out.print(rs.getDouble("salary") + "\n");
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

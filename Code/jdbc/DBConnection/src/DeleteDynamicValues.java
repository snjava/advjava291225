import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDynamicValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Id : ");
        int id = scan.nextInt();
        scan.close();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912","root","root");
            PreparedStatement stmt = con.prepareStatement("DELETE FROM student WHERE id = ?");
                stmt.setInt(1, id);
            int count = stmt.executeUpdate();
            con.close();
            System.out.println(count + " : ROWS DELETED...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

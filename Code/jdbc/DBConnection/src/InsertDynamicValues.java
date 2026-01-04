import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Id : ");
        int id = scan.nextInt();
        System.out.println("Enter Student Name : ");
        String name = scan.next();
        System.out.println("Enter Student Contact : ");
        String contact = scan.next();
        scan.close();
        insertData(id, name, contact);
    }

    public static void insertData(int id, String name, String contact) {
        try {
            String query = "INSERT INTO student VALUES(?,?,?)"; // Parameterized Query
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912","root","root");
            PreparedStatement stmt = con.prepareStatement(query);
                // Replace Parameters with the actual values using setter methods of Statement
                stmt.setInt(1, id);
                stmt.setString(2, name);
                stmt.setString(3, contact);
            int count = stmt.executeUpdate();
            con.close();
            System.out.println(count + " : Rows Inserted.. ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

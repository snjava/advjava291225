package phbook.model;

import phbook.dto.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ContactModel {

    public boolean save(Contact contact) {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912","root","root");
            PreparedStatement stmt = connection.prepareStatement("INSERT INTO phbook(name,phnumber,blocked,createdon) VALUES(?,?,?,CURRENT_TIMESTAMP)");
            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getPhNumber());
            stmt.setBoolean(3, contact.isBlocked());
            int count = stmt.executeUpdate();
            result = count>0;
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}

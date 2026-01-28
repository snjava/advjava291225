import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/auth")
public class Auth extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String password = req.getParameter("userpassword");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava2912", "root", "root");
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM userdetails WHERE email=? AND password=?");
            stmt.setString(1, name);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                HttpSession session = req.getSession();
                session.setAttribute("uname", rs.getString("name"));
                session.setAttribute("uemail", rs.getString("email"));
                session.setAttribute("ucontact", rs.getString("contact"));
                //session.setMaxInactiveInterval(2);
                resp.sendRedirect("home.jsp");
            } else {
                resp.sendRedirect("login.jsp?msg=invalid");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("login.jsp?msg=error");
        }


    }
}

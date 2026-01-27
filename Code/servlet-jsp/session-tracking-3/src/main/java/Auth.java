import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/auth")
public class Auth extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String password = req.getParameter("userpassword");
        if("abc@gmail.com".equals(name) && "abc@123".equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("uname", name);
            resp.sendRedirect("home.jsp");
        } else {
            resp.sendRedirect("login.jsp?msg=invalid");
        }
    }
}

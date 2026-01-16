import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user-auth")
public class Validate extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("uname").trim();
        String userPassword = req.getParameter("upass").trim();
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>This is Validate Page</h1>");

        if("admin".equals(userName) && "admin@123".equals(userPassword)) {
            String email = "admin@gmail.com";
            req.setAttribute("uemail", email);
            RequestDispatcher dis = req.getRequestDispatcher("user-home");
            //dis.include(req, resp);
            dis.forward(req, resp);
        } else {
            resp.sendRedirect("invalid");
            //resp.sendRedirect("https://www.google.com/search?q=java");
        }
    }
}

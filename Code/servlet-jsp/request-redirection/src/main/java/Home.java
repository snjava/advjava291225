import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user-home")
public class Home extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Welcome User to Home.</h1>");
        String userName = req.getParameter("uname").trim();
        String email = (String) req.getAttribute("uemail");
        out.print("<h3>User , "+userName+"</h3>");
        out.print("<h3>Email , "+email+"</h3>");
    }
}

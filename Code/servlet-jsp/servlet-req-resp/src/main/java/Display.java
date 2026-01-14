import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/show-info")
public class Display extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h1>Hello This is the GET type of response</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String gen = req.getParameter("gender");
        String ct = req.getParameter("contact");

        String prefix = "Male".equalsIgnoreCase(gen) ? "Mr. " : "Ms. ";

        out.print("<h1>Welcome User, </h1>");
        out.print("<h3> "+ prefix + name +"</h3>");
        out.print("<h3>Contact : "+ ct +" </h3>");
    }
}

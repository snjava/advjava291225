import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/result")
public class Result extends HttpServlet  {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userQuery = req.getParameter("q");
        //Create a cookie
        Cookie cookie = new Cookie("search", userQuery.replace(" ", "_"));
        // Set Expire time
        cookie.setMaxAge(5 * 24 * 60 * 60); // Set Cookie expire time in Seconds (Persisted Cookie)
        // add Cookie into response
        resp.addCookie(cookie);

        PrintWriter out = resp.getWriter();
        out.print("<h1>YOUR SEARCH FOR : "+userQuery+" </h1>");

    }
}

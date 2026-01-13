import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user-info")
public class UserDetails extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<html>");
            out.print("<head>");
                out.print("<title>User Details</title>");
            out.print("</head>");
            out.print("<body>");
                out.print("<form action='show-info'>");
                    out.print("Enter Name : <input type='text' name='name'>");
                    out.print("<br/><br/>");
                    out.print("Select Gender : <input type='radio' name='gender' value='Male'>Male");
                    out.print("<input type='radio' name='gender' value='Female'>Female");
                    out.print("<br/><br/>");
                    out.print("Enter Contact : <input type='number' name='contact'>");
                    out.print("<br/><br/>");
                    out.print("<button type='submit'>Send</button>");
                out.print("</form>");
            out.print("</body>");
        out.print("</html>");
    }
}

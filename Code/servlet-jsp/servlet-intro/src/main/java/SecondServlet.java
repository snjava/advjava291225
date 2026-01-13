import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

@WebServlet("/servlet-demo")
public class SecondServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); // Set the type of response (MIME Type)
        PrintWriter out = resp.getWriter(); // getWriter return the object using which you can set the char type of response
        //OutputStream out = resp.getOutputStream(); // to return the response if of byte type.
        out.print("This is the Text Type of Response");
        out.print("<h1 style='color:red;'>This is HTML type of response</h1>");
        out.print("<button>Click Here</button>");
    }
}

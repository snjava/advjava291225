import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/save")
public class Save extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");
        String city = request.getParameter("city");
        String pincode = request.getParameter("pincode");
        String degree = request.getParameter("degree");
        String percent = request.getParameter("percent");
        String year = request.getParameter("year");

        System.out.println("Name : " + name);
        System.out.println("email : " + email);
        System.out.println("Contact : " + contact);
        System.out.println("City : " + city);
        System.out.println("Pincode : " + pincode);
        System.out.println("Degree : " + degree);
        System.out.println("Year : " + year);
        System.out.println("Percent : " + percent);
    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");  //What is going oon here?
        PrintWriter out = res.getWriter(); //This is similar to how we use the scanner object. PrintWriter is similar to 'sout'

        String nameParam = req.getParameter("name");

        if(nameParam != null) {
            out.println("<h1>Hello " + nameParam + "!</h1>");
        } else {
            out.println("<h1> Hello World!</h1>");
        }
    }

    //For the BONUS exercise, in the URL add text /hello?name=codeup

}

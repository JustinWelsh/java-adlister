import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//#1
//      -Created a "session" object
//      -If statement
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            response.sendRedirect("/profile");
        }
    }
//#2
//    -Updated "username" to "user"
//    -Created a "session" object
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = user.equals("admin") && password.equals("password");

        HttpSession session = request.getSession();

        if (validAttempt) {
            session.setAttribute("user", user);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}

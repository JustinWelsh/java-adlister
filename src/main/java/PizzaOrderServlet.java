import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse  response) throws IOException, ServletException {
//        response.getWriter().println("<h1>Hello From Pizza-Order.jsp</h1>");
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(request.getParameter("crust-type"));
        response.getWriter().println(request.getParameter("sauce-type"));
        response.getWriter().println(request.getParameter("size-type"));
        response.getWriter().println(request.getParameter("toppings"));
        response.getWriter().println(request.getParameter("address"));


    }

}

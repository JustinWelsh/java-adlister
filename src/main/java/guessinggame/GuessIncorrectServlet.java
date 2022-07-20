package guessinggame;

public class GuessIncorrectServlet {
}

//INSTRUCTOR SOLUTION

//@WebServlet(name = "IncorrectServlet", urlPatterns = "/incorrect")
//public class IncorrectServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("message", "Tough luck... no dice... you lose...");
//        req.setAttribute("title", "Bummer, dude");
//        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
//    }
//}

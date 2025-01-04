@WebServlet("/profile")
public class UserProfileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserDao userDao;

    public UserProfileServlet() {
        super();
        userDao = new UserDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Assuming user is logged in and the data is in the session
        User user = (User) request.getSession().getAttribute("loggedInUser");

        if (user != null) {
            request.setAttribute("user", user);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/profile.jsp");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("register");
        }
    }
}

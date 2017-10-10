import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by caoyuncong on
 * 2017/10/10 10:52
 * HelloMaven.
 */
@WebServlet("/myController")
public class Controller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.err.println("----");
//        解决乱码
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        req.setAttribute("name", name);
        System.out.println(name);
        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}

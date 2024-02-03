package lk.ijse.inclassassingments;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Customer", value = "/customer/*", loadOnStartup = 2)
public class HelloServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init customer");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String request = req.getParameter("customer");
        System.out.println(request);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String header = req.getHeader("demo");
        String[] splitarr = req.getPathInfo().split("/");


        System.out.println("Parameter : "+ splitarr[splitarr.length-1]);
        System.out.println(header);

    }


}
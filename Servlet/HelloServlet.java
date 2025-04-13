package Servlet;
import jakarta.servlet.*;
import java.io.*;

public class HelloServlet extends GenericServlet{
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<B>Hello");
        printWriter.close();
    }
}
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
public class PostParameterServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
        //get print writer
        PrintWriter pw = response.getWriter();

        //get enumeration of parameter names
        Enumeration <String> e = request.getParameterNames();

        //display parameters name and values
        while(e.hasMoreElements()){
            String pName = e.nextElement();
            pw.print(pName + " = ");
            String pValue = request.getParameter(pName);
            pw.println(pValue);
        }
        pw.close();
    }
}

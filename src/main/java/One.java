import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class One extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException
    {
        res.setContentType("text/html");//setting the content type
        PrintWriter pw = res.getWriter();//get the stream to write the data

//writing html in the stream
        pw.println("<html><body>");
        pw.println("<h1> Welcome! You are in the First Page .  <a href=\"http://localhost:8080/javaWeb2_Web_exploded/two\"> press </a></h1>");
        pw.println("</body></html>");

        //closing the stream
        pw.close();
    }
}


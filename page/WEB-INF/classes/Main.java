import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Main extends HttpServlet { 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Database.i++;
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><head><title>Hello World</title></title>");
		pw.println("<body><h1>Hello World " + Database.i +" </h1></body></html>");
	}
}
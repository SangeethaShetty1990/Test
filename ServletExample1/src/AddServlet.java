import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{

	//service method of servlet
	//public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	//we can use doPost and doGet methods. doPost is secure , so use doPost
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{

		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));

		int k = i+j; 
		/*PrintWriter out = response.getWriter();
		out.print("result is :" + k);*/
		
		//Http Cookie
		Cookie cookie = new Cookie("k",k+ "");
		response.addCookie(cookie);
		response.sendRedirect("square");
		
		//Http session
		/*HttpSession session = request.getSession();
		session.setAttribute("k", k);
		*/
		
		//url rewriting
		//response.sendRedirect("square?k="+k);

		/*//set k value in request object
		request.setAttribute("k", k);
		// to send data from one servlet to another
		RequestDispatcher reqdis = request.getRequestDispatcher("square");
		reqdis.forward(request, response);
*/


	}

}

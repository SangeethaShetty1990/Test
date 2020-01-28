import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
		//Cookie
		Cookie cookies[] = request.getCookies();
		int value = 0;
		for(Cookie c: cookies)
		{
			if(c.getName().equals("k"))
			value =Integer.parseInt(c.getValue());
			
		}
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor ='cyan'>");
		out.println("value:" + value);
		out.println("</body></html>");
		
		/*//Http session
		HttpSession session = request.getSession();
		int k= (int) session.getAttribute("k");
		PrintWriter out = response.getWriter();
		out.write("result is :" + (k));
		*/
		// URL rewriting
		/*int k = Integer.parseInt(request.getParameter("k"));
		PrintWriter out = response.getWriter();
		 k = k*k;
		out.write("result is :" + (k));
		*/
		
		/*int k = (int)(request.getAttribute("k"));
		k = k*k;
		PrintWriter out = response.getWriter();
		out.write("result is :" + (k));*/
		
	}
}

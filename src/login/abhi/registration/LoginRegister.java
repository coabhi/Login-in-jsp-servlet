package login.abhi.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRegister
 */
@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginRegister() {
        super(); 
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDao cd = new CustomerDaoImplementation();
		String userName = request.getParameter("username");
		String password = request.getParameter("password1");
		String submitType = request.getParameter("submit");
		Customer c = cd.getCustomer(userName, password);
		if(submitType.equals("login") && c != null && c.getName() != null)
		{
			request.setAttribute("message",c.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			
		}else if(submitType.equals("register"))
		{
			c.setName(request.getParameter("name"));
			c.setPassword(password);
			c.setUsername(userName);
			cd.insertCustomer(c);
			request.setAttribute("successmessage", "Registration done !!! please login to continue!!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("message"," Data not fount , please click on Register link!!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}

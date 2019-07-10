import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hw extends HttpServlet{	
	
	List<Customer> customers= new ArrayList<>();
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<form action =\"demo\"> ");
		out.print("Enter user Name:<input type=\"text\" name=\"Name\"/><br><br>");
		out.print("Enter Email:<input type=\"text\" name=\"Email\"/><br><br>");
		out.print("Enter Country:<input type=\"text\" name=\"Country\"/><br>");
		out.print("<input type=\"submit\" value=\"register\"/> ");
		out.print("<input type=\"reset\"> ");
		out.print("</form> ");
		
		String Name = request.getParameter("Name");
		String Email = request.getParameter("Email");
		String Country = request.getParameter("Country");
		
		out.print("<table> ");
		out.print("<thead> ");
		out.print("<tr> ");
		out.print(" <th>Name</th>");
		out.print("<th>E-mail</th> ");
		out.print("<th>Country</th> ");
		out.print("</tr> ");
		out.print("</thead> ");
		out.print("<tbody> ");
		
	
		if(Name!=null&& !Name.isEmpty()) {
			Customer customer = new Customer (Name, Email, Country);
			customers.add(customer);
			//out.println(customers);
		}
		
			for (int i=0; i<customers.size(); i++) {
				Customer cust = customers.get(i);
		out.print("<tr><td>"+cust.getName()+"</td><td>"+cust.getEmail()+"</td><td>"+cust.getCountry()+"</td></tr> ");
		}
		out.print(" </tbody>");
		
		 
		
	}

}
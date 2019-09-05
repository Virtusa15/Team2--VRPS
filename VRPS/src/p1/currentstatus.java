package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class currentstatus extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int ref = Integer.parseInt(request.getParameter("refid"));
		System.out.println("called");
		PreparedStatement ps=null;
		PrintWriter pw=response.getWriter(); 

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	     	Connection c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			ps=c.prepareStatement("select fname,Refferal_Id from Reg where Refferal_Id=?");
			ps.setInt(1, ref);
			ResultSet executeQuery = ps.executeQuery();
			
			
			while(executeQuery.next())
			{
			pw.println(executeQuery.getString(1)+" "+executeQuery.getString(2));
			pw.println("<html>");
			pw.println("<body>");
			pw.println("<form  action='Userpage.jsp'/>");
			pw.println("<input type='submit' value='back'>");
			pw.println("</form></body></html>");
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}
}

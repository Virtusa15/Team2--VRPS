package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter(); 
		RequestDispatcher rd;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		PreparedStatement st=con.prepareStatement("select Username,Password from Employees1 where Username=? and Password=?");
		
		
		String s=request.getParameter("Username");
		
		
		String s3=request.getParameter("Password");
	
		
		
		
		st.setString(1,s);
		 
		st.setString(2,s3); 
		
		
		ResultSet i =st.executeQuery();
		
		if(i.next())
		{ 
			
			//rd=request.getRequestDispatcher("./Userpage.jsp");
			//rd.forward(request, response);
			response.sendRedirect("./Userpage.jsp");
			return;
			//pw.println(" user");
			
		}
		
		else {
			
		    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Login.jsp");				
            requestDispatcher.include(request, response);
            
            pw.println("<html>");
			pw.println("<body>");
			pw.println("<div align='center'><br>");


            pw.println("<b>invalid user</b>");
            pw.println("</div>");

			pw.println("</body>");
			pw.println("</html>");
			
		}
		
		
		
		
		
		
		
		
		st.close();
		
		
	}
		catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

}
}

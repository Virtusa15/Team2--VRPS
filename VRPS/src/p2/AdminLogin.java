package p2;

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



public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter(); 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		PreparedStatement st=con.prepareStatement("select username,password from Admin where username=? and password=?");
		
		
		String s1=request.getParameter("username");
		
		
		String s2=request.getParameter("password");
	
		
		
		
		st.setString(1,s1);
		 
		st.setString(2,s2); 
		
		
		ResultSet i =st.executeQuery();
		

		
			
			
			if((s1.equals("mahitha"))||(s2.equals("mahitha123")))
			{
				
				response.sendRedirect("./Admin.jsp");
				return;
	                                                                       
			}
			else if((s1.equals("chandana"))||(s2.equals("chamdana123")))
			{
				
				response.sendRedirect("./Tr.jsp");
				return;

			}
			
			else if((s1.equals("preetam"))||(s2.equals("preetam123")))
			{
				
				response.sendRedirect("./Hr.jsp");
				return;

			}
		
			else {
				/*pw.println("<html>");
				pw.println("<body>");
				pw.println("<div align='center'><br>");


				pw.println("<font size='3' color='red>Invalid User</font><br><br>");
				pw.println("</div>");

				pw.println("</body>");
				pw.println("</html>");*/
				

                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/AdminLogin.jsp");				
                requestDispatcher.include(request, response);
                
                
                pw.println("<html>");
				pw.println("<body>");
				pw.println("<div align='center'><br>");


                pw.println("<b>invalid user</b>");
                pw.println("</div>");

				pw.println("</body>");
				pw.println("</html>");
				
				
			}
			
			
			
			
			
			
			
			
			
		
		
		} catch(Exception e) {
			pw.println(e);
		}
	}
		
		
	

}

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



public class AdminLog extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter(); 
		RequestDispatcher rd;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
		PreparedStatement st=con.prepareStatement("select username,password from Admin where username=? and password=?");
		
		
		String s1=request.getParameter("username");
		
		
		String s2=request.getParameter("password");
	
		
		
		
		st.setString(1,s1);
		 
		st.setString(2,s2); 
		
		
		ResultSet i =st.executeQuery();
		

		while (i.next()) {
			rd=request.getRequestDispatcher("http://localhost:6001/VRPS/NewFile.jsp");
			 rd.forward(request,response);
			//response.sendRedirect("./NewFile.jsp");
			//return;
		}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		
	

}

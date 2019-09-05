package p1;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Technical extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw= response.getWriter();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		PreparedStatement ps=con.prepareStatement("insert into trf4(candidate_name,tr_name,role,java_performance,sql_performance,se_performance,subject_knowledge,presentation_skills,overall_score,average_rating,reasons) values(?,?,?,?,?,?,?,?,?,?,?)");
		

		  String s1=request.getParameter("candidate_name");
		  String s2 = request.getParameter("tr_name"); 
		  String s3 = request.getParameter("role");
		  String s4 = request.getParameter("java_performance");

		  String s5 = request.getParameter("sql_performance");
		  String s6 =request.getParameter("se_performance");
		  String s7 = request.getParameter("subject_knowledge");
		  int a=Integer.parseInt(s7);
		  String s8 = request.getParameter("presentation_skills");
		
		  int b=Integer.parseInt(s8);
		  
		 String s9 = request.getParameter("overall_score");
		  
		  
		 int c=Integer.parseInt(s9);
		  
		  String s10 = request.getParameter("average_rating");
		  int d=Integer.parseInt(s10);
		  String s11= request.getParameter("reasons");
	  
	  
			
			  if(d>=3&&c>=2) { 
				  pw.println("Eligible  to next round");
			  }else {
			  pw.println("NotEligible  to next round");
			  
			  }
			  
			 

		  ps.setString(1,s1);
			 ps.setString(2,s2);
			 ps.setString(3,s3);
			 ps.setString(4,s4);
			 
			 
			 ps.setString(5,s5);
			 ps.setString(6,s6);
			 ps.setInt(7,a);
			 ps.setInt(8,b);
			 
			 
			 
			ps.setInt(9,c);
			
			 
			 
			 ps.setInt(10,d);
			ps.setString(11,s11);
			 
			 ResultSet rs= ps.executeQuery();
			 
			 
			 if(rs.next()) {
			
				 pw.println("selected");
				 
								 }
			 else {
				 pw.println("Not selected");
		}}
		catch (Exception e) {
			pw.println(e);
		}
		
	}

}

		  



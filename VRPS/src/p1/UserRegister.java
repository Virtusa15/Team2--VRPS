package p1;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw= response.getWriter();
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		PreparedStatement ps=con.prepareStatement("insert into Reg(dan,fname,mname,lname,cha,ffname,fmname,flname,gender,hname,street,tc,country,city,pin,email,num,ck,n,nu,h,lang,Experience,Refferal_Id) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,Reg_seq.NEXTVAL)");
		
		  String s1=request.getParameter("dan");
		  String s2 = request.getParameter("fname"); 
		  String s3 = request.getParameter("mname");
		  String s4 = request.getParameter("lname");

		  String s5 = request.getParameter("cha");
		  String s6 =request.getParameter("ffname");
		  String s7 = request.getParameter("fmname");
		  String s8 = request.getParameter("flname");
		
		  
		  
		 String s10 = request.getParameter("gender");
		  
		  
		  
		  
		  String s12 = request.getParameter("hname");
		  String s13= request.getParameter("street");
		  String s14 = request.getParameter("tc");
		  
		  
		  
		  
		  
		  
		  
		  String s15 = request.getParameter("country");
		  String s16 = request.getParameter("city");

		  String s17 = request.getParameter("pin");
		  long c=Long.parseLong(s17);
		  
		  String s18 = request.getParameter("email");
		  String s19 = request.getParameter("num");
		  int d=Integer.parseInt(s19);
		  
		  
		  
		  
		  
		  
		  
		  String s20 = request.getParameter("ck"); 
		  String s21 = request.getParameter("n");
		  int e=Integer.parseInt(s21);
		  String s22 = request.getParameter("nu");
			int a=Integer.parseInt(s22);
		  String s23 = request.getParameter("h");
		  String s24 = request.getParameter("lang");
		 
		   String s25=request.getParameter("Experience");
		  int f=Integer.parseInt(s25);
		  
		  
		  
		//  String s26=request.getParameter("Refferal_Id");
		 // int rid=Integer.parseInt(s26);
		  
		  
		  
		  
		  
		  if(a>60 && e>=2018) {
			  pw.println("Eligible  to next round");
		  }else {
			  pw.println("NotEligible  to next round");
			  
		  }

		 ps.setString(1,s1);
		 ps.setString(3,s2);
		 ps.setString(4,s3);
		 ps.setString(2,s4);
		 
		 
		 ps.setString(5,s5);
		 ps.setString(7,s6);
		 ps.setString(8,s7);
		 ps.setString(6,s8);
		 
		 
		 //ps.setInt(12,"b");
		ps.setString(9,s10);
		
		 
		 
		 ps.setString(10,s12);
		ps.setString(11,s13);
		 ps.setString(12,s14);
		 ps.setString(13,s15);
		 ps.setString(14,s16);
		
		 ps.setLong(15,c);

		 
		 ps.setString(16,s18);
			
		 ps.setInt(17,d);
		 
		 ps.setString(18,s20);
			
		 ps.setInt(19,e);
		 ps.setInt(20,a);
		 ps.setString(21,s23);
		 ps.setString(22,s24);
		 
		 ps.setInt(23,f);
		 
		 

		 
		 
		 

		 
		 ResultSet rs= ps.executeQuery();
		 
		 
		 if(rs.next()) {
			 pw.println("<html>");
			 pw.println("<body>");
			 pw.println("<div align='center' >");
			 pw.println("<h ><b><font size='+8'>Sucess</font></b><h><br><br><br>");
			 pw.println("<h><b><font size='+11'>REFFERAL NUMBER IS </font><b><h><br><br>");
			 
			// pw.println();
			 Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con1= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
				
				//String q=";
			 PreparedStatement p=con1.prepareStatement("select Refferal_Id from Reg where email=?");
			 String s50 = request.getParameter("email");
			 p.setString(1,s50);
			ResultSet r=p.executeQuery();
			while(r.next())
			{
				
				
				pw.println( "<h1><fontsize='+12'>"+r.getString("Refferal_Id")+" </font></h1>"  );
				pw.println("<br>");
			}
			
			
			 
			 pw.println("</div>");
			
			 
			 pw.println("<div align='center'>");
			 pw.println("<form method='post' action='Userpage.jsp'>");
			 pw.println("<input type='submit' value='Back'>");
			 
			 
			 pw.println("</body>");
			 pw.println("</html>");// pw.println("succ " +rs.getString(rid));
			// pw.println("successsssssss");
			 
				//response.sendRedirect("./Userpage.jsp");

				//return;
		 }
		 else {
			 pw.println("failed");
		 }
	}
		catch (Exception e) {
			pw.println(e);
		}
		
	}

}

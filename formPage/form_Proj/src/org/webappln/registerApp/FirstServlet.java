package org.webappln.registerApp;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String ename =req.getParameter("user");
		String password = req.getParameter("pas");
		String gender = req.getParameter("gender");
		String email = req.getParameter("eid");
     	String mobno = req.getParameter("mobno");
		String place =req.getParameter("place");
		String course =req.getParameter("c1");
		String course1 =req.getParameter("c2");
		String course2 =req.getParameter("c3");
		String course3 =req.getParameter("c4");
		 PrintWriter out=resp.getWriter();
		 out.println("<html><body bgcolor='#8c3380',style='color:white'>"
		 		+ "<h1><b>Welcome to the portal</b></h1>"
		 		+"<h1>"+ename+"</h1>" +"<h1><b>Registration successful</b></h1>"+" for Email ID: "+email+"<br></br>"+" Gender: "+gender+"<br></br>"+" from "+place+"<br></br>"
		 		+ "Your registered contact no is: "+mobno+"<br></br>"+"Your opted course is:"+course+","+course1+","+course2+","+course3+"</html></body>");
		 		
         out.flush();
		 out.close();
		 Connection con = null;
		 PreparedStatement pstmt=null;
		 String qry="insert into form_page.userdetails values(?,?,?,?,?,?,?,?,?,?)";
		 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=pradeep_241094");
			pstmt=con.prepareStatement(qry);
			pstmt.setString(1,ename);
			pstmt.setString(2,password);
			pstmt.setString(3,gender);
			pstmt.setString(4,email);
			pstmt.setString(5,mobno);
			pstmt.setString(6,place);
			pstmt.setString(7,course);
			pstmt.setString(8,course1);
			pstmt.setString(9,course2);
			pstmt.setString(10,course3);
			
			pstmt.executeUpdate();
			
			
					
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
			finally{
				if(pstmt!=null)
				{
					try {
						pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(con!=null)
				{
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		 
	}


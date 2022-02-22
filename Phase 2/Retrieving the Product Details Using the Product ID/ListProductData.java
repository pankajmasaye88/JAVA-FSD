package RetrieveData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListProductData extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/ecommerce";
	String username="root";
	String password="Pankaj@123";
	PrintWriter out= response.getWriter();
	String id= request.getParameter("pid");
	try {
		Class.forName(driver);
		Connection con= DriverManager.getConnection(url, username, password);	
			if(con!=null)
			{
				out.print("Database Connnection Established");
				PreparedStatement stmt= con.prepareStatement("select * from eproduct where id=?");
				stmt.setInt(1, Integer.parseInt(id));
				ResultSet result= stmt.executeQuery();
					out.print("<h1>Product detail</h1><br>");
					while (result.next()) 
					{
						String id1= result.getString(1)	;
						if(id1!=null)
						{
							out.print("<h3>"+id1+"<br>Name:\t\t"+result.getString(2)+"<br>Price:\t\t"+result.getBigDecimal(3).toString()+"<br>DataAdded:\t\t"+result.getTimestamp(4).toString()+"</h3>");
						}
						else 
						{
								out.print("No such ProductID present");
								System.out.println("No such ProductID present");
						}
					}
			}
			else
			{
				out.print("Error while connecting with database");
			}				
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		} catch (SQLException e) {
		e.printStackTrace();
		}
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
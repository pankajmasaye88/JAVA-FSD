package RetrieveData;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listall")
public class ListAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String username="root";
		String password="Pankaj@123";
		PrintWriter out= response.getWriter();
		try {
			Class.forName(driver);

			Connection con= DriverManager.getConnection(url, username, password);	
				if(con!=null)
				{
					out.print("Database Connnection Established");
					Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
					ResultSet result  =stmt.executeQuery("select * from eproduct");
					out.print("<h1>Product list</h1><br>");
					while(result.next())
					{
						out.print(result.getInt(1)+"\t\t"+result.getString(2)+"\t\t"+result.getBigDecimal(3).toString()+"\t\t"+result.getTimestamp(4).toString()+"<br>");
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
		doGet(request, response);
	}
}
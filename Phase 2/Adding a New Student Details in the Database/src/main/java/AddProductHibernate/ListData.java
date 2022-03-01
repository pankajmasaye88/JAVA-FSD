package AddProductHibernate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebServlet("/list")
public class ListData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		SessionFactory factory = HibernateUtilConfig.getSessionFactory();
		Session session = factory.openSession();
		
		List<Student> list= session.createQuery("from Student").list();
				
	
		
		out.print("<h1>Student Details</h1><hr>");
		for(Student s:list)
		{
			out.print(s.getId()+" "+s.getFname()+" "+s.getLname()+" "+s.getEmail()+"<br>");
		
		}
		
		session.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package AddProductHibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/add")
public class addData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");

		SessionFactory factory = HibernateUtilConfig.getSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		Student s1 = new Student(fname,lname,email,password);
		session.save(s1);
		t.commit();
		session.close();
		response.getWriter().print("<h1 align='center'>Data Inserted Successfully</h1>");
		
		out.print("<a href='list'>Click here for the list</a>");
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

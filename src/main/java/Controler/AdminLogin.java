package Controler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.AdminBean;
@WebServlet("/alogin")

public class AdminLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("adminmail");
		String pass = req.getParameter("adminpassword");
		
		Dao d1 = new Dao();
		try {
			AdminBean admin = d1.VerifyBymail(email);
			if(admin!=null) {
				if(admin.getApassword().equals(pass)) {
					RequestDispatcher rd  = req.getRequestDispatcher("home.jsp");
					rd.include(req, resp);
				}
				else {
					req.setAttribute("msg", "Please enter correct password!!!");
					RequestDispatcher rd = req.getRequestDispatcher("Alogin.jsp");
					rd.include(req, resp);
				}
			}
			else {
				req.setAttribute("msg", "please enter correct email!!!");
				RequestDispatcher rd = req.getRequestDispatcher("Alogin.jsp");
				rd.include(req, resp);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

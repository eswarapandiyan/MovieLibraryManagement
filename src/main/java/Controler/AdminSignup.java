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
@WebServlet("/asignup")
public class AdminSignup extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id = Integer.parseInt(req.getParameter("adminid"));
	String name = req.getParameter("adminname");
	long contact = Long.parseLong(req.getParameter("admincontact"));
	String mail = req.getParameter("adminmail");
	String pass = req.getParameter("adminpassword");
	
	AdminBean admin = new AdminBean();
	admin.setAid(id);
	admin.setAname(name);
	admin.setAcontact(contact);
	admin.setAmail(mail);
	admin.setApassword(pass);
	
	Dao data =new Dao();
	try {
		int d1=data.Admindata(admin);
		if(d1>0) {
		resp.sendRedirect("Alogin.jsp");
		}
		else {
			req.setAttribute("msg", "Please enter valid data!!!");
			RequestDispatcher rd = req.getRequestDispatcher("Asignup.jsp");
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

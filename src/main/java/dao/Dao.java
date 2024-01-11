package dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.AdminBean;

public class Dao extends HttpServlet {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/movie library", "root", "root");
	}

	public int Admindata(AdminBean admin) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();

		PreparedStatement pst = conn.prepareStatement("insert into alogin values (?,?,?,?,?)");
		pst.setInt(1, admin.getAid());
		pst.setString(2, admin.getAname());
		pst.setLong(3, admin.getAcontact());
		pst.setString(4, admin.getAmail());
		pst.setString(5, admin.getApassword());

		return pst.executeUpdate();
	}

	public AdminBean VerifyBymail(String mail) throws ClassNotFoundException, SQLException{
		Connection conn = getConnection();
		
		PreparedStatement pst = conn.prepareStatement("select * from alogin where Amail = ?");
		pst.setString(1, mail);
		ResultSet rs = pst.executeQuery();
		AdminBean a = null;
		
		if(rs.next()) {
		 a = new AdminBean();
		a.setAid(rs.getInt(1));
		a.setAname(rs.getString(2));
		a.setAcontact(rs.getLong(3));
		a.setAmail(rs.getString(4));
		a.setApassword(rs.getString(5));
			}
		return a;
		
			
	}

}

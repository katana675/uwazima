package uwazima;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Place
 */
@WebServlet("/Plece")
public class Plece extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Plece() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String view = "/WEB-INF/view/plece.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String msg="";
	    try {
		      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		      msg = "ドライバのロードに成功しました";
		    }catch (ClassNotFoundException e){
		    	System.out.println(e.getMessage());
		      msg = "ドライバのロードに失敗しました1";
		    }catch (Exception e){
		      msg = "ドライバのロードに失敗しました2";
		    }
	    System.out.println(msg);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","");
			String sql = "select * from plece where id=?";
			Statement stmt=con.createStatement(); 
			st.setString(1,kakari);
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("picture"));
				System.out.println(rs.getString("explanation"));
				System.out.println(rs.getString("distance"));
				}
			rs.close();
            stmt.close();
            con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			String view = "/WEB-INF/view/kakunin.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		doGet(request, response);
	}
}

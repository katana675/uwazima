package uwazima;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Gaiya
 */
@WebServlet("/Gaiya")
public class Gaiya extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gaiya() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getAttribute("input_name"));
		if(request.getAttribute("input_lyrics")==null) {
			try {
			      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			    }catch (ClassNotFoundException e){
			    	System.out.println(e.getMessage());
			    }catch (Exception e){
			    	System.out.println(e.getMessage());
			    }
			
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","");
				String sql = "select * from gaiya where id = 3";
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs=st.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString("lyrics"));
					String input_lyrics=rs.getString("lyrics");
				    request.setAttribute("input_lyrics",input_lyrics);
					}
				rs.close();
	            st.close();
	            con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		String view = "/WEB-INF/view/gaiya.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

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
 * Servlet implementation class Outplece
 */
@WebServlet("/Outplece")
public class Outplece extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Outplece() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/WEB-INF/view/outplece.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
	    String picture = request.getParameter("picture");
	    String explanation = request.getParameter("explanation");
	    String distance=request.getParameter("distance");
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
			String sql = "insert into plece(name,picture,explanation,distance)values(?,?,?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			System.out.println();
			st.setString(1,name);
			st.setString(2, picture);
			st.setString(3,explanation);
			st.setString(4,distance);
			ResultSet rs=st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("name"));
				System.out.println(rs.getString("picture"));
				System.out.println(rs.getString("explanation"));
				System.out.println(rs.getString("distance"));
				
				String input_name=rs.getString("name");
				String input_picture=rs.getString("picture");
				String input_explanation=rs.getString("explanation");
				String input_distance=rs.getString("distance");
				
			    request.setAttribute("input_name",input_name);
			    request.setAttribute("input_picture",input_picture);
				request.setAttribute("input_explanation",input_explanation);
			    request.setAttribute("input_distance",input_distance);
			}
			rs.close();
            st.close();
            con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}

package servlet;

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
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itemdb","root","");
			String sql = "select * from item where itemid=101";
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("itemid"));
				System.out.println(rs.getString("item_name"));
				System.out.println(rs.getInt("price"));
				int itemid=rs.getInt("itemid");
				String item_name=rs.getString("item_name");
				int price=rs.getInt("price");
			    request.setAttribute("101id", itemid);
			    request.setAttribute("101name",item_name);
			    request.setAttribute("101price",price);
				}
			rs.close();
            stmt.close();
            con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		String view = "/WEB-INF/view/search.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");		
		doGet(request, response);
	}

}

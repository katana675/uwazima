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
 * Servlet implementation class Specialty
 */
@WebServlet("/Specialty")
public class Specialty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Specialty() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getAttribute("input_name"));
		if(request.getAttribute("input_name")==null) {
			try {
			      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			    }catch (ClassNotFoundException e){
			    	System.out.println(e.getMessage());
			    }catch (Exception e){
			    	System.out.println(e.getMessage());
			    }
			
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","");
				String sql = "select * from specialty where id = 1";
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs=st.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("picture"));
					System.out.println(rs.getString("explanation"));
					String input_name=rs.getString("name");
					String input_picture=rs.getString("picture");
					String input_explanation=rs.getString("explanation");
				    request.setAttribute("input_name",input_name);
				    request.setAttribute("input_picture",input_picture);
					request.setAttribute("input_explanation",input_explanation);
				   
					}
				rs.close();
	            st.close();
	            con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		String view = "/WEB-INF/view/specialty.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		if(request.getParameter("orange")!=null) {
			System.out.println("みかん");
			String search_orange = request.getParameter("orange");
		}else if(request.getParameter("oban")!=null){
			System.out.println("大番");
			String search_oban = request.getParameter("oban");
		}else if(request.getParameter("satumaziru")!=null){
			System.out.println("さつま汁");
			String search_satumaziru = request.getParameter("satumaziru");
		}else if(request.getParameter("snapper-rice")!=null){
			System.out.println("鯛めし");
			String search_snapperrice = request.getParameter("snapper-rice");
		}else if(request.getParameter("zyakoten")!=null){
			System.out.println("じゃこ天");
			String search_zyakoten = request.getParameter("zyakoten");
		}
		
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
			String sql = "select * from plece where name=?";
			PreparedStatement st = con.prepareStatement(sql);
			if(request.getParameter("orange")!=null) {
			st.setString(1,"みかん");
			}else if(request.getParameter("oban")!=null){
			st.setString(1, "大番");
			}else if(request.getParameter("satumaziru")!=null){
			st.setString(1, "さつま汁");
			}else if(request.getParameter("snapper-rice")!=null){
			st.setString(1, "鯛めし");
			}else if(request.getParameter("zyakoten")!=null){
			st.setString(1, "じゃこ天");
			}
			ResultSet rs=st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("picture"));
				System.out.println(rs.getString("explanation"));
				String input_name=rs.getString("name");
				String input_picture=rs.getString("picture");
				String input_explanation=rs.getString("explanation");
			    request.setAttribute("input_name",input_name);
			    request.setAttribute("input_picture",input_picture);
				request.setAttribute("input_explanation",input_explanation);
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

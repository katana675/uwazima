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
 * Servlet implementation class Search_result
 */
@WebServlet("/Search_result")
public class Search_result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search_result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String search_tel = request.getParameter("phone");

	    request.setAttribute("request", search_tel);
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
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","");
			String sql = "select * from user where tel=request";
//			電話番号の変数を入れる
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("userid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("mailaddress"));
				System.out.println(rs.getString("tel"));
				System.out.println(rs.getInt("gender"));
				int userid=rs.getInt("userid");
				String name=rs.getString("name");
				String mailaddress=rs.getString("mailaddress");
				String tele=rs.getString("tel");
				int gender=rs.getInt("gender");
				String c_gender;
			    request.setAttribute("tel_userid", userid);
			    request.setAttribute("tel_name",name);
			    request.setAttribute("tel_mailaddress",mailaddress);
			    request.setAttribute("tel_tel",tele);
			    if(gender==0) {
			    	request.setAttribute("tel_gender","男性");
				}else if(gender==1) {
					request.setAttribute("tel_gender","女性");
				}else if(gender==2) {
					request.setAttribute("tel_gender","秘密");
				}else {
					request.setAttribute("tel_gender","不適切な表現です");
				}
			}
			rs.close();
            stmt.close();
            con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String view = "/WEB-INF/view/search_result.jsp";
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

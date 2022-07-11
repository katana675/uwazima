package servlet;

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
		request.setCharacterEncoding("utf-8");
		String search_tel = request.getParameter("phone");
		
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
			String sql = "select * from user where tel=?";
//			電話番号の変数を入れる
//			Statement stmt=con.createStatement(); 
//			ResultSet rs=stmt.executeQuery(sql);
			PreparedStatement st = con.prepareStatement(sql);
			System.out.println(search_tel);
			st.setString(1,search_tel);
//			st.setString(1,"09012341234");
//			st.setInt(1,1);
			ResultSet rs=st.executeQuery();
			int[] userid = new int[10];
			String[] name = new String[10];
			String[] mailaddress=new String[10];
			String[] tel=new String[10];
			int[] gender=new int[10];
			int count = 0;
//			userid=null;
			while (rs.next()) {
				System.out.println(rs.getInt("userid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("mailaddress"));
				System.out.println(rs.getString("tel"));
				System.out.println(rs.getInt("gender"));
				
//				userid[0]=rs.getInt("userid");
				userid[count] = rs.getInt("userid");
				 name[count]=rs.getString("name");
				 mailaddress[count]=rs.getString("mailaddress");
				 tel[count]=rs.getString("tel");
				 gender[count]=rs.getInt("gender");
			    
			    count++;
			}
			request.setAttribute("tel_userid", userid);
		    request.setAttribute("tel_name",name);
		    request.setAttribute("tel_mailaddress",mailaddress);
			request.setAttribute("tel_tel",tel);
		    request.setAttribute("tel_gender",gender);
			rs.close();
            st.close();
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

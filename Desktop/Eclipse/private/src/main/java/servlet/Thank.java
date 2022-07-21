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
 * Servlet implementation class Thank
 */
@WebServlet("/Thank")
public class Thank extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Thank() {
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
		String name = request.getParameter("name");
	    String mail = request.getParameter("mail");
	    String phone = request.getParameter("phone");
	    String gender=request.getParameter("gender");
	    int genders=Integer.parseInt(gender);
		
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
			String sql = "select * from user where (name=? or mailaddress=?) and tel=?";
			PreparedStatement st = con.prepareStatement(sql);
			System.out.println();
			st.setString(1,name);
			st.setString(2, mail);
			st.setString(3,phone);
			ResultSet rs=st.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("userid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("mailaddress"));
				System.out.println(rs.getString("tel"));
				System.out.println(rs.getInt("gender"));
				
				int input_id=rs.getInt("userid");
				String input_name=rs.getString("name");
				String input_mail=rs.getString("mailaddress");
				String input_tel=rs.getString("tel");
				int input_gender=rs.getInt("gender");
				request.setAttribute("input_id", input_id);
			    request.setAttribute("input_name",input_name);
			    request.setAttribute("input_mailaddress",input_mail);
				request.setAttribute("input_tel",input_tel);
			    request.setAttribute("input_gender",input_gender);
			}
			rs.close();
            st.close();
            con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String view = "/WEB-INF/view/thank.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);
//	    0=男性　1=女性　2=秘密
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
	    String mail = request.getParameter("mail");
	    String phone = request.getParameter("phone");
	    String gender=request.getParameter("gender");
	    int genders=Integer.parseInt(gender);
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
			String sql = "insert into user(name,mailaddress,tel,gender)values(?,?,?,?)";	
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,name);
			st.setString(2,mail);
			st.setString(3, phone);
			st.setInt(4, genders);
			int result = st.executeUpdate();
			st.close();
            con.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		doGet(request, response);
	}

}

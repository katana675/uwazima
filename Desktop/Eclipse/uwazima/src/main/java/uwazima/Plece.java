package uwazima;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Beanplece;

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
				String sql = "select * from plece where id = 2";
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs=st.executeQuery();
				ArrayList <Beanplece> list = new ArrayList<Beanplece>();
				int count=0;
				while (rs.next()) {
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("picture"));
					System.out.println(rs.getString("explanation"));
					System.out.println(rs.getString("distance"));
					int input_id=rs.getInt("id");
					String input_name=rs.getString("name");
					String input_picture=rs.getString("picture");
					String input_explanation=rs.getString("explanation");
					String input_distance=rs.getString("distance");
					 list.add(new Beanplece(input_id,input_name,input_picture,input_explanation,input_distance));
					    count++;
					}
				request.setAttribute("Beanplece",list );
				rs.close();
	            st.close();
	            con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		String view = "/WEB-INF/view/plece.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(view);
	    dispatcher.forward(request, response);	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		if(request.getParameter("shopping")!=null) {
			System.out.println("?????????");
			String search_shopping = request.getParameter("shopping");
			System.out.println(search_shopping);
		}else if(request.getParameter("castle")!=null){
			System.out.println("????????????");
			String search_castle = request.getParameter("castle");
		}else if(request.getParameter("shrine")!=null){
			System.out.println("????????????");
			String search_castle = request.getParameter("shrine");
		}else if(request.getParameter("land")!=null){
			System.out.println("??????????????????");
			String search_castle = request.getParameter("land");
		}else if(request.getParameter("park")!=null){
			System.out.println("????????????");
			String search_park = request.getParameter("park");
		}
		
		String msg="";
	    try {
		      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		      msg = "?????????????????????????????????????????????";
		    }catch (ClassNotFoundException e){
		    	System.out.println(e.getMessage());
		      msg = "?????????????????????????????????????????????1";
		    }catch (Exception e){
		      msg = "?????????????????????????????????????????????2";
		    }
	    System.out.println(msg);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/portfolio","root","");
			String sql = "select * from plece where name=?";
			PreparedStatement st = con.prepareStatement(sql);
			if(request.getParameter("shopping")!=null) {
			st.setString(1,"?????????");
			}else if(request.getParameter("castle")!=null){
			st.setString(1, "????????????");
			}else if(request.getParameter("shrine")!=null){
			st.setString(1, "????????????");
			}else if(request.getParameter("land")!=null){
			st.setString(1, "??????????????????");
			}else if(request.getParameter("park")!=null){
			st.setString(1, "????????????");
			}
			ResultSet rs=st.executeQuery();
			ArrayList <Beanplece> list = new ArrayList<Beanplece>();
			int count = 0;
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("picture"));
				System.out.println(rs.getString("explanation"));
				System.out.println(rs.getString("distance"));
				int input_id=rs.getInt("id");
				String input_name=rs.getString("name");
				String input_picture=rs.getString("picture");
				String input_explanation=rs.getString("explanation");
				String input_distance=rs.getString("distance");
			    list.add(new Beanplece(input_id,input_name,input_picture,input_explanation,input_distance));
			    count++;
				}
			request.setAttribute("Beanplece",list );
			rs.close();
            st.close();
            con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}
}

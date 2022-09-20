package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.QuestionsBean;
import Dao.QuestionsDao;

/**
 * Servlet implementation class Top
 */
@WebServlet("/list")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public List() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//	JSP読み込み	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
		
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 文字コードの指定
	    request.setCharacterEncoding("utf-8");
	    
		try {
			QuestionsDao dao = new QuestionsDao();
	    	ArrayList<QuestionsBean> list = (ArrayList<QuestionsBean>) dao.findAll();
	    	
	    	//データベースから取得されたレコードを1件ずつループする。
//	    	for (QuestionsBean bean : list) {
//	    		
//	    		//String question_list = null;
//	    		
//	    		int idNumber = bean.getId();
//	    		String questuinList = bean.getQuestion();
//	    		
//	    		System.out.println(bean.getId());
//	    		System.out.println(bean.getQuestion());
//	    		  
//	    		//リクエストデータをオブジェクトに登録	    		  
//	    		request.setAttribute("idNumber", idNumber);
//	    		request.setAttribute("questuinList", questuinList);
//	    		
//	    	}
	    	System.out.println(list);
	    	request.setAttribute("questionList", list);
	    	
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("Hello World");
		
		//リクエストスコープへのUserオブジェクトの登録
	    //request.setAttribute("number_id", id);
	    
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CorrectAnswersBean;
import Dao.CorrectAnswersDao;
import Dao.QuestionsBean;
import Dao.QuestionsDao;

/**
 * Servlet implementation class Top
 */
@WebServlet("/delete_confirm")
public class DeleteConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteConfirm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 文字コードの指定
	    request.setCharacterEncoding("utf-8");
	    
	    //list 削除ボタンからの値を取得
	    int delete_id = Integer.parseInt(request.getParameter("delete_id"));
	    
	    
	    try {
	    	//問題一覧取得
			QuestionsDao dao = new QuestionsDao();
	    	ArrayList<QuestionsBean> list = (ArrayList<QuestionsBean>) dao.findAll();
	    	
	    	//回答一覧取得
	    	CorrectAnswersDao dao_answer = new CorrectAnswersDao();
	    	ArrayList<CorrectAnswersBean> list_answer = (ArrayList<CorrectAnswersBean>) dao_answer.findAll();
	    	
	    	//削除IDをjspに送れるように設置する。
	    	request.setAttribute("delete_id", delete_id);
	    	
	    	//問題一覧設置
	    	request.setAttribute("questionList", list);
	    	
	    	//回答一覧設置
	    	request.setAttribute("answerList", list_answer);
	    	
	    } catch (Exception e) {
			e.printStackTrace();

		}
	
		//	JSP読み込み
		RequestDispatcher dispatcher = request.getRequestDispatcher("/delete_confirm.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		// 文字コードの指定
	    request.setCharacterEncoding("utf-8");
	    
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

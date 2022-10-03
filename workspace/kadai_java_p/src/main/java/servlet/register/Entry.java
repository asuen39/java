package servlet.register;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CorrectAnswersDao;
import Dao.QuestionsDao;

/**
 * Servlet implementation class Top
 */
@WebServlet("/register/entry")
public class Entry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Entry() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 文字コードの指定
	    request.setCharacterEncoding("utf-8");
	    
	    //formから値を取得
  		String textarea_edit = request.getParameter("textarea_edit");
  		String[] answer = request.getParameterValues("answer");
  		
  		//System.out.println(textarea_edit);
  		//System.out.println(answer);
  	    
  	    //formから値を取得 レコード登録	
  		try {
	    	//問題一覧取得
			QuestionsDao dao = new QuestionsDao();
	    	
			//回答一覧取得
	    	CorrectAnswersDao dao_answer = new CorrectAnswersDao();
	    	
	    	//削除実行ボタンからの値取得出来ているか確認
	    	//System.out.println(textarea_edit);		
			//System.out.println(answer);
	    	
	    	//登録実行 ※レコードの取得の失敗で実行されない。
	    	dao.entry(textarea_edit);
	    	
	    	int questions_id = dao.getQuestionId();
	    	
	    	for (String Answer : answer) {
	    		String answer1 = Answer;
	    		
	    		//System.out.println(questions_id);
	    		System.out.println(answer1);
	    		dao_answer.entryAnswer(questions_id, answer1);
	    	}
	    	
	    	
	    } catch (Exception e) {
			e.printStackTrace();

		}
  	    
	    
		//	JSP読み込み	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list");
		
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

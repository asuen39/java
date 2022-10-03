package servlet.register;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Top
 */
@WebServlet("/register/confirm")
public class Confirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirm() {
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
  		
  		//文字数チェック テキストエリア
  		//エラーメッセージ
  		String inputerror = null;
  		if(textarea_edit.length() < 500) {
  			request.setAttribute("textAreaEdit", textarea_edit);
  		} else {
  			inputerror = "textarea_edit_error";
  			//入力画面へ遷移	    		   
  			response.sendRedirect("/kadai_java_p/register?inputerror=" + inputerror);
  			return;
  		}
  	    
  	    //文字数チェック 答え一覧
  	    for (String checkAnswer : answer) {
  	    	if(checkAnswer.length() < 200) {
  	    		//nullや空文字の影響の為java側で処理をせずjspに渡す
  	    		request.setAttribute("answerList", answer);
  	  	  	    
  	    		//残しておく
  	  	  	    //String[] answerAry = new String[answer.length];
  	  	  	    //for (int i = 0; i < answer.length; i++) {
  	  	  	    //	if (answer[i] != null && !"".equals(answer[i])) {
	  	  	  	//	  answerAry[i] = answer[i];
		  	  	//    }
  	  	  	    //}
  	  	  	    //request.setAttribute("answerList", answerAry);
  	    	} else {
  	    		inputerror = "answer_error";
  	  			//入力画面へ遷移	    		   
  	    		response.sendRedirect("/kadai_java_p/register?inputerror=" + inputerror);
  	  			return;
  	    	}
  	    }
  	    
  	    //エラー
  	    String error_m = null;
  	    
  	    //エラーをjspに渡す。
  	    request.setAttribute("error_M", error_m);
  	    
	    
		//	JSP読み込み	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/register/confirm.jsp");
		
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

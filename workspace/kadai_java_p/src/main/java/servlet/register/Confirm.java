package servlet.register;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
  		
  		//文字数チェック テキストエリア
  		//エラーメッセージ
  		String inputerror = null;
  		if(textarea_edit.length() < 500) {
  			request.setAttribute("textAreaEdit", textarea_edit);
  		} else {
  			inputerror = "指定の文字数より多いです";
  			//入力画面へ遷移	    		   
  			response.sendRedirect("/kadai_java_p/register");
  			return;
  			
  			//エラーになった為コメントアウト。エラー文章をどうやっておくろうか。
  			//String disp = "/register";
  			//RequestDispatcher dispatch = request.getRequestDispatcher(disp);
  			
  			//dispatch.forward(request, response);
  		}
  	    
  	    
  	    //文字数チェック 答え一覧
  	    for (String checkAnswer : answer) {
  	    	if(checkAnswer.length() < 200) {
  	    		//System.out.println(checkAnswer);
  	    		//この形式でjspに複数のnameを送ってみる。
  	  	  	    List<String> answerall = Arrays.asList( answer );
  	  	  	    //System.out.println(answerall);
  	  	  	    
  	  	  	    //nullを弾こうとしてみたが弾けない。
  	  	  	    answerall.removeAll(Collections.singleton(null));
  	  	  	    
  	  	  	    //System.out.println(answerall);
  	  	  	    
  	  	  	    //request.setAttribute("answerList", answerall);
  	  	  	    request.setAttribute("answerList", answerall);
  	    	} else {
  	    		inputerror = "指定の文字数より多いです";
  	  			//入力画面へ遷移	    		   
  	  			response.sendRedirect("/kadai_java_p/register");
  	  			return;
  	    	}
  	    }
  	    
	    
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

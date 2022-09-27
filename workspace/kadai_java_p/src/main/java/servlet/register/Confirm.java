package servlet.register;

import java.io.IOException;
import java.util.Arrays;
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
  		

  		String answer[] = request.getParameterValues("answer");
  		//コンソールに結果表示		
  	    System.out.println(textarea_edit);
  	    //System.out.println(answer);
  	    
  	    request.setAttribute("textAreaEdit", textarea_edit);
  	    
  	    //この形式でjspに複数のnameを送ってみる。
  	    List<String> answerall = Arrays.asList( answer );
  	    
  	    request.setAttribute("answerList", answerall);
  	    
  	    
  	    
  	    
  	    //取得された答え一覧を1件ずつループ jspで表示されないからコメント
//  	    if (answer != null){
//  	    	for (int i = 0 ; i < answer.length ; i++){
//  	    		System.out.println(answer[i]);
//  	    		request.setAttribute("answerList", answer[i]);
//  	        }
//	    }
	    
	    
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

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Dao.QuestionsBean" %>
<%@ page import="Dao.CorrectAnswersBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete_confirm</title>
<!-- CSS読み込み -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
</head>
<body>
<!-- JS読み込み -->
<script type="text/javascript" src="./js/all.js"></script>
<script type="text/javascript" src="./js/delete_confirm.js"></script>

<!-- 削除ID取得 -->
<% int delete_id = (int)request.getAttribute("delete_id"); %>

<!-- 必要無くなるみたいだからコメントアウト -->
<!--   ArrayList<QuestionsBean> Questionslist = (ArrayList<QuestionsBean>) request.getAttribute("questionList"); -->

<!-- 問題一覧のリクエストデータの取得 -->
<% String QuestionsBean = (String)request.getAttribute("questionList"); %>

<!-- テストoutputDataが未定義扱いになる -->
<%= QuestionsBean.outputData() %>

<!-- 回答データ一覧のリクエスト取得 -->
<% ArrayList<CorrectAnswersBean> AnswerList = (ArrayList<CorrectAnswersBean>) request.getAttribute("answerList"); %>

	<div class="global_area">
		<div class="top_area">
			<div class="top_box">
				<button type="button" class="auto-right logout_button" onclick="Top()">Top</button>
				<button type="button" class="auto-right logout_button" onclick="Logout()">logout</button>
			</div>
			<div class="main_area">
				<ul >
					<%for(int i = 0; i < Questionslist.size(); i++){%>
						<%QuestionsBean questionsBean = Questionslist.get(i);%>
						
						
						<%if(questionsBean.getId() == delete_id ) { %>
							<li class="edit_area flex_end">問題: 
								<label class="label_textarea"><%=questionsBean.getQuestion()%></label>
							</li>
							<li class="edit_area flex_end">
								<ul class="edit_area flex_end" style="width: 96%;">
									<li class="edit_area">答え: </li>
									<li style="width: 94%;">
										<ul>
										<%for(int a = 0; a < AnswerList.size(); a++){%>
											<%CorrectAnswersBean ul_AnswerList = AnswerList.get(a);%>
											
											<%if(delete_id == ul_AnswerList.getQuestionId() ) { %>
											<li class="edit_area edit_area_answer">
												<label class="label_long"><%=ul_AnswerList.getAnswer()%></label>
											</li>
											<% } %>
										<% } %>	
										</ul>
									</li>							
								</ul>
							</li>
						<% } %>
					<% } %>
				</ul>
			</div>
			<div class="top_box">
				<button type="button" class="auto-right logout_button" onclick="Return()">戻る</button>
				<button class="auto-right logout_button">削除</button>	
			</div>
		</div>
	</div>
</body>
</html>
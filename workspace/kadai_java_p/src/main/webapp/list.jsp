<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Dao.QuestionsBean" %>
<%@ page import="Dao.CorrectAnswersBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<!-- CSS読み込み -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
</head>
<body>
<!-- JS読み込み -->
<script type="text/javascript" src="./js/list.js"></script>

<!-- 問題一覧のリクエストデータの取得 -->
<% ArrayList<QuestionsBean> Questionslist = (ArrayList<QuestionsBean>) request.getAttribute("questionList"); %>

<!-- 回答データ一覧のリクエスト取得 -->
<% ArrayList<CorrectAnswersBean> ListAnser = (ArrayList<CorrectAnswersBean>) request.getAttribute("listAnser"); %>

	<div class="global_area">
		<div class="top_area">
			<div class="top_box">
				<button type="button" class="auto-right logout_button" onclick="Top()">Top</button>
				<button type="button" class="auto-right logout_button" onclick="Logout()">logout</button>
			</div>
			<div class="center_auto">
				<button class="logout_button">新規登録</button>
			</div>
			<div class="main_area">
				 <%for(int i = 0; i < Questionslist.size(); i++){%>
				    <%QuestionsBean questionsBean = Questionslist.get(i);%>
				    
				    <ul>
						<li class="list_area">問題:<span class="toi_number"><%=questionsBean.getId()%></span>
							<label class="list_label"><%=questionsBean.getQuestion()%></label>
							<button>編集</button>
							<button>削除</button>
						</li>
						<%for(int a = 0; a < ListAnser.size(); a++){%>
							<%CorrectAnswersBean ul_listAnser = ListAnser.get(a);%>
							
							
							<%if(questionsBean.getId() == ul_listAnser.getQuestionId() ) { %>
								<li class="list_area flex_start mt10">
									
									<!-- この辺りに答えの番号のカウント文を作りたい -->
									<% for(int count = 1; count <= ul_listAnser.getQuestionId(); count++ ) {%>
										答え: <%= count %>
									<% } %>
									<label class="list_label ml25"><%=ul_listAnser.getAnswer()%></label>
								</li>
								
							<% } %>
						<% } %>
					</ul>
				<% } %>
			
			</div>
		</div>
	</div>
</body>
</html>
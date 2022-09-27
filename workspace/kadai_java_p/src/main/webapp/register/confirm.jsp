<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register/confirm</title>
<!-- CSS読み込み -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
</head>
<body>
<!-- JS読み込み -->
<script type="text/javascript" src="/kadai_java_p/js/all.js"></script>

<% String TextAreaEdit = (String)request.getAttribute("textAreaEdit"); %>

<% List<String> AnswerList = (List<String>) request.getAttribute("answerList"); %>

<%= AnswerList.size() %>

	<div class="global_area">
		<div class="top_area">
			<div class="top_box">
				<button type="button" class="auto-right logout_button" onclick="Top()">Top</button>
				<button type="button" class="auto-right logout_button" onclick="Logout()">logout</button>
			</div>
			<div class="main_area">
				<ul>
					<li class="edit_area flex_end">問題: 
						<label class="label_textarea"><%= TextAreaEdit %></label>
					</li>
					<!-- name一旦コメント -->
					<!--  for( int i = 0; i < AnswerList.size(); i++ ) {%>
						 AnswerList.get(i)%>
					 }  -->
					

					<li class="edit_area flex_end">答え: 
						<label class="label_long"></label>
					</li>
					<li class="edit_area flex_end">
						<label class="label_long"></label>
					</li>
					<li class="edit_area flex_end">
						<label class="label_long"></label>
					</li>
				</ul>
			</div>
			<div class="top_box">
				<button class="auto-right logout_button">戻る</button>
				<button class="auto-right logout_button">登録</button>
			</div>
		</div>
	</div>
</body>
</html>
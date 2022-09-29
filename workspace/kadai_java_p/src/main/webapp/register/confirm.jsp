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
<script type="text/javascript" src="/kadai_java_p/js/register/confirm.js"></script>

<% String TextAreaEdit = (String)request.getAttribute("textAreaEdit"); %>

<% String[] AnswerList = (String[])request.getAttribute("answerList"); %>
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
					<li class="edit_area flex_end">
						<ul class="edit_area flex_end" style="width: 96%;">
							<li class="edit_area">答え: </li>
							<li style="width: 94%;">
								<ul>
								<%for( int i = 0; i < AnswerList.length; i++){ %>
									<!-- nullや空文字判定 -->		
									<% if (AnswerList[i] != null && !"".equals(AnswerList[i])) { %>
										<li class="edit_area flex_end edit_area_answer">
											<label class="label_long"><%= AnswerList[i] %></label>
										</li>
									<% } %>
								<% } %>
								</ul>
							</li>							
						</ul>
					</li>
				</ul>
			</div>
			<div class="top_box">
				<button type="button" class="auto-right logout_button" onclick="Return()">戻る</button>
				<button class="auto-right logout_button">登録</button>
			</div>
		</div>
	</div>
</body>
</html>
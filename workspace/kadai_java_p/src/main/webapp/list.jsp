<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<!-- リクエストデータの取得 -->
<% String idNumber = (String)request.getAttribute("idNumber"); %>
<% String questuinList = (String)request.getAttribute("questuinList"); %>


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
				<ul>
					<li class="list_area">問題:<span class="toi_number"><%= idNumber %></span>
						<label class="list_label"><%= questuinList %></label>
						<button>編集</button>
						<button>削除</button>
					</li>
					<li class="list_area">答え: 1
						<label></label>
					</li>
					<li class="list_area">答え: 2
						<label></label>
					</li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>
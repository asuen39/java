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
	<div class="global_area">
		<div class="top_area">
			<div class="top_box">
				<button class="auto-right logout_button">Top</button>
				<button class="auto-right logout_button">logout</button>
			</div>
			<div class="center_auto">
				<button class="logout_button">新規登録</button>
			</div>
			<div class="main_area">
				<ul>
					<li class="list_area">問題:<span class="toi_number">1</span>
						<label class="list_label">問題の1問目です。適当なところで…で端折りましょう。</label>
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
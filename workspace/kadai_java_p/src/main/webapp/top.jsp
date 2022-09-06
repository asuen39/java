<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>top</title>
<!-- CSS読み込み -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
</head>
<body>
	<div class="global_area">
		<div class="top_area">
			<button class="auto-right logout_button">logout</button>
			<form>
				<button class="top_button">問題と答えを確認・登録する ＞</button>
				<button class="top_button">テストをする ＞</button>
				<button class="top_button">過去の採点結果をみる ＞</button>
			</form>
		</div>
	</div>
</body>
</html>
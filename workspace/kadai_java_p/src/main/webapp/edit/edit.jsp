<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit</title>
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
			<div class="main_area">
				<ul>
					<li class="edit_area">問題番号:<span class="toi_number">1</span></li>
					<li class="edit_area">問題: 
						<textarea name="textarea_edit" rows="6" cols="85"></textarea>
					</li>
					<li class="edit_area">答え: 
						<input type="text">
					</li>
					<li class="edit_area">
						<span style="width:40px;"></span>
						<input type="text" style="width: 84%;">
						<button>削除</button>
					</li>
					<li class="edit_area">
						<span style="width:40px;"></span>
						<input type="text" style="width: 84%;">
						<button>削除</button>
					</li>
				</ul>
			</div>
			<div class="top_box">
				<button class="auto-right logout_button">戻る</button>
				<button class="auto-right logout_button">確認</button>
				<button class="auto-right logout_button">追加</button>
			</div>
		</div>
	</div>
</body>
</html>
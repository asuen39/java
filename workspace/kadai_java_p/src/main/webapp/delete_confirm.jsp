<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete_confirm</title>
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
					<li class="edit_area flex_end">問題: 
						<label class="label_textarea"></label>
					</li>
					<li class="edit_area flex_end">答え: 
						<input type="text" style="width:89%;">
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
				<button class="auto-right logout_button">削除</button>	
			</div>
		</div>
	</div>
</body>
</html>
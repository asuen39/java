<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./Login" method="post">
	<div style="display: flex; flex-flow: column; align-items: center;
    width: 500px;
    margin: auto;
    height: 500px;
    justify-content: center;">
		<div style="width: 100%; margin: 10px 0;"><label style="display: inline-block; text-align: right; width: 35px;">ID:</label><input type="text" name="id" style="width: 90%; height:30px;"></div>
		<div style="width: 100%; margin: 10px 0;"><label style="display: inline-block; text-align: right; width: 35px;">pw:</label><input type="text" name="id" style="width: 90%; height:30px;"></div>
		<button type="submit" style=" padding: 5px 25px;">login</button>
	</div>
</form>
</body>
</html>
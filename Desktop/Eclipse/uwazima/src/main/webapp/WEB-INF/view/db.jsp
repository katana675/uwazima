<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>登録画面</title>
		</head>
		<body>
			<form method="post" action="./result">	
				<h3><input type="text" name="name">名前</h3><br>
				<h3><input type="text" name="pass">写真のパス</h3><br>
				<h3><input type="text" name="explanation">説明</h3><br>
				<h3><input type="text" name="distance">距離</h3>
				<button type="submit">新規登録</button>
			</form>
		</body>
	</html>
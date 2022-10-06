<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>場所入力フォーム</title>
</head>
<body>
<form method="post" action="./Pthank">
		<h3>名前<input type="text" name="name"></h3><br>
		<h3>写真<input type="text" name="picture"></h3><br>
		<h3>説明<input type="text" name="explanation"></h3><br>
		<h4>車で●●分の距離にあります。</h4><br>
		<h3>●●に入る数字を入力<input type="text" name="distance"></h3><br>
		<button type="submit">送信</button>
</body>
</html>
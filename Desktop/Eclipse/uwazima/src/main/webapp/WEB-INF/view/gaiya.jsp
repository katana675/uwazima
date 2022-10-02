<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<link rel="stylesheet" href="${pageContext.request.contextPath}/css/gaiya.css">
			<title>gaiya on road</title>
		</head>
		<body>
			<div class="window">
				<div class="left">
					<iframe width="560" height="315" src="https://www.youtube.com/embed/9mBhWQ-_iqM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
				</div>
				<div class="right">
					<%=request.getAttribute("input_lyrics")%>
				</div>
			</div>
		</body>
		<footer>
			<h2 style="text-align:center; background: #00ff00">2022.HIROSAWA reserved</h2>
		</footer>
	</html>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>loginpage</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="displat-3">로그인</h1>
		</div>
	</div>
	<form name="loginform" action="loginprocess.jsp" method="post">
		<div class="container">
			<p> 아이디 : <input type="text" name="id">
			<p> 비밀번호 : <input type="password" name="password">
			<p> <input type="button" value="로그인" onclick="checkLogin()">
		</div>
	</form>
</body>
</html>
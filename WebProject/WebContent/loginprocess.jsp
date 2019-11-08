<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>로그인</title>
</head>
<body>
	<h3>로그인 성공</h3>
	<%
		request.setCharacterEncoding("utf-8");
		String ID = request.getParameter(ID);
		String password = request.getParameter("password");
	%>
</body>
</html>
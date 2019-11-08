<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">로그인</h1>
		</div>
	</div>
	<div class="container" align="center">


		<form class="loginpage" action="#" method="post">
			<div class="form-group">
				<div class="col-sm-3">
					<label>Id</label> <input type="text" class="form-control" name="id">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-3">
					<label>Password</label> <input type="password" class="form-control"
						name="password">
				</div>
			</div>
			<div class="col-sm-3">
				<button class="form-control" type="button">로그인</button>
			</div>
		</form>

	</div>
</body>
</html>
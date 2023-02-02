<%-- 
    Document   : login
    Created on : 2023.1 
    Author     : park
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<title>카드연체시스템 로그인화면</title>
<link rel="stylesheet" href="style.css">
<script src="jquery-3.4.1.js"></script>
<script type="text/javascript">

	function chk() {

		var id =document.login.id.value;
		var password =document.login.password.value;
        
		if(id == null || id == "") {
			alert("사용자 ID를 입력하시오.")
			return false;
		}

		if(password == null || password == "") {
			alert("사용자 password를 입력하시오.")
			return false;
		}

	}
</script>
</head>
<body>
	<div class="background">
		<form name="login" method="post" action="./Test.do">
		<section class="login-form">
			<h1>카드연체시스템 로그인화면</h1>
				<div class="int-area" >
				<div class="name">USER NAME</div>
					<input type="text" name="id" id="id"  >
				</div>
				<div class="int-area" >
				<div class="name">PASSWORD</div>
					<input type="password" name="password" id="password"  >
				</div>
				<div class="btn-area">
					<button type="submit" onClick="chk()">LOGIN</button>
				</div>
		</form>
		<div class="caption">
			<a href="#">Forgot Password?</a>
		</div>	
	</section>
	</div>
	
</body>
</html>
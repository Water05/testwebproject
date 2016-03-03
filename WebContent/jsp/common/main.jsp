<!doctype html>
<html>
<head>
<%@ page contentType="text/html; charset=UTF-8"%>
<meta charset="utf-8">
<title>secondPage</title>
<meta name="description" content="">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/framework/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/module/login.js"></script>
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1">
</head>
<body>
	<div class="web_bg"> 
	</div>
	<div class="cnt_left moveInLeft" style="color:#fff;line-height:30px;letter-spacing: 1px;font-size:14px;">
	</div>
	<div class="cnt moveInRight">
		<div class="login">
	    	<h1>系统登录</h1>
	    	<div class="login-line"></div>
	    	<div class="login-form">
	    		<p id="errorMessage" style="color:#d04437;font-family:宋体;"></p>
				<input id="username" name="username" type="text" placeholder="用户名" class="input_user" />
			    <input id="password" name="password" type="password" placeholder="密码" class="input_pwd" onKeyDown="if(event.keyCode==13){login();}" />
			    <button type="button" class="login_btn" onclick="login();" onKeyDown="if(event.keyCode==13){login();}">登 录</button>
		     </div>
		 </div>
	</div>
	<div id="whitePage" style="position:fixed;top:80%;left:15%;width:100%;height:100%;"><p style="color:#7e7e7e"> XXX</p></div>
</body>
</html>
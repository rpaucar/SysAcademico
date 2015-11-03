<%@include file="/WEB-INF/jsp/include/taglibs.jsp"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="false" %>
<jsp:useBean id="now" class="java.util.Date" scope="request" />

<!DOCTYPE html>   
<head>
	<meta charset="utf-8">
	
	<script type="text/javascript" src="<%=request.getContextPath()%>/index/js/libs/jquery.min.js"></script>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>SysAcademico</title>
	<link rel="icon" href="images/favicon.ico" type="image/x-icon" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/index/css/isr-screen.css?v=1">
	<link href="<%=request.getContextPath()%>/resources/slide/css/style.css" rel="stylesheet" type="text/css">
	<link href="<%=request.getContextPath()%>/resources/slide/css/slide.css" rel="stylesheet" type="text/css">
	
	<script src="<%=request.getContextPath()%>/resources/jquery/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/slide/js/slide.js"></script>
    
	<script type="text/javascript">
		document.write('<style type="text/css">.container-carousel{opacity:0; filter: alpha(opacity=0);}</style>');
	</script>
	<script src="<%=request.getContextPath()%>/index/js/libs/modernizr.min.js"></script>
</head>

<body class="login" onload="cleanPlaceHolder();">
<!-- Panel -->
<div id="toppanel">
	<div id="panel">
		<div class="content">
			<div  class="left">
			<form class="row-fluid form-signin" id="form-login" action="<%=request.getContextPath() %>/j_spring_security_check" method="post" AUTOCOMPLETE="off">
				<h1>Ingresar al Sistema</h1>
				<label class="grey" for="log">Usuario:</label>	
				<input class="field" type="text" name="j_username" id="username" class="textInput" autocomplete="off">
				<label class="grey" for="pwd">Clave:</label>
				<input class="field" type="password" name="j_password" id="password" class="textInput" autocomplete="off">
				<input type="text" id="passwordPlaceholder" class="textInput" style="display: none;"/>
				<input type="submit" name="submit" class="bt_register" value="Ingresar" />
			</form>
				
			</div>
                        <div class="col-md-4">
                            <h2 class="form-login">Social Logins</h2>
                            <p>Or you can login using one of the social logins bleow</p>
                            <button class="fa fa-facebook" type="button" data-ng-click="authExternalProvider('Facebook')"><i class="fa fa-facebook"></i> | Connect with Facebook</button>
                            <button class="fa fa-google-plus" type="button" data-ng-click="authExternalProvider('Google')"><i class="fa fa-google-plus"></i> | Connect with Google+</button>
                        </div>
		</div>
	</div>

	<div class="tab">
		<ul class="login">
			<li class="left">&nbsp;</li>			
			<li id="toggle">
				<a id="open" class="open" href="#">Iniciar Sesión</a>
				<a id="close" style="display: none;" class="close" href="#">Cerrar Panel</a>			
			</li>
			<li class="right">&nbsp;</li>
		</ul> 
	</div> 
</div> 
    <div id="container">	
		<div id="content" style="padding-top:100px;">
			<h1>Bienvenidos al Sistema Academico I.E Champajna</h1>
		</div>		
	</div>
</body>

</html>


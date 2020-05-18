<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.io.*" %>
<html>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<%
 String path=application.getRealPath("/");
File f=new File(path);
for(String s : f.list()){
out.println(s+"<br>");
                out.println("<a href="+s+">"+ s +" </a><br>");
}
    
 out.println(path);

String path1 = application.getRealPath("/");       //=>     c:~~~/플젝명/
String path2 = application.getRealPath("/aa/bb");  //=>     c:~~~/플젝명/aa/bb
 out.println(path1); 


%>
<br><button type="button" id="btnJoin" class="btn btn-success">JOIN</button>

<script>
	$(document).click(function(){
		$('#btnJoin').click(function(){
			location.href = "joinForm.jsp";
		});
	});
</script>
</body>
</html>

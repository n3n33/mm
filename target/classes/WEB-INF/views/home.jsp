<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.io.*" %>
<html>
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


</body>
</html>

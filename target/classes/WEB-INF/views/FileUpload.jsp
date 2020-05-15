<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.io.*" %>
<html>
<head>
<!-- <script type="text/javascript">
		$(document).ready(function(){
			var formObj = $("form[name='writeForm']");
			$(".write_btn").on("click", function(){
				if(fn_valiChk()){
					return false;
				}
				formObj.attr("action", "/board/write");
				formObj.attr("method", "post");
				formObj.submit();
			});
		})
		function fn_valiChk(){
			var regForm = $("form[name='writeForm'] .chk").length;
			}
		
	</script> -->
<title>Insert title here</title>
</head>
<body>
		<form name="writeForm" method="post" action="/gome/update"
			enctype="multipart/form-data">
			<input type="file" name="file">
			<button class="write_btn" type="submit">작성</button>
		</form>
</body>
</html>
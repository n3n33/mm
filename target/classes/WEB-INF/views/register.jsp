<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<head>
<title>회원가입</title>
</head>
<body>
<h2>회원가입</h2>
<form method="post" action="/demo_pro/register">
  <div class="form-group">
    <input type="text" class="form-control" id="userId" name="userId" placeholder="User Name">
  </div>
  <div class="form-group">
    <input type="password" class="form-control" id="userPw" name="userPw" placeholder="Password">
  </div>
  <button type="submit" class="submit" id="submit">Sign in</button>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/updateCheck.css"/>
</head>
<body>
    <div class="container">
        <h1>비밀번호를 입력하세요</h1>
        <form action="/updateCheck" method="post">
            <input type="password" name="pwdCheck" required>
            <span id="checkSpan"></span>
            <button type="submit">확인</button>
        </form>
    </div>
</body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>关于我单页-会飞的猪</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<article>
		<div class="whitebg about">
			<jsp:include page="about/monologue.jsp"></jsp:include>
			<jsp:include page="about/course.jsp"></jsp:include>
			<jsp:include page="about/myblogs.jsp"></jsp:include>
			<jsp:include page="about/join_us.jsp"></jsp:include>
		</div>
	</article>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
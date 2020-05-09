<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列表页-会飞的猪</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<article>
		<!--lbox begin-->
		<div class="lbox">
			<jsp:include page="list2/title.jsp"></jsp:include>
			<jsp:include page="list2/diary.jsp"></jsp:include>
			<jsp:include page="list2/the_notes.jsp"></jsp:include>
			<jsp:include page="list2/program.jsp"></jsp:include>
			<jsp:include page="list2/ana.jsp"></jsp:include>
			<!--bloglist end-->
		</div>
		<div class="rbox">
			<jsp:include page="sidebar/paihang.jsp"></jsp:include>
			<jsp:include page="sidebar/tuijian.jsp"></jsp:include>
			<jsp:include page="sidebar/custom.jsp"></jsp:include>
			<jsp:include page="sidebar/tag.jsp"></jsp:include>
			<jsp:include page="sidebar/bounceInRight.jsp"></jsp:include>
			<jsp:include page="sidebar/custom2.jsp"></jsp:include>
			<jsp:include page="sidebar/tongji.jsp"></jsp:include>
		</div>
	</article>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
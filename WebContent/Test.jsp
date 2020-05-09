<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="DataServlet?method=selectAllData"></jsp:include>
	<c:forEach items="${ImgData }" var="ImgData" end="1">
		<li>
		<img src="${ImgData.imgSrc }">
		<span>${ImgData.imgTitle }</span><a href="${ImgData.imgHref }"></a></li>
	</c:forEach>
</body>
</html>
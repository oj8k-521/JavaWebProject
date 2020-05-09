<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>栏目一</title>
</head>
<body>
	<div class="newsitem">
		<div class="newspic">
			<ul>
				<c:forEach items="${ImgData }" var="ImgData">
					<li><a href="${ImgData.imgHref }"><img
							src="${ImgData.imgSrc }"><span>${ImgData.imgTitle }</span></a>
					</li>
				</c:forEach>
			</ul>
		</div>
		<ul class="newslist">
			<c:forEach items="${ListData }" var="ListData" begin="5">
				<li><i></i> <a href="/">${ListData.title }</a>
					<p>${ListData.content }</p></li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
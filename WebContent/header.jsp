<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>会飞的猪</title>
<meta name="keywords" content="blog" />
<meta name="description" content="blog" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/base.css" rel="stylesheet">
<link href="css/m.css" rel="stylesheet">
<script src="js/jquery-1.8.3.min.js"></script>
<script src="js/comm.js"></script>
<link rel="shortcut icon"
	href="https://ojbk520.cn/content/templates/fee/static/img/favicon.ico">
<style type="text/css">
#top-img {
	background: url(gif/top.gif);
	height: 5px;
	position: fixed;
	top: 0px;
	width: 100%;
	Z-index: 999;
	top: 0px;
	position: fixed;
}
</style>
<div id="top-img"></div>
</head>
<body>
	<header id="header">
		<div class="navbox">
			<h2 id="mnavh">
				<span class="navicon"></span>
			</h2>
			<div class="logo">
				<a href="#">会飞的猪</a>
			</div>
			<nav>
				<ul id="starlist">
					<li><a href="index.jsp">网站首页</a></li>
					<li><a href="about.jsp">关于我们</a></li>
					<li class="menu"><a href="list2.jsp">产品展示</a>
						<ul class="sub">
							<li><a href="info.jsp">产品详情</a></li>
						</ul> <span></span></li>
					<li class="menu"><a href="list1.jsp">新闻资讯</a>
						<ul class="sub">
							<li><a href="list.jsp">咨询详情</a></li>
						</ul> <span></span></li>
					<li><a href="daohang.jsp">联系我们</a></li>
					<li><a href="time.jsp">留言</a></li>
				</ul>
			</nav>
			<div class="searchico"></div>
		</div>
	</header>
	<div class="searchbox">
		<div class="search">
			<form action="/e/search/index.php" method="post" name="searchform"
				id="searchform">
				<input name="keyboard" id="keyboard" class="input_text"
					value="请输入关键字词" style="color: rgb(153, 153, 153);"
					onFocus="if(value=='请输入关键字词'){this.style.color='#000';value=''}"
					onBlur="if(value==''){this.style.color='#999';value='请输入关键字词'}"
					type="text"> <input name="show" value="title" type="hidden">
				<input name="tempid" value="1" type="hidden"> <input
					name="tbname" value="news" type="hidden"> <input
					name="Submit" class="input_submit" value="搜索" type="submit">
			</form>
		</div>
		<div class="searchclose"></div>
	</div>
	<!--top end-->
	<jsp:include page="Effects.jsp"></jsp:include>
</body>
</html>
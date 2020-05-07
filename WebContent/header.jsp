<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
					<li><a href="about.html">关于我们</a></li>
					<li class="menu"><a href="list3.html">产品展示</a>
						<ul class="sub">
							<li><a href="/6">产品详情</a></li>
						</ul> <span></span></li>
					<li class="menu"><a href="list3.html">新闻资讯</a>
						<ul class="sub">
							<li><a href="/6">咨询详情</a></li>
						</ul> <span></span></li>
					<li><a href="daohang.html">联系我们</a></li>
					<li><a href="about.html">留言</a></li>
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
</body>
</html>
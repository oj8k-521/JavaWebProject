<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>特效库</title>
<link href="css/loading.css" rel="stylesheet">
</head>
<body>
	<!--点击特效-->
	<canvas class="fireworks"
		style="position: fixed; left: 0; top: 0; z-index: 99999999; pointer-events: none;"></canvas>
	<script type="text/javascript" src="js/dj.js"></script>
	<!--下雪特效-->
	<canvas id="Snow"></canvas>
	<script type="text/javascript" src="js/xx.js"></script>
	<!--打字特效-->
	<script type="text/javascript" src="js/dazi.js"></script>
	<script>
		POWERMODE.colorful = true;
		POWERMODE.shake = false;
		document.body.addEventListener('input', POWERMODE);
	</script>
	<!--加载特效-->
	<div id="preloader" style="background-color: #626060ad;">
		<div id="loader"></div>
	</div>
	<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
	<script type="text/javascript">
		$(function() {
			$(window).load(function() {
				$("#preloader").fadeOut(1000);
				$("#loader").fadeOut(1500);
			});
		});
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	<style>
		html, body
		{
			width : 100%;
			height : 100%;
			margin : 0px;
			padding : 0px;
		}
		
		canvas
		{
			display : block;		
		}
	</style>

	
	<script type="text/javascript">
		function OnResize ()
		{
			var canvas = document.getElementById ('fullscreen');
			canvas.width = document.body.clientWidth;
			canvas.height = document.body.clientHeight;
		}
		
		function OnLoad ()
		{
			OnResize ();
			LoadOnline3DModels ();
			alert(11111);
		}
	
		window.addEventListener ('load', OnLoad, true);
		window.addEventListener ('resize', OnResize, true);
	</script>
	
</head>

<body>
<input type="text" value=${pageContext.request.contextPath}></input>
	<canvas id="fullscreen" class="3dviewer" sourcefiles="testfiles/texturedcube.obj|testfiles/texturedcube.mtl|testfiles/texture.png" width="200" height="200"></canvas>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/3D/jsmodeler/three.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/3D/jsmodeler/jsmodeler.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/3D/jsmodeler/jsmodeler.ext.three.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/3D/embeddable/include/online3dembedder.js"></script>
</html>
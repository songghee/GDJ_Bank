<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Personal - Start Bootstrap Theme</title>
       
        <!-- Favicon-->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/head_css.jsp"></c:import>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
			<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
			<c:import url="../temps/header.jsp"></c:import>
		
			<h1>${detail.productNum}</h1>
			<h1>${detail.productName}</h1>
			<h1>${detail.productContents}</h1>
			<h1>${detail.productRate}</h1>
			<h1>${detail.productJumsu}</h1>
		
		<a href="./update?productNum=${detail.productNum}">update</a>
        </main>
	
	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
    </body>
</html>

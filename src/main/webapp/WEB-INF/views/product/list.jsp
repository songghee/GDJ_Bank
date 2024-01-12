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
        <!-- 주소 수정 필수 -->
        <c:import url="../temps/head_css.jsp"></c:import>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <!-- 주소 수정 필수 -->
			<c:import url="../temps/header.jsp"></c:import>
            
            <div class="container px-5 my-5">
            	<div class="text-center mb-5">
            		<h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">Product List</span></h1>
            	</div>
            </div>
        
        	<div>
        		<a href="" class="btn btn-danger">상품등록</a>
        	</div>
        
        </main>
        <!-- Footer-->
        <!-- 주소 수정 필수 -->
        <c:import url="../temps/footer.jsp"></c:import>

    </body>
</html>
    
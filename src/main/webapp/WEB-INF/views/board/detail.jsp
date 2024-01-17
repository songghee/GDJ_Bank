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
        <title>BoardList</title>
        <!-- 주소 수정 필수 -->
        <c:import url="../temps/head_css.jsp"></c:import>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <!-- 주소 수정 필수 -->
			<c:import url="../temps/header.jsp"></c:import>
            
            <!-- Project-->
            <div class="card overflow-hidden shadow rounded-4 border-0 mb-5">
                <div class="card-body p-0">
                    <div class="d-flex align-items-center">
                        <div class="p-5">
                            <h2 class="fw-bolder">Project Name 1</h2>
                            <div>
                                ${boardDTO.boardContents}
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </main>
        <!-- Footer-->
        <!-- 주소 수정 필수 -->
        <c:import url="../temps/footer.jsp"></c:import>

    </body>
</html>
    
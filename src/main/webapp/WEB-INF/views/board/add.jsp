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
        <title>BoardAdd</title>
        <!-- 주소 수정 필수 -->
        <c:import url="../temps/head_css.jsp"></c:import>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <!-- 주소 수정 필수 -->
			<c:import url="../temps/header.jsp"></c:import>
            
            <section class="py-5">
                <div class="text-center mb-5">
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">BoardAdd</span></h1>
                </div>
                <div class="row gx-5 justify-content-center">
                    <div class="col-lg-11 col-xl-9 col-xxl-8">
                        <form class="form-control" action="./add" method="POST" enctype="multipart/form-data">
                            <div class="mb-3">
                                <label for="title" class="form-label">Email address</label>
                                <input type="text" class="form-control" id="title" placeholder="boardTitle">
                            </div>
                            <div class="mb-3">
                                <label for="writer" class="form-label">Email address</label>
                                <input type="text" class="form-control" id="writer" placeholder="boardWriter">
                            </div>
                            <div class="mb-3">
                                <label for="content" class="form-label">Example textarea</label>
                                <textarea class="form-control" id="content" rows="3" name="boardContents"></textarea>
                            </div>
                            <div class="mb-3">
                                <button class="btn btn-primary">등록</button>
                            </div>
                        </form>
                    </div>
                </div>
            </section>

        </main>
        <!-- Footer-->
        <!-- 주소 수정 필수 -->
        <c:import url="../temps/footer.jsp"></c:import>

    </body>
</html>
    
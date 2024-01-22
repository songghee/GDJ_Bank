<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
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
		<section class="py-5">
			<div class="container px-5">
				<!-- Contact form-->
				<div class="bg-light rounded-4 py-5 px-4 px-md-5">
					<div class="text-center mb-5">
						<div
							class="feature bg-primary bg-gradient-primary-to-secondary text-white rounded-3 mb-3">
							<i class="bi bi-envelope"></i>
						</div>
						<h1 class="fw-bolder">추가할내용을 입력해</h1>
						<p class="lead fw-normal text-muted mb-0">신중하게해</p>
					</div>
					<div class="row gx-5 justify-content-center">
						<div class="col-lg-8 col-xl-6">
							<!-- * * * * * * * * * * * * * * *-->
							<!-- * * SB Forms Contact Form * *-->
							<!-- * * * * * * * * * * * * * * *-->
							<!-- This form is pre-integrated with SB Forms.-->
							<!-- To make this form functional, sign up at-->
							<!-- https://startbootstrap.com/solution/contact-forms-->
							<!-- to get an API token!-->
							<form id="contactForm" action="./add"
								enctype="multipart/form-data" method="post">
								<!-- Name input-->
								<div class="form-floating mb-3">
									<input class="form-control" name="productName" id="name"
										type="text" placeholder="상품명을 입력하세요" /> <label for="name">상품명</label>

								</div>
								<!-- Email address input-->
								<div class="form-floating mb-3">
									<textarea class="form-control" name="productContents"
										id="message" type="text"
										placeholder="Enter your message here..." style="height: 10rem"
										data-sb-validations="required"></textarea>
									<label for="message">상품상세</label>

								</div>




								<!-- Phone number input-->
								<div class="mb-3 form-floating">
									<label for="phone">이자율</label> <input class="form-control"
										name="productRate" id="reta" type="text" placeholder="이자율"
										data-sb-validations="required" />

								</div>


								<div class="form-floating mb-3">
									<input class="form-control" name="productJumsu" id="name"
										type="text" placeholder="상품명을 입력하세요" /> <label for="name">점수</label>
								</div>

								<!-- Phone number input-->
								<div class="mb-3">
									<label for="productFile">파일첨부</label> <input
										class="form-control" name="productFile" id="phone" type="file"
										placeholder="(123) 456-7890" /> <input class="form-control"
										name="productFile" id="phone" type="file"
										placeholder="(123) 456-7890" /> <input class="form-control"
										name="productFile" id="phone" type="file"
										placeholder="(123) 456-7890" /> <input class="form-control"
										name="productFile" id="phone" type="file"
										placeholder="(123) 456-7890" /> <input class="form-control"
										name="productFile" id="phone" type="file"
										placeholder="(123) 456-7890" />


								</div>


								<div class="d-none" id="submitErrorMessage">
									<div class="text-center text-danger mb-3">Error sending
										message!</div>
								</div>
								<!-- Submit Button-->
								<div class="d-grid">
									<button class="btn btn-primary btn-lg" id="submitButton"
										type="submit">Submit</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</section>


	</main>

	<!-- Footer -->
	<!-- 사용전 경로를 꼭 수정하세요 ~~ -->
	<c:import url="../temps/footer.jsp"></c:import>
</body>
</html>

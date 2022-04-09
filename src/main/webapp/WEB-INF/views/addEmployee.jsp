<jsp:include page="prevent.jsp" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="resources/css/reg.css">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADD EMPLOYEE</title>
</head>
<body>
	

	<form action="addEmployee" method="post">
		<div class="container register">
			<div class="row">
				<div class="col-md-3 register-left">
					<img src="https://image.ibb.co/n7oTvU/logo_white.png" alt="" />
					<h3>Welcome</h3>
					<p>You are 30 seconds away from earning your own money!</p>

				</div>


				<div class="col-md-9 register-right">

					<div class="tab-content" id="myTabContent">
						<div class="tab-pane fade show active" id="home" role="tabpanel"
							aria-labelledby="home-tab">
							<h3 class="register-heading">ADD EMPLOYEE</h3>

							<div class="row register-form">
								<div class="col-md-6">
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="User Name *" value="" name="username" required/>
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Last Name *" value="" name="lastName" required/>
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Password *" value="" name="password" required/>
									</div>
									<div class="form-group">
										<select name="type" class="form-select"
											aria-label="Disabled select example">
											<option selected>select type</option>
											<option value="Admin">Admin</option>
											<option value="Employee">Employee</option>
										</select>
									</div>
									<div class="form-group">
										<div class="maxl">
											<label class="radio inline"> <input type="radio"
												name="gender" value="male" checked> <span>
													Male </span>
											</label> <label class="radio inline"> <input type="radio"
												name="gender" value="female"> <span>Female </span>
											</label>
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input type="mail" class="form-control"
											placeholder="Your Email *" value="" name="mail" required/>
									</div>
									<div class="form-group">
										<input type="text" minlength="10" maxlength="10"
											class="form-control" placeholder="Your Phone *" value=""
											name="phone" required/>
									</div>
									<div class="form-group">
										<select class="form-control" name="question">
											<option class="hidden" selected disabled>Please
												select your Sequrity Question</option>
											<option value="What is your Birthdate?">What is your
												Birthdate?</option>
											<option value="What is Your old Phone Number">What
												is Your old Phone Number</option>
											<option value="What is your Pet Name?">What is your
												Pet Name?</option>
											<option value="What is your fav color?">What is your
												fav color?</option>
										</select>
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Enter Your Answer *" value="" name="answer" required/>
									</div>
									<input type="submit" class="btnRegister" value="Register" />
								</div>
							</div>
						</div>
						
					</div>
				</div>

			</div>

		</div>
	</form>
</body>
</html>
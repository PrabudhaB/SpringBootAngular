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
<title>PROFILE</title>
</head>
<body>
	

	<form action="updateEmployee" method="post">
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
							<h3 class="register-heading">PROFILE</h3>

							<div class="row register-form">
								<div class="col-md-6">
								<div class="form-group">
										<input  type="text" class="form-control"
											placeholder="User Name *" value="${employee.eid}" name="eid" required  readonly/>
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="User Name *" value="${employee.username}" name="username" required/>
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Last Name *" value="${employee.lastName}" name="lastName" required/>
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Password *" value="${employee.password}" name="password" required/>
									</div>
									<div class="form-group">
										<select name="type" class="form-select"
											aria-label="Disabled select example">
											<option value="${employee.type}">${employee.type}</option>
											<option >select type</option>
										
											<option value="Employee">Employee</option>
										</select>
									</div>
									<div class="form-group">
										<div class="maxl">
											<label class="radio inline"> 
											
											
											<input type="radio"
												name="gender" value="male" > <span>
													Male </span>
											</label> <label class="radio inline">
											
											 <input type="radio"
												name="gender" value="female"> <span>Female </span>
											</label>
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input type="email" class="form-control"
											placeholder="Your Email *" value="${employee.mail}" name="mail" required/>
									</div>
									<div class="form-group">
										<input type="text" minlength="10" maxlength="10"
											class="form-control" placeholder="Your Phone *" value="${employee.phone}"
											name="phone" required/>
									</div>
									<div class="form-group">
										<select class="form-control" name="question">
										
										<option value="${employee.question}">${employee.question}</option>
											<option class="hidden"  disabled>Please
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
											placeholder="Enter Your Answer *" value="${employee.answer}" name="answer" required/>
									</div>
									<input type="submit" class="btnRegister" value="Update" />
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
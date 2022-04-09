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
<title>Forgot Password</title>
</head>
<body>
	<%
String msg=(String)request.getAttribute("msg");
if(msg!=null){
%>
<script type="text/javascript">
alert("${msg}")
</script>
<%	
}
%>

	<form action="forgotPassword" method="post">
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
							<h3 class="register-heading">Forgot Password</h3>

							<div class="row register-form">
								<div class="col-md-6 offset-md-3">
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="User Name *" value="" name="username" required/>
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
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder=" New Password *" value="" name="newPassword" required/>
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder=" Confirm Password *" value="" name="confirmPassword" required/>
									</div>
									<div>
								<input type="submit" class="btnRegister" value="Change Password" />
								</div>
									
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
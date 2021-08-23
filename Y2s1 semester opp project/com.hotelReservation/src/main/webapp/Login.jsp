<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="totalcss.css">
<script type="text/javascript" src= "common.js"></script>

<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Zilla+Slab+Highlight:wght@700&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css2?family=Shadows+Into+Light+Two&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 
 
 
 	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script type="text/javascript" src="../js/scriptjob.js"></script>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<script src="https://kit.fontawesome.com/a076d05399.js"></script>
	
	
	<style>
/* width */
::-webkit-scrollbar {
  width: 20px;
}

/* Track */
::-webkit-scrollbar-track {
  box-shadow: inset 0 0 5px grey; 
  border-radius: 10px;
}
 
/* Handle */
::-webkit-scrollbar-thumb {
  background: red; 
  border-radius: 10px;
}

/* Handle on hover */
::-webkit-scrollbar-thumb:hover {
  background: #b30000; 
}
</style>
 
</head>
<body>


<fieldset class="border1">
<hr class="line">

<img alt="hotel" src="hotel_icon.jpg" class="logo">
<div class="heading">jet room</div>


<span id="date" class="date">
			<script type="text/javascript">
				date();
			</script>
</span>

<ul class="buttonHome">
<li><a href = "Home.jsp">Home</a></li>
<li><a href = "#">Search room</a></li>
<li><a href = "#">About us</a></li>
</ul>




</fieldset>

<fieldset class="border2">
	
		<span class="note">WelCome To Our Page</span>
		<input type="search" name="search" id="searchH" class="searchH"  placeholder="search.." required >
		<label class="icon" for="subhidden">
			<i class="fa fa-search"></i>
		</label>
		<input type="submit" name="searchM" style="display: none;" id="subhidden">
		<ul class="LogIN">
		<li><a href ="#">Customer login</a></li>
		</ul>
</fieldset>


<div class="log">
 <form class="signin" action="Login" method = "post">
	<input type="Email" name="Email" placeholder="enter email " class="in">
	<input type="password" name="password" placeholder="enter password" class="in" id="passL" required><br>
	<span id="msg" style="color: red; padding: 1px 3px;text-align:center;font-size:20px; margin-left: 80px; font-weight: 900;"><%if(session.getAttribute("errorMessage")!=null){out.print(session.getAttribute("errorMessage"));}else{out.println("");}%></span><br> 
	<input type="submit" class="btn" value="Log In">
	<p>don't have account <a href="Register.jsp" class="linkP">CLICK HERE</a></p>


 </form>
 </div>
 

 
 	<!-- footer section-->
		<fieldset class="footer">
			
			
							<div class="flow">
									    <h4 class="_14">Follow us on</h4>
						    <ul class="social-icons">
						        <li><a href="https://www.facebook.com/" class="social-icon"> <i class="fab fa-facebook-f"></i></a></li>
						        <li><a href="https://twitter.com/?lang=en" class="social-icon"> <i class="fab fa-twitter"></i></a></li>
						        <li><a href="https://www.rssinclude.com/login" class="social-icon"> <i class="fa fa-rss"></i></a></li>
						        <li><a href="https://www.youtube.com/" class="social-icon"> <i class="fab fa-youtube-square"></i></a></li>
						        <li><a href="https://lk.linkedin.com/" class="social-icon"> <i class="fab fa-linkedin-in"></i></a></li>
						        <li><a href="https://github.com/login" class="social-icon"> <i class='fab fa-github'></i></a></li>
						    </ul>
							</div>

			<div>
				
				<table class="footerLink tabelF">
					<tr>
						<td>
						<ul class="detailsFO ">
							<li class="tableH">Customer</li>
							<li><i class="fas fa-user-alt" id="logoFo"></i><a href="Login.jsp" class="linkJ">Log In</a></li>
							<li><i class="fas fa-search" id="logoFo"></i><a href="#" class="linkJ">Search hotel Rooms</a></li>
							<li><i class="fas fa-cloud-upload-alt" id="logoFo"></i><a href="" class="linkJ">Booking hotel Rooms</a></li>
							
						</ul>
						</td>
					
					</tr>
				</table>
				
			</div>
						<div>
							<span>
								
								<button class="tndc"> </button>
								
							</span>
					<ul class="detailsF sentence addr"><li><address>
						<i class="material-icons" id="logoFo">edit_location</i>
							Galle road,
							Wellavata,
							Colombo 6
							</address></li>
							<li><i class="fas fa-phone-alt" id="logoFo"></i>0778878399</li><li><a href = "mailto: project2020sliit@gmail.com" class="linkJ" style="color: #993300 "><i class="material-icons" id="logoFo">mail</i>jetRoom@gmail.com</a></li></ul>
							<div class="bottom">Copyright 2021 © JETROOM. All Rights Reserved. Designed  Developed by Project2021</div>
						</div>

		</fieldset>
	<a href="#" class="topicon" ><i class="fa fa-chevron-circle-up" id="mybtn"></i></a>


</body>
</html>
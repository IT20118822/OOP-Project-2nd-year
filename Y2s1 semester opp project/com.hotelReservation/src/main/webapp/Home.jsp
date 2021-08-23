<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>jet room</title>

 <link rel="stylesheet" type="text/css" href="totalcss.css">  
  <link rel="stylesheet" type="text/css" href="total.css">  
   <link rel="stylesheet" type="text/css" href="home.css">  

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


<script type="text/javascript" src= "common.js"></script>
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
		<li><a href ="Login.jsp">Customer login</a></li>
		</ul>
		
		
			
		  
</fieldset>
<fieldset class="bodystart">
 <center><span id="latest" >RECENT HOTEL ROOMS</span></center>
<div class="hero-image">
  
  <div class="hero-text">
  		    
			<table class="tableview sentence" id="table">
				<tr>
					<td>
						<i  class="fa fa-chevron-circle-left" style="font-size:48px;color:red"></i>
					</td>
					<td>
			<fieldset class="latestJob" id="latestJob">
				<img alt="hotelpic1" src="hotelpic2.jpeg" class="picture">
				<div class="note1">jaffna</div>
			</fieldset>
		</td>
		<td>
			<fieldset class="latestJob" id="latestJob2"> 
				<img alt="hotelpic1" src="hotels1.jpg" class="picture">
				<div class="note1">malabe</div>
			</fieldset>
		</td>
		<td>
			<fieldset class="latestJob" id="latestJob3">
				<img alt="hotelpic1" src="hotelpic3.jpeg" class="picture">
				<div class="note1">colombo</div>
			</fieldset>
		</td>
			<td>
			<fieldset class="latestJob" id="latestJob3">
				<img alt="hotelpic1" src="hotelpic4.jpeg" class="picture">
				<div class="note1">Nuwara Eliya</div>
			</fieldset>
		</td>
			<td>
			<fieldset class="latestJob" id="latestJob3">
				<img alt="hotelpic1" src="hotelpic5.jpeg" class="picture">
				<div class="note1">kandy</div>
			</fieldset>
		</td>
			<td>
			<fieldset class="latestJob" id="latestJob3">
				<img alt="hotelpic1" src="hotels2.png" class="picture">
				<div class="note1">wellawatta</div>
			</fieldset>
		</td>
		<td>
		<i class="fa fa-chevron-circle-right" style="font-size:48px;color:red"></i>
	</td>
	</tr>
	</table>

  </div>
</div>


</fieldset>


	<fieldset class="navi">
		<h2 class="works">HOW it <span class="colouring">WORKS?</span></h2>
		<table style="margin: auto;">
			<tr>
				<td>
					<center>
					<img src="create_account.png" class="img1"></center>
					<p class="heading1 alignP">Create an Account</p>
					<p class="naviPARA sentence">Sign up by creating an account with required details in order to availble our services. The optimal feeding of correct information will help us fine tune your hotel room search.</p>
				</td> 
				<td>
					<center><img src="search_icon.jpg" class="img1"></center>
					<p class="heading1 alignP">Search Desired hotel Rooms</p>
					 <p class="naviPARA sentence">Providing you with our website  notified by numerous hotel. You can add filters to search your desired hotel room and still have using a location options to choose room.</p>
				</td> 
				<td>
					<center><img src="booking_icon.jpg" class="img1"></center>
					<p class="heading1 alignP">Booking hotel Rooms</p>
					 <p class="naviPARA sentence">Once you narrow down with the right choices, get ready to booking to the hotel room. Forward your updated hotel room Details to the optimal customer.</p>
				</td> 
				<td>
					<center><img src="payment_icon1.jpg.png" class="img1"></center>
					<p class="heading1 alignP">After the booking make payment</p>
					<p class="naviPARA sentence">Once you booking with the right choices, get ready to make payment. Forward your updated payment to the optimal customer.</p>
				</td> 
			</tr>
		</table>
	</fieldset>





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
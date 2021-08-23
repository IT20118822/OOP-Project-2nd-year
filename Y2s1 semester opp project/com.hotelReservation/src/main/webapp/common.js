function date(){
	var D = new Date();
	var y = D.getFullYear();
	var m = D.getMonth();
	var Da = D.getDate();
	m+=1;
	document.getElementById("date").innerHTML=Da+"/"+m+"/"+y;
}

//get from w3schools website
function scroll(){

mybutton = document.getElementById("mybtn");

window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 200 || document.documentElement.scrollTop > 200) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}





}
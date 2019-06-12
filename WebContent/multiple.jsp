<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
    <style>
    body { background-color:#a4e5f4; color:#fff}
    form { margin:30px auto; max-width:600px;}
    form a { padding:0px 10px;  color:#fff; background:#104ce5; text-decoration:none; border-bottom:3px solid #16A085;}
    
    .modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #474e5d;
  padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}
button { 
  background-color: #168c20;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
    
    </style>

</head>
<body>
<!--     margin-top: 7px;
    margin-left: 68px; class="modal-content"  #222 #1ABC9C-->

<div class="row">
	<% 

if(session.getAttribute("uname")==null){
	
	response.sendRedirect("index.jsp");
}

%>

Welcome ${uname}

<form action="./logout" method="post">
<input type="submit" value="Logout">
	
	</form>
	</div>


<h1 style="margin-top:150px; text-align:center;">Multiple Fund Transfer</h1>
    <form  action="./transfer" method="post">
    	<p>
            <span style="background-color: #474e5d;">Add more</span>
            <input type="text" placeholder="name" name="name">
            <input type="text" placeholder="Account number" name="acno">
            <input type="text" placeholder="Ifsc" name="ifsc">
            <input style="margin-top: 7px;margin-left: 68px;" type="text" placeholder="Amount" name="amount">
    		
    	</p>
    	<br><br><br>
    	<div class="clearfix">
        
        <button type="submit" class="nextbtn">Next</button>
      </div>
    </form>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="addMore.js"></script>


</body>

<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-36251023-1']);
  _gaq.push(['_setDomainName', 'jqueryscript.net']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}
</script>

</html>
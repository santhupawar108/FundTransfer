<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
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

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* The Modal (background) */
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

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
/* The Close Button (x) */
.close {
  position: absolute;
  right: 35px;
  top: 15px;
  font-size: 40px;
  font-weight: bold;
  color: #f1f1f1;
}

.close:hover,
.close:focus {
  color: #f44336;
  cursor: pointer;
}

/* Clear floats */
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
<!-- changes -->
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
  <form class="modal-content" action="./account" method="post">
    <div class="container">
      <h1>Add Account</h1>
      <p>Please fill your Account Details.</p>
      <hr>
      <label for="name"><b>Name</b></label>
      <input type="text" placeholder="Enter the Name" name="name" required>
      
      <label for="bankname"><b>Bank Name</b></label>
      <input type="text" placeholder="Enter the Bank Name" name="bankname" required>

      <label for="acno"><b>AC No</b></label>
      <input type="text" placeholder="Enter Account number" name="acno" required>

      <label for="ifsc"><b>IFSC</b></label>
      <input type="text" placeholder="Enter IFSC Code" name="ifsc" required>
      
      <label for="mobile"><b>Mobile Number</b></label>
      <input type="text" placeholder="Mobile Number" name="mbl" required>
      
      <label for="mpin"><b>MPIN</b></label>
      <input type="text" placeholder="Enter the Mpin" name="mpin" required>

  <label for="rmpin"><b>Repet MPIN</b></label>
      <input type="text" placeholder="Re-Enter the Mpin" name="rmpin" required>
      <div class="clearfix">
        
        <button type="submit" class="savebtn">Save</button>
      </div>
    </div>
  </form>


<!-- end changes -->
</body>


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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h3>Enter your Details</h3>
<form method = "post" action="WelcomeServletPath" >
First Name : <input type="text" name="fname"> <br/>
Last Name : <input type="text" name="lname"> <br/>
Address : <input type="text" name="address"> <br/>
City : <input type="text" name="city"> <br/>
State : <input type="text" name="state"> <br/>
Zip : <input type="text" name="zip"> <br/>
<input type="submit" value="submit" />
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Customer Registration</h2>

<form action="customer/save" method="post">
<pre>
FirstName : <input type="text" name="firstName">
LastName : <input type="text" name="lastName">
Address : <input type="text" name="address">
Email : <input type="text" name="email">
UserName : <input type="text" name="userName">
MobileNumber : <input type="text" name="mobileNumber">
Gender : <input type="text" name="gender">
Govt_Id : <input type="text" name="govt_id">
Account_no : <input type="text" name="account_no">
Customer_Id : <input type="text" name="customer_id">
Balance : <input type="text" name="balance">
<input type="submit" value="save">
</pre>
</form>
</body>
</html>
<html>
<body>
	<h2>Bank Information</h2>
	<form action="bank/save" method="post">
	<pre>
	BankName  : <input type="text" name = "bankName">
	BranchName  : <input type="text" name = "branchName">
	ifscCode  : <input type="text" name = "ifscCode">
	Address  : <input type="text" name = "address">
	
	<input type="submit" value="save">
	</pre>
	</form>
	
	
	<h2>Bank Name Information</h2>
	<form action="bank/search" method="get">
	<pre>
	BranchName  : <input type="text" name = "branchName">
	<input type="submit" value="search">
	</pre>
	</form>

	<h2>Bank update Information</h2>
	<form action="bank/update" method="post">
	<pre>
	Id   : <input type="text" name = "id">
	BankName  : <input type="text" name = "bankName">
	BranchName  : <input type="text" name = "branchName">
	ifscCode  : <input type="text" name = "ifscCode">
	Address  : <input type="text" name = "address">
	
	<input type="submit" value="update">
	
	</pre>
	</form>
	
	
	<h2>Customer Information</h2>
	<form action="customer/save" method="post">
	<pre>
	First_Name  : <input type="text" name = "firstName">
	Last_Name   : <input type="text" name = "lastName">
	Address     : <input type="text" name = "address">
	Email       : <input type="text" name = "email">
	User_name   : <input type="text" name = "userName">
	Password    : <input type="text" name = "password">
	Mobile_Number: <input type="text" name = "mobileNumber">
	Gender      : <input type="text" name = "gender">
	Id          : <input type="text" name = "id">
	Govt_Id     : <input type="text" name = "govt_id">
	Customer_Id : <input type="text" name = "customer_id">
	Balance     : <input type="text" name = "balance">
	Account_no     : <input type="text" name = "account_no">
	Bank_Id     : <input type="text" name = "bank_Id">
	
	
	<input type="submit" value="save">
	</pre>
	</form>
	</pre>
	
	</form>
</body>
</html>

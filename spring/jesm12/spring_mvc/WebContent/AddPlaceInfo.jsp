<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Place Info</title>
</head>
<body>

<h1>Add Information about the place</h1>
<h3>Place Form</h3>
<h5>${message}, ${dto.desc}</h5>
<form action="add.do" method="post">
<pre>
Name : <input type="text" name="name"/>
Rating : <select name="rating">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
		</select>
Food : <input type="text" name="food"/>
Description: <textarea rows="5" cols="30" name="desc"></textarea>
Popular :  <input type="text" name="popular"/>
<input type="submit" value="Add"/>
</pre>
</form>

</body>
</html>
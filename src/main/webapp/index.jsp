<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>mousycoder</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">mousycoder</a>

index.jsp

<hr>

name = ${user.name}


<hr>

host = ${user.host}


<hr>

name1 = <%= (String)request.getAttribute("name")%>


name2 = ${name}

</form>
</body>
</html>
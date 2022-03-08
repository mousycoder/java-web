<%--
  Created by IntelliJ IDEA.
  User: mousycoder
  Date: 2022/3/2
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/loginServlet" method="post">
名称:<input type="text" name="name"/>
    密码：<input type="text" name="pwd">
    <input type="submit" value="登录">

    消息提示 ${msg}
</form>

</body>
</html>

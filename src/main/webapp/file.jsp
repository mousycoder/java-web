<%--
  Created by IntelliJ IDEA.
  User: mousycoder
  Date: 2022/3/2
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/fileUpload" method="post" enctype="multipart/form-data">
    用户名:<input type="text" name="username">
    头像:<input type="file" name="img">
    <input type="submit" value="提交">

</form>

</body>
</html>

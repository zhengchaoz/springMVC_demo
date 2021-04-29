<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/26
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>form</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/hello" method="get">
            <label>
                <input type="text" name="method"/>
            </label>
            <input type="submit"/>
        </form>
    </body>
</html>

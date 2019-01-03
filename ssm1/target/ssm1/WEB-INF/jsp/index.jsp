<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>

<table border="1">
    <c:forEach items="${userList}" var="item">
        <tr><td>${item.userId}</td><td>${item.userName}</td></tr>
    </c:forEach>
</table>
</body>
</html>

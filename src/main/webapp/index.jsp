<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach items="${requestScope.list}" var="p">
    名字：${p.name}

</c:forEach>
</body>
</html>

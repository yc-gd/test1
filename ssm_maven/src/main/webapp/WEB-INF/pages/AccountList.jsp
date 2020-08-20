<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/19 0019
  Time: 下午 5:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>数据展示</title>
</head>

<body>
<div>
    <c:if test="${not empty accounts}">
        <table border="1">
            <thead>
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>金额</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${accounts}" var="i">
                <tr align="center">
                    <td>${i.id}</td>
                    <td>${i.name}</td>
                    <td>
                        <fmt:formatNumber type="currency" value="${i.money}"/>
                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
    </c:if>
</div>
</body>
</html>

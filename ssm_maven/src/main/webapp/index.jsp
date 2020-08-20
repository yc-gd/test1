<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统首页</title>
    <script type="text/javascript">
        function goView(){
            window.location.href = "${pageContext.request.contextPath}/AccountViewAction/AccountView";
        }
        function goAdd() {
            alert("准备添加")
        }
    </script>
</head>
<body>
<div>
    <h1>欢迎使用账户信息管理系统</h1>
    <h3>请选择你要使用的功能：</h3>
    <input type="button" value="添加" onclick="goAdd()">
    &nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" value="查询" onclick="goView()">
</div>
</body>
</html>

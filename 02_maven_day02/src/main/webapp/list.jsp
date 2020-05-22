<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="queryAll" method="post">
		用户名：<input type="text" name="username" placeholder="${map.username} ">
		<input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td>序号</td>
			<td>用户名</td>
			<td>密码</td>
			<td>生日</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${plist.list }" var="u">  
			<tr>
				<td>${u.uid }</td>
				<td>${u.username }</td>
				<td>${u.password }</td>
				<td>${u.birthday }</td>
				<td>操作</td>
			</tr>
		</c:forEach>
		<tr>
			<td	colspan="10">
				<a href="?pageNum=1">首页</a>
				<a href="?pageNum=${plist.pageNum-1 < 1 ? plist.pageNum:plist.pageNum-1 }">上一页</a>
				<a href="?pageNum=${plist.pageNum+1 > plist.pages ? plist.pageNum:plist.pageNum+1} ">下一页</a>
				<a href="?pageNum=${plist.pages }">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>
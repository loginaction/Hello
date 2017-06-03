<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
     <form action="show" method="post">
      <table align="center" width="600" height="">
       <tr height="50px">
         <td>
                                     区域：
	       <select name="id">
	        <option value="1">朝阳订单</option>
			<option value="2">海淀订单</option>
			<option value="3">丰台订单</option>
			<option value="4">西城订单</option>
			<option value="5">昌平订单</option>
	       </select>
	       <input type="submit" value="查询"/>
	       </td>
       </tr>
       </table>
     </form>
  </body>
</html>

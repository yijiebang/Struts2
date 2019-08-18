<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %><!--Taglib指令告知Servlet容器这个页面将使用Struts2 标签，并且这些标签会被s放在前面。  -->
<html>
<head>
<title>Hello World</title>
</head>
<body>
     Entered value : <s:property value="name"/><br/>
   Value of key 1 : <s:property value="key1" /><br/>
   Value of key 2 : <s:property value="key2" /> <br/>
</body>
</html>
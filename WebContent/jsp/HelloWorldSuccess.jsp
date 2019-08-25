<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %><!--Taglib指令告知Servlet容器这个页面将使用Struts2 标签，并且这些标签会被s放在前面。  -->
<html>
<head>
<title>Hello World</title>
</head>
<body>
<h1>hello success</h1>
    前面传的值 : <s:property value="name"/><br/>
  后面action带过来的 key 1 : <s:property value="key1" /><br/>
 后面action带过来的 key 2 : <s:property value="key2" /> <br/>
</body>
</html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>File Upload Success</title>
</head>
<body>
文件上传成功了，<br/>
 文件名:<s:property value="myFileFileName"/><br/>
存放位置:<s:property value="destPath"/>
</body>
</html>
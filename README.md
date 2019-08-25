# Struts2
Struts回顾，下载jar http://struts.apache.org/download.cgi
# Struts 配置过滤器,	org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter 是自2.1.3开始就替代了FilterDispatcher的
# web.xml
<filter>
		<filter-name>struts2</filter-name>
		<filter-class>
			org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter
		</filter-class>
	</filter>

 # src
 # 简单的hello
 # com.yjb.struts2.action
 # 邮件发送
 # com.yjb.struts2.action.Emailer
 # 文件上传
 # com.yjb.struts2.action.file
 # 数据库连接访问
 # com.yjb.struts2.action.jdbc
 # jdbc工具类
 # com.yjb.struts2.util
 
# /Struts2/WebContent/WEB-INF/classes/
# 简单的hello
# struts-hello.xml
# 邮件发送
# struts-email.xml
# struts-emailValidate.xml
# 文件上传
# struts-file.xml
# 数据库连接访问
# struts-jdbc.xml
# 主配置文件
# struts.xml

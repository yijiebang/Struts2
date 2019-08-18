package com.yjb.struts2.action.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;
import com.yjb.struts2.util.JDBCUtilsPlus;

public class LoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//实体类和数据库表一致
    private int id;private String username;private String pwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String execute()  {
		    String ret = ERROR;
	        Connection con = null;
 	        PreparedStatement st = null;
	        ResultSet rs = null;
		try {
			 //获取连接
			 con = JDBCUtilsPlus.getConnection();
            
             //编写sql
			    String sql = "SELECT * FROM users WHERE";
		               sql+=" username = ? AND pwd = ?";
		     //创建语句执行者
		       st= con.prepareStatement(sql);
		       st.setString(1, username);
		       st.setString(2, pwd);
		     //4.执行sql获取返回
		       rs = st.executeQuery();

				//5.封装结果集
				while (rs.next()) {
				   System.out.println(rs.getString("username"));
				   ret = SUCCESS;
				}
				    
		} catch (Exception e) {
			ret= ERROR;
 		} finally {//.释放资源  关闭连接
 			  JDBCUtilsPlus.colseResource(con, st, rs);
 	      }
		 return ret;
	}

}

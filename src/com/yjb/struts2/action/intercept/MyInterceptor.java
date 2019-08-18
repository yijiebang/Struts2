package com.yjb.struts2.action.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/***
 * 自定义拦截器，在action执行前后调用
  * @author 2478683913@qq.com
  * @version 创建时间：2019年8月18日  下午7:04:56
 */
public class MyInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
 	      String output = "Pre-Processing"; 
	      System.out.println(output);

 	      String result = invocation.invoke();

 	      output = "Post-Processing"; 
	      System.out.println(output);
 		return result;
	}

}

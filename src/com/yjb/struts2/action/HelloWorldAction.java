package com.yjb.struts2.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * 
  * @author 2478683913@qq.com
  * @version 创建时间：2019年8月18日  下午3:32:09
 */
public class HelloWorldAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    /**
                  * 使用ognl，进行值传递到界面
     */
	public String execute() throws Exception {
		  ValueStack stack = ActionContext.getContext().getValueStack();
	      Map<String, Object> context = new HashMap<String, Object>();

	      context.put("key1", new String("This is key1")); 
	      context.put("key2", new String("This is key2"));
	      stack.push(context);
	      System.out.println("Size of the valueStack: " + stack.size());
	      return "success";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

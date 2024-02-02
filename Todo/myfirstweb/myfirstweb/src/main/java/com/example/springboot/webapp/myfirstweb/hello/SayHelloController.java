package com.example.springboot.webapp.myfirstweb.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SayHelloController {
	
	@RequestMapping("Say-Hello")
	@ResponseBody
	public String sayHello()
	{
		return "Hello! What are you doing?";
	}
	
	@RequestMapping("Say-Hello-HTML")
	@ResponseBody
	public String sayHelloHtml()
	{
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My first HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	@RequestMapping("Say-HelloJSP")
	@ResponseBody
	public String sayHelloJSP()
	{
		return "Hello! What are you doing? JSP";
	}
	

}

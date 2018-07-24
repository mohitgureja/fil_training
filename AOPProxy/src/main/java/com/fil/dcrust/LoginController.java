package com.fil.dcrust;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController 
{
	LoginService loginService = new LoginService();

	@RequestMapping(value="/log",method=RequestMethod.GET)
	@ResponseBody
	public String showHello()
	{
		return "Hello Controller";
	}
	
	@RequestMapping(value="/log",method=RequestMethod.POST)
	public String getLogin(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		if(loginService.validateUser(name, password))
		{
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
		else
		{
			model.put("errorMessage", "InvalidUser");
			return "login";
		}
		
	}
}

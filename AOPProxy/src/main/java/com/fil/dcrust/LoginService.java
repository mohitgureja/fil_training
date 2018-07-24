package com.fil.dcrust;

public class LoginService 
{
	public boolean validateUser(String name,String password)
	{
		return name.equalsIgnoreCase(password);
	}
}

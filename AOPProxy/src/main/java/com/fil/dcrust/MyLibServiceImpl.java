package com.fil.dcrust;

public class MyLibServiceImpl implements MyLibService 
{

	public String getBook() {
//		 TODO Auto-generated method stub
		System.out.println("getBook() called");
		return "book";
	}

	public String getStudent() {
		// TODO Auto-generated method stub
		System.out.println("getStudent() called");
		return null;
	}

	public void issue(String bookName, String studentName) 
	{
		System.out.println(bookName+" issued to "+studentName);

	}

}

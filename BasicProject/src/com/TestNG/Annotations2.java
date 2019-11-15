package com.TestNG;

import org.testng.annotations.Test;

public class Annotations2 
{
	 @Test(priority=1)
	  public void gmailLaunch() 
	 {
		 System.out.println("open chrome browser and navigate to Gmail Application");
	  }
	 
	 @Test(priority=2)
	  public void Login() 
	 {
		 System.out.println("Testing Login Functionality");
	  }
	 @Test(enabled=false)
	  public void Inbox() 
	 {
		 System.out.println("Testing Inbox Functionality");
	  }
	 
	 @Test(priority=3)
	  public void ComposeMail() 
	 {
		 System.out.println("Testing Compose Mail Functionality");
	  }
}

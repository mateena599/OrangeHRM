package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anootations3 
{
	 @BeforeTest
	  public void gmailLaunchAndLogin() 
	 {
		 System.out.println("navigate to Gmail Application And Login");
	  }
	 
	 
	 @Test(priority=1)
	  public void Inbox() 
	 {
		 System.out.println("Testing Inbox Functionality");
	  }
	 
	 @Test(priority=2)
	  public void ComposeMail() 
	 {
		 System.out.println("Testing Compose Mail Functionality");
	  }
	 @Test(enabled=false)
	  public void SentMail() 
	 {
		 System.out.println("Testing Sent Mail Functionality");
	  }
	 @AfterTest
	  public void gmailApplicationClose() 
	 {
		 System.out.println("Closing gmail Application");
	  }
}

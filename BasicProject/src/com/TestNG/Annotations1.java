package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	 @Test
	  public void gmailLaunch() 
	 {
		 System.out.println("open chrome browser and navigate to Gmail Application");
	  }
	 
	 @Test
	  public void Login() 
	 {
		 System.out.println("Testing Login Functionality");
	  }
	 @Test
	  public void Inbox() 
	 {
		 System.out.println("Testing Inbox Functionality");
	  }
	 
	 @Test
	  public void ComposeMail() 
	 {
		 System.out.println("Testing Compose Mail Functionality");
	  }
	 
}

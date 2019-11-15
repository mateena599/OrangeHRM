package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LogInPage 
{
	//Object Repository
	//<a href="mercurysignon.php?osCsid=1db544442f15ad873cbed4faa1a8cefe">SIGN-ON</a>

	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	public void signOn()
	{
		signOn.click();
		System.out.println();
	}
	
	//<a href="mercuryregister.php?osCsid=1db544442f15ad873cbed4faa1a8cefe">REGISTER</a>
	@FindBy(linkText="REGISTER")
	WebElement Register;
	public void register()
	{
		Register.click();
	}
	
	//<a href="mercuryunderconst.php?osCsid=1db544442f15ad873cbed4faa1a8cefe">SUPPORT</a>
	@FindBy(linkText="SUPPORT")
	WebElement Support;
	public void Support()
	{
		Support.click();
	}
	
	//<a href="mercuryunderconst.php?osCsid=1db544442f15ad873cbed4faa1a8cefe">CONTACT</a>
	@FindBy(linkText="CONTACT")
	WebElement Contact;
	public void Contact()
	{
		Contact.click();
	}
	//<a href="mercurywelcome.php">Home</a>
	@FindBy(linkText="Home")
	WebElement Home;
	public void Home()
	{
		Home.click();
	}  
	    
	   //<a href="mercuryreservation.php">Flights</a>
	@FindBy(linkText="Flights")
	WebElement Flights;
	public void Flights()
	{
		Flights.click();
	} 
	
	 //<a href="mercuryunderconst.php">Hotels</a>
	@FindBy(linkText="Hotels")
	WebElement Hotels;
	public void Hotels()
	{
		Hotels.click();
	} 
	   //<a href="mercuryunderconst.php">Car Rentals</a>
	@FindBy(linkText="Car Rentals")
	WebElement carRentals;
	public void CarRentals()
	{
		carRentals.click();
	}
	   //<a href="mercurycruise.php">Cruises</a>
	@FindBy(linkText="Cruises")
	WebElement Cruises;
	public void Cruises()
	{
		Cruises.click();
	}
	   //<a href="mercuryunderconst.php">Destinations</a>
	@FindBy(linkText="Destinations")
	WebElement Destinations;
	public void Destinations()
	{
		Destinations.click();
	}
	
	   //<a href="mercuryunderconst.php">Vacations</a>
	@FindBy(linkText="Vacations")
	WebElement Vacations;
	public void Vacations1()
	{
		Vacations.click();
	}
	
	//<input type="text" name="userName" size="10">
	//<input type="password" name="password" size="10">	
	////<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
	
	
	@FindBy(name="userName") WebElement userName;
	@FindBy(name="password") WebElement password;
	@FindBy(name="login") WebElement login;
	public void userLogin(String UserName, String Password)
	{
		userName.clear();
		userName.sendKeys(UserName);
		password.clear();
		password.sendKeys(Password);
		login.click();
	}
	
	
	///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/font
//	/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/div/font/b
	///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[1]/td[1]/font
	
	
	//              /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td
	
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td")
	WebElement Special;
	public void Specials()
	{
		
		
		String specialElementText=Special.getText();
		System.out.println(specialElementText);
		
		
		
		
	}
	//<font face="Arial, Helvetica, sans-serif, Verdana" size="2">Always 
    //carry a travel first aid kit with bandages, antacids, aspirin, bee
    //sting wipes, and other basic necessities.</font>
///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font
    @FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font")
    WebElement Tourtips;
    public void TourTips()
    {
    	String tourTips=Tourtips.getText();
    	System.out.println(tourTips);
    }
    
    //<a href="mercuryunderconst.php?osCsid=60c8402d5462378f326afb4c93955787">your destination</a>
    
    @FindBy(linkText="your destination")
    WebElement destinations;
    public void Destination()
    {
    	destinations.click();
    }
//<a href="mercuryunderconst.php?osCsid=60c8402d5462378f326afb4c93955787">featured vacation destinations</a>
    @FindBy(linkText="featured vacation destinations")
    WebElement vacations;
    public void Vacations()
    {
    	vacations.click();
    }
    
    
    //<a href="mercuryregister.php">Register here</a>
    @FindBy(linkText="Register here")
    WebElement Registerhere;
    public void Registerhere()
    {
    	Registerhere.click();
    }
   
    
    //<a href="http://businesstravel.about.com/mbody.htm?PM=78_101_T&amp;cob=home">Business Travel @ About.com</a>
    @FindBy(linkText="Business Travel @ About.com")
    WebElement businesstravelLink;
    public void BusinessTravelLink()
    {
    	businesstravelLink.click();
    }
    
    
    //<a href="http://www.salon.com/travel/index.html">Salon Travel</a>
    @FindBy(linkText="featured vacation destinations")
    WebElement salon;
    public void salon()
    {
    	salon.click();
    }
 
}

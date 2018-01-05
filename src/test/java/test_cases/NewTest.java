package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver=null;
	
	
	
	
	
	  @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:/Industrialization Draft/chromedriver.exe");
			driver = new ChromeDriver();
	  }
	
	  @Test
	  public void testLogin() throws InterruptedException{
		  System.out.println("Welcome to industrialization-draft Web portal");
		  
		  driver.get("http://localhost:8086/industrialization-draft/login");
		  Thread.sleep(5000);  // Let the user actually see something!
		  WebElement signIn = driver.findElement(By.linkText("Sign In"));
		  signIn.click();
		  System.out.println("Started login");
			 
		  WebElement usernameBox = driver.findElement(By.name("username"));
		  usernameBox.sendKeys("admin");
		  WebElement passwordBox = driver.findElement(By.name("password"));
		  passwordBox.sendKeys("admin");
		  WebElement loginButton = driver.findElement(By.name("loginSubmit"));
		
		 
		  loginButton.click();
		 
		  Thread.sleep(5000); 
		  
		  System.out.println("Login Successfull");
		  System.out.println("Home page");
	  }
	
	
	  @Test
	  public void testUserList(){
		  
		  WebElement userMan = driver.findElement(By.linkText("User Management"));
		  System.out.println("Clicked on User Management");
		  Actions action = new Actions(driver);
		  action.moveToElement(userMan).build().perform();
		  WebElement userButton = driver.findElement(By.linkText("User"));
		  System.out.println("Clicked on User ");
		  userButton.click();
		  System.out.println("Users List Displayed");
	  }
	
  @Test
  public void testAddUser() throws InterruptedException {
	  
	 
	   // Let the user actually see something!
	  
	  //Add User Test
	  
	  System.out.println("Clicked on Add User");
	 /* Thread.sleep(5000);
	  WebElement addUser = driver.findElement(By.linkText("Add New User"));
	  addUser.click();  
	  
	  WebElement username = driver.findElement(By.name("usename"));
	  username.sendKeys("alka");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("alka");
	  WebElement emailBox = driver.findElement(By.name("email"));
	  emailBox.sendKeys("alka@capgemini.com");
	  WebElement roleBox = driver.findElement(By.name("role"));
	  Select dropdown = new Select(roleBox);
       dropdown.selectByVisibleText("admin");  // pass the text which is visible on site
       System.out.println("Provided user details");
	  WebElement submitUser = driver.findElement(By.cssSelector("input[type='submit']"));
	  submitUser.click();  
	  System.out.println("Submitted user details");
	  Thread.sleep(5000);
	  System.out.println("User added successfully");*/
	  
	  
  }


  @AfterTest
  public void afterTest() {
	  //Close Browser
	   driver.quit();
  }

}

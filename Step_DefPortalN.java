package stepDef_portal;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_DefPortalN 
{
	WebDriver driver = new ChromeDriver();   // 
	@Given("The user navigate to https:\\/\\/www.naukri.com\\/")
	public void the_user_navigate_to_https_www_naukri_com() 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");                                        // These are all the selenese 
		driver.manage().window().maximize();                    // URL Declaration & other operations.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enter valid email {string}")
	public void user_enter_valid_email(String string) throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(1000);
		WebElement login_btn = driver.findElement(By.id("login_Layer"));   //...................... Login button 
		if((login_btn)!= null)         //......................................... check whether login button is present or not
		{
			System.out.println("Login button is Present");
			}
		else
		{
			System.out.println("Login button is Absent");
			
		}
		login_btn.click();               //........................ click on the login button
		Thread.sleep(2000);
		System.out.println("Login tab is now getting displayed");
		Thread.sleep(2000);
		
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button"));
		Login.click();
		
		System.out.println("Validations are getting displayed");
		
		
		WebElement Email = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input"));
		Email.click();
		Thread.sleep(1000);
		Email.sendKeys("mayuresh.rajopadhye@gmail.com");
		Thread.sleep(2000);
	}

	

	@When("valid password {string}")
	public void valid_password(String string) throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement Password = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input"));
		Password.click();
		Thread.sleep(1000);
		Password.sendKeys("Mayuresh@90");    //.......................... Password .....................
		Thread.sleep(1000);
		
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button"));
		Login.click();
		Thread.sleep(2000);
		System.out.println("Login successfully");
	}

	@Then("click on complete profile button & update few information & perform few operations")
	public void click_on_complete_profile_button_update_few_information_perform_few_operations() throws Exception 
	{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[3]/div[2]/a")).click();   //..... click on the complete profile button
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div/span/div/div/div/div/div/div[1]/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/em")).click();  //..... click on edit button which is next to employee name
	    
	    //.....Update the salary information
	    Thread.sleep(2000);
	    WebElement salary = driver.findElement(By.id("totalAbsCtc_id"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", salary);
	    Thread.sleep(2000);
	    salary.clear();
	    Thread.sleep(1000);
	    salary.click();
	    Thread.sleep(2000);
	    
	    salary.sendKeys("1");  // pass the data
	    Thread.sleep(2000);
	    WebElement save_btn = driver.findElement(By.xpath("//*[@id=\"saveBasicDetailsBtn\"]"));   //........... Save button
	    save_btn.click();
	    Thread.sleep(2000);
	    save_btn.click();
	    System.out.println("Salary info gets updated successfully");
	    
	    
	    //***************************************
	    
	    
	   
	    Thread.sleep(3000);
	    WebElement search = driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[1]/div/span"));
	    search.click();
	    Thread.sleep(2000);
	    WebElement search_btn = driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[1]/div/button"));
	    if((search_btn)!=null)
	    {
	    	System.out.println("Search button is present");
	    }
	    else
	    {
	    	System.out.println("Search button is not present");
	    }
	    
	    Thread.sleep(2000);
	    search_btn.click();
	    System.out.println("Validation is displayed as : Please enter keywords to search relevant jobs");
	    Thread.sleep(2000);
	    WebElement search_keyword = driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[1]/div/div/div[2]/div/div/div/input"));
	    search_keyword.click();
	    Thread.sleep(1000);
	    search_keyword.sendKeys("Software Test Engineer"); 
	    Thread.sleep(3000);
	    
	    search_keyword.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	    WebElement sort_by = driver.findElement(By.id("filter-sort"));
	    sort_by.click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"jobs-list-header\"]/div[2]/span/div/ul/li[2]")).click();
	    System.out.println("Relevance option is selected");
	    
	    WebElement Hybrid = driver.findElement(By.xpath("/html/body/div/div/main/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
	    Hybrid.click();
	    
	    Thread.sleep(3000);
	    
	    
	    driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[4]")).click();  //.......... Profile icon .........
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[4]/div[2]/div[2]/div/div[1]/div[2]/a")).click(); //.....click on view / update
	    Thread.sleep(3000);
	    WebElement upload_resume = driver.findElement(By.xpath("/html/body/div[3]/div/div/span/div/div/div/div/div/div[2]/div[1]/div/div/ul/li[2]/span"));
	    upload_resume.click();
	    Thread.sleep(2000);
	    
	    WebElement uploadresume_btn = driver.findElement(By.xpath("//*[@id=\"lazyAttachCV\"]/div/div[2]/div/div/div[2]/div[1]/div/section/div/div[2]/div[2]/span"));
	    uploadresume_btn.click();
	    Thread.sleep(2000);
	    
	    Robot rb_resume = new Robot();
		rb_resume.delay(2000);
		
		// put path to file in clipboard
		StringSelection ss=new StringSelection("C:\\Old Data\\Automation\\My_updated_cv Oct 2023.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		// Ctrl+V
		rb_resume.keyPress(KeyEvent.VK_CONTROL);   // Press control key
		rb_resume.keyPress(KeyEvent.VK_V);         // Press V key
		rb_resume.delay(2000);
		
		rb_resume.keyRelease(KeyEvent.VK_CONTROL);
		rb_resume.keyRelease(KeyEvent.VK_V);
		rb_resume.delay(2000);
		
		// Enter
		rb_resume.keyPress(KeyEvent.VK_ENTER);
		rb_resume.keyRelease(KeyEvent.VK_ENTER);  
		rb_resume.delay(3000);
		
		Thread.sleep(2000);
		
		// Click on upload button
		//driver.findElement(By.id("upload-file-btn")).click();
		
		//Thread.sleep(1000);
		//driver.findElement(By.id("saveDetails")).click();  //...... Profile summary saved.
	    Thread.sleep(1000);
	    
	    
	    //.....
	    //WebElement search_keyword = driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[1]/div/div/div[2]/div/div/div/input"));
	    search_keyword.click();
	    //Thread.sleep(2000);
	    //search_keyword.click();
	    Thread.sleep(2000);
	    //search_keyword.sendKeys("Software Test Engineer"); 
	    //Thread.sleep(3000);
	    
	    //search_keyword.sendKeys(Keys.ENTER);
	    //Thread.sleep(3000);
	    
	}
}

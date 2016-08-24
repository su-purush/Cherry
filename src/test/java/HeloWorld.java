



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.thoughtworks.gauge.Step;



public class HeloWorld {
	
	@Step("print helo world")
	public void heloword()
	{
		 WebDriver driver;
		driver= new FirefoxDriver();
		driver.get("http://google.co.in");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://google.co.in");
		System.out.println("i am in helo word");
		Assert.assertEquals(true, true);
	}
	
	

}

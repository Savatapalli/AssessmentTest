package script;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickJSAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\sats-selenium\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		// clicking Javascripts Alerts
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		System.out.println("Title of page is: " + driver.getTitle());
		
		//Clicking JS for Confirm         
		WebElement JSConfirm = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
        System.out.println("Clicked JS For Confirm Button");
        JSConfirm.click();
        driver.switchTo().alert().accept();
     
        // Clicking Ok in the Alert Pop up & verifying the message - You clicked: OK
        WebElement ResultTxt = driver.findElement(By.xpath("//*[@id=\"result\"]"));
        String txtCompare = ResultTxt.getText();
        System.out.println(txtCompare);
        String expectedText = "You clicked: Ok";
        Assert.assertEquals(txtCompare, expectedText);
        System.out.println("Result verified ");
        driver.close();
	}

}

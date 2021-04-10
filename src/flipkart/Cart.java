package flipkart;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Cart {
	WebDriver driver;
	
	@FindBy(xpath = "((//div[@class='row'])[10]//button[@class='_2KpZ6l _2U9uOA _3v1-ww vsi37q'])[1]") private WebElement cart1;
	@FindBy(xpath = "((//div[@class='row'])[10]//button[@class='_2KpZ6l _2U9uOA _3v1-ww vsi37q'])[2]") private WebElement cart2;
	@FindBy(xpath = "((//div[@class='row'])[10]//button[@class='_2KpZ6l _2U9uOA _3v1-ww vsi37q'])[3]") private WebElement cart3;
	public Cart(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver; 
	}
	public void Ac2Details() {
	String text1 = driver.findElement(By.xpath("(//div[@class='row']//a[@class='_3L_M2k'])[1]")).getText();
		System.out.println("Model Name = " +text1);
		String price1 = driver.findElement(By.xpath("(//div[@class='row']//div[@class='_30jeq3'])[1]")).getText();
		System.out.println("Price = " +price1);
	}
	public void Ac3Details() {
		String text2 = driver.findElement(By.xpath("(//div[@class='row']//a[@class='_3L_M2k'])[2]")).getText();
		System.out.println("Model Name = " +text2);
		String price2 = driver.findElement(By.xpath("(//div[@class='row']//div[@class='_30jeq3'])[2]")).getText();
		System.out.println("Price = " +price2);
	}
	public void Ac6Details() {
		String text3 = driver.findElement(By.xpath("(//div[@class='row']//a[@class='_3L_M2k'])[3]")).getText();
		System.out.println("Model Name = " +text3);
		String price3 = driver.findElement(By.xpath("(//div[@class='row']//div[@class='_30jeq3'])[3]")).getText();
		System.out.println("Price = " +price3);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	public void Cart1() {
		cart1.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	public void Cart2() {	
		cart2.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	public void Cart3() {
		cart3.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
}

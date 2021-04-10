package flipkart;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pincode {
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='_2VjdZj _3ZnIlT']") private WebElement pin;
	@FindBy(xpath = "//div[@class='ibtBU6']") private WebElement pin2;

	
	public Pincode(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver; 
	}
	public void pincode1() {

		WebDriverWait w = new WebDriverWait(driver,50);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1Er18h']//div/descendant::input[@class='cfnctZ']"))).sendKeys("422605"+Keys.ENTER);;
		driver.findElement(By.xpath("//div[@class='_1Er18h']//div/descendant::input[@class='cfnctZ']")).sendKeys("422605");;

	}
	public void print() {
		String date = driver.findElement(By.xpath("(//div[@class='_2pqhhf'])[1]")).getText();
		System.out.println("Delivery Status for 422605 = " +date);
	}
	public void pincode2 () {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		pin.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		pin2.click();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='cfnctZ']")).sendKeys("421502"+Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
//		WebDriverWait l = new WebDriverWait(driver,50);
//		l.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_2pqhhf']"))).sendKeys("421502"+Keys.ENTER);;
//		driver.findElement(By.xpath("//div[@class='_2pqhhf']")).sendKeys("421502");;

	String date2 = driver.findElement(By.xpath("//div[@class='_2pqhhf']")).getText();
		System.out.println("Delivery Status for 421502 = " +date2);
	}
	public void exit() {
		driver.quit();
	}
	}


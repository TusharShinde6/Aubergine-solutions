package flipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compare {
	
	WebDriver driver;
	
	@FindBy(xpath = "((//div[@class='_1YokD2 _3Mn1Gg'])[2]//div/descendant::div[@class='_4ddWXP'])[2]") private WebElement AC2;
	@FindBy(xpath = "((//div[@class='_1YokD2 _3Mn1Gg'])[2]//div/descendant::div[@class='_4ddWXP'])[3]") private WebElement AC3;
	@FindBy(xpath = "((//div[@class='_1YokD2 _3Mn1Gg'])[2]//div/descendant::div[@class='_4ddWXP'])[6]") private WebElement AC6;
	@FindBy(xpath = "//div[@id='container']//a[@class='_11o22n _87aCMT']") private WebElement compare;
	public Compare (WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
}
	public void AC2()  {
		Actions a = new Actions(driver);
		a.moveToElement(AC2).build().perform();
		driver.findElement(By.xpath("((//div[@class='_1YokD2 _3Mn1Gg'])[2]//div/descendant::div[@class='_24_Dny'])[2]")).click();
	}

	public void AC3() {
		Actions a = new Actions(driver);
		a.moveToElement(AC3).build().perform();
		driver.findElement(By.xpath("((//div[@class='_1YokD2 _3Mn1Gg'])[2]//div/descendant::div[@class='_24_Dny'])[3]")).click();
	
	}
	public void Scroll() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);  
			   js.executeScript("scroll(0,1000)");
	}
	public void AC6() throws InterruptedException  {
		JavascriptExecutor js = ((JavascriptExecutor) driver);  
			   js.executeScript("scroll(0,500)");
			
		Actions a = new Actions(driver);
		a.moveToElement(AC6).build().perform();
		driver.findElement(By.xpath("((//div[@class='_1YokD2 _3Mn1Gg'])[2]//div/descendant::div[@class='_24_Dny'])[6]")).click();
	}
	
	public void Comp() {
		compare.click();
		
	}
}
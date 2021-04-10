package flipkart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;






	public class GoogleSearch {
		WebDriver driver;
	
		@FindBy(xpath = "//input[@class='gLFyf gsfi']") private WebElement searchFlipkart;
		@FindBy(xpath = "//h3[@class='LC20lb DKV0Md']") private WebElement clickflipkart;
		@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']") private WebElement closebtn;
	
	
	public GoogleSearch (WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
		

	public void EnterFlipkart() {
		
	searchFlipkart.sendKeys("flipkart");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
	System.out.println("Total Search Suggestion is = "+list.size());
	for (int i= 0; i<list.size();i++) {
		System.out.println(list.get(i).getText());
	}
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	public void openflipkart() {
		searchFlipkart.sendKeys((Keys.ENTER));
			clickflipkart.click();
}
	public void CloseBtn() {
		closebtn.click();
		
	}

}

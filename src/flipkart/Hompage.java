package flipkart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hompage {
	
	 WebDriver driver;
	@FindBy(linkText = "Appliances") private WebElement Appliances;
	@FindBy(xpath = "//a[contains(text(),'Air Conditioners')]") private WebElement AC;
	@FindBy(xpath = "//a[contains(text(),'All')]") private WebElement ALL;
	
	public Hompage (WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void Appliances () {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Appliances).build().perform();
	}
	public void AC () {
		Actions actions = new Actions(driver);
		actions.moveToElement(AC).build().perform();
	}
	public void ALL() {
		ALL.click();
	}
	}
	
	

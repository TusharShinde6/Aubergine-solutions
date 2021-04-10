package flipkart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {
	@Test
	public void FlipkartAssignment() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Tushar\\Eclipse Workspace 2020-09\\Assignment\\browser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
	
		GoogleSearch Search = new GoogleSearch(driver);
		Search.EnterFlipkart();
		Search.openflipkart();
		Search.CloseBtn();

 		Hompage open = new Hompage(driver);
 		open.Appliances();
 		open.AC();
 		open.ALL();
 		
		Compare c = new Compare(driver);
 		c.AC2();
 		c.AC3();
 		c.AC6();
 		c.Comp();
 		
 		Cart k = new Cart(driver);
 		k.Ac2Details();
 		k.Ac3Details();
 		k.Ac6Details();
 		
 		k.Cart2();
 		k.Cart3();
 		k.Cart1();
 		
 	Pincode p = new Pincode(driver);
 		p.pincode1();
 		p.print();
 		p.pincode2();
 		p.exit();
 		
}	
}
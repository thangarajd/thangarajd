package Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;



public class HookClass {
	public static WebDriver driver;
	
	@Before
	public void BeforeHook() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("before hook executed");
	}

	@After
	public void AfterHook() {
		
		driver.quit();
		System.out.println("After hook executed");
	}
}

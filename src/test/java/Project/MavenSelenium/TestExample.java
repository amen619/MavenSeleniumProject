package Project.MavenSelenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestExample {

	public static final String currentDir = System.getProperty("user.dir");
	
	@Test
	public void Test1(){
		System.out.println("Holaaaaaaa test 1");
		assertTrue( true );
	}
	
	@Test
	public void Test2(){
		System.out.println("Holaaaaaaa test 2");
		//TODO - nada
		assertTrue( true );
	}
	
	@Test
	public void Test3() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", currentDir + "\\drivers\\chromedriver_2.29\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.google.es/");
		Thread.sleep(2000);
		driver.close();
	}
	
	
}

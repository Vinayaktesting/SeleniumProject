import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CromeTesting 
{

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		String exePath = ("D:/chromedriver_win32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.close();
	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class new1 {

	/**
	 * @param args
	 * @throws FindFailed 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Mails\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		
		System.out.println(driver.getTitle());
		
		/*Pattern p =new Pattern("C:\\awsvtaf\\001.png");
		Screen s =new Screen();
		s.type(p, "Tester");
		
		Pattern q =new Pattern("C:\\awsvtaf\\002.png");
		
		s.type(q,"test");
		
		
		
		*/

	}

}

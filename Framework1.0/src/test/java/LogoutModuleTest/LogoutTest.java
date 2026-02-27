package LogoutModuleTest;

import org.testng.annotations.Test;

public class LogoutTest {
	

	@Test(groups = "ST")
	public void LogoutWithBrowser() {
		
		String browser= System.getProperty("browser");
		String url= System.getProperty("url");
		String usn= System.getProperty("usn");
		String password= System.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(usn);
		System.out.println(password);
		
		System.out.println("Logout With browser success");
	}
	@Test(groups ="RT" )
	public void LogoutWithoutBrowser() {
		
		
		String url= System.getProperty("url");
		String usn= System.getProperty("usn");
		String password= System.getProperty("password");
		System.out.println(url);
		System.out.println(usn);
		System.out.println(password);
		System.out.println("Logout Without browser success");

	}

}

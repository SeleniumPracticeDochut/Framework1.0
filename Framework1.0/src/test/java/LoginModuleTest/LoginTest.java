package LoginModuleTest;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(groups = "ST")
	public void LoginWithBrowser() {
		
		String browser= System.getProperty("browser");
		String url= System.getProperty("url");
		String usn= System.getProperty("usn");
		String password= System.getProperty("password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(usn);
		System.out.println(password);
		
		System.out.println("Login With browser success");
	}
	@Test(groups = "RT")
	public void LoginWithoutBrowser() {
		
		
		String url= System.getProperty("url");
		String usn= System.getProperty("usn");
		String password= System.getProperty("password");
		System.out.println(url);
		System.out.println(usn);
		System.out.println(password);
		System.out.println("Login Without browser success");

	}

}

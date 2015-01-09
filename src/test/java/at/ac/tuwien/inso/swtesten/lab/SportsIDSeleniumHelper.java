package at.ac.tuwien.inso.swtesten.lab;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import at.ac.tuwien.inso.swtesten.util.SeleniumWebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SportsIDSeleniumHelper {

	public static final String CORRECT_USERNAME = "gruppe23b";
	public static final String INCORRECT_PASSWORD = "asdf";
	
	private WebDriver driver;
	private String baseUrl;
	private WebDriverWait wait;

	public void setUp() {
		driver = SeleniumWebDriver.getDriver();
		baseUrl = "https://sportsid.risedev.at/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		wait = new WebDriverWait( driver, 30 );
	}
	
	public void goToLogin() {
		this.setUp();
		driver.get( this.baseUrl );
	}
	
	@After
	public void shutDown() {
		SeleniumWebDriver.closeDriver();
	}

	public void enterUserName(String username) {
		driver.findElement( By.id("input-username") ).sendKeys( username );
	}
	
	public void enterPassword( String password ) {
		driver.findElement( By.id("input-password") ).sendKeys( password );
	}

	public void pressLoginButton() {
		driver.findElement( By.id("login-button") ).click();
	}	

	public void assertUnauthorizedMessageShown() {
		By l = By.xpath("//span[contains(text(),'Unauthorized')]");
		WebElement elem = wait.until( ExpectedConditions.visibilityOfElementLocated(l) );
		Assert.assertNotNull( elem );
	}


}

package queenb.webinaris.project;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;
import pageObjects.RegisterPageObject;
import pageObjects.ShowtimePageObject;

public class Registration_Lp extends AbstractTest {
	WebDriver driver;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public ShowtimePageObject showtimePage;
	public RegisterPageObject registerPage;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) throws Exception {

		driver = openMultiBrowser(browserName);
	}

	public int randomNumber() {
		Random random = new Random();
		return random.nextInt(999);
	}

	@Test
	public void TC_01_Login() {
		loginPage = new LoginPageObject(driver);
		loginPage.login();
	}

	@Test
	public void TC_02_New_Project() throws Exception {
		newProject = new NewProjectObject(driver);
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	@Test
	public void TC_03_Setting_Showtimes() throws Exception {
		showtimePage = new ShowtimePageObject(driver);
		showtimePage.clickShowtimeMenu();
		showtimePage.clickOption();
		showtimePage.clickOptionMyself();
		showtimePage.clickOption60Minutes();
		showtimePage.clickOption5Minutes();
		showtimePage.clickOptionNo();
		showtimePage.clickOptionYes();
		showtimePage.clickButtonSave();
		Thread.sleep(6000);
	}

	@Test
	public void TC_04_Register() throws Exception {

		String urlBasicSetting = getCurrentPageUrl(driver);
		String fb050 = urlBasicSetting.substring(35);
		openAnyUrl(driver, "https://20071.webinaris.co/" + fb050 + "/selenium.html?mode=N&v=4");
		String oldTab = driver.getWindowHandle();

		registerPage = new RegisterPageObject(driver);
		registerPage.clickButton();
		registerPage.inputFirtname();
		registerPage.inputLastname();
		registerPage.inputEmail();
		registerPage.clickButtonSubmit();
		Thread.sleep(2000);

		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		driver.switchTo().window(newTab.get(0));

		driver.close();

		driver.switchTo().window(oldTab);

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}

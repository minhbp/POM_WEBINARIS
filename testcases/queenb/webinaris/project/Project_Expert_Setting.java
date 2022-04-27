package queenb.webinaris.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.AbstractPage;
import pageObjects.ExpertPageObject;
import pageObjects.LoginPageObject;
import pageObjects.NewProjectObject;

public class Project_Expert_Setting extends AbstractPage {
	WebDriver driver;
	WebDriverWait explicitWait;
	WebDriverWait waitExplicit;

	public LoginPageObject loginPage;
	public NewProjectObject newProject;
	public ExpertPageObject expertPage;

	String closeRoom, urlRedirect;

	@BeforeClass
	public void beforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\WEBDRIVER_API_MinhDV\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		waitExplicit = new WebDriverWait(driver, 10);

		driver.manage().window().setPosition(new Point(0, 0)); // set start point
		Dimension d = new Dimension(960, 1080); // set width height browser
		driver.manage().window().setSize(d);
		driver.manage().window().maximize();

		closeRoom = "50";
		urlRedirect = "google.com.vn";

		loginPage = new LoginPageObject(driver);
		newProject = new NewProjectObject(driver);
		expertPage = new ExpertPageObject(driver);

		loginPage.login();
		newProject.createNewProject();
		Thread.sleep(2000);
	}

	@Test
	public void TC_01_Region_Setting() throws Exception {
		expertPage.clickExpertMenu();
		expertPage.clickRegionMenu();
		
		for (int i = 1, n = 21; i < n; i++) {
			expertPage.clickLanguage();
			scrollToElement(driver, "(//div[@role='option'])[" + i + "]");
			clickToElement(driver, "(//div[@role='option'])[" + i + "]");
			expertPage.clickSave();
		}
		
		for (int i = 21, n = 84; i < n; i++) {
			expertPage.clickTimezone();
			scrollToElement(driver, "(//div[@role='option'])[" + i + "]");
			clickToElement(driver, "(//div[@role='option'])[" + i + "]");
			expertPage.clickSave();
		}

/*		expertPage.clickLanguage();
		expertPage.selectLanguageGerman();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageVietNam();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageEnglish();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageFrench();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageItalian();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguagePortuguese();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageTurkish();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageDutch();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageRussian();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageRomanian();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageHungarian();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageNorwegian();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageLatvian();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageFinnish();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageSlovak();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageCzech();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageSwedish();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageSerbian();
		expertPage.clickSave();

		expertPage.clickLanguage();
		expertPage.selectLanguageDanish();
		expertPage.clickSave(); 

		expertPage.clickTimezone();
		expertPage.selectTimezone1();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone2();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone3();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone4();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone5();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone6();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone7();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone8();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone9();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone10();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone11();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone12();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone13();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone14();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone15();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone16();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone17();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone18();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone19();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone20();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone21();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone22();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone23();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone24();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone25();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone26();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone27();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone28();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone29();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone30();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone31();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone32();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone33();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone34();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone35();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone36();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone37();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone38();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone39();
		expertPage.clickSave();
		
		expertPage.clickTimezone();
		expertPage.selectTimezone40();
		expertPage.clickSave(); */
		
		expertPage.clickTimeFormat();
		expertPage.selectTimeAmPm();
		expertPage.clickSave();
		
		expertPage.clickTimeFormat();
		expertPage.selectTime24h();
		expertPage.clickSave();
		
		expertPage.clickDateFormat();
		expertPage.selectOption1DateFormat();
		expertPage.clickSave();
		
		expertPage.clickDateFormat();
		expertPage.selectOption2DateFormat();
		expertPage.clickSave();
		
		expertPage.clickDateFormat();
		expertPage.selectOption3DateFormat();
		expertPage.clickSave();
		
		expertPage.clickDateFormat();
		expertPage.selectOption4DateFormat();
		expertPage.clickSave();
		
		expertPage.clickDateFormat();
		expertPage.selectOption5DateFormat();
		expertPage.clickSave();
		
		expertPage.clickDateFormat();
		expertPage.selectOption6DateFormat();
		expertPage.clickSave();
		
		expertPage.clickDateFormat();
		expertPage.selectOption7DateFormat();
		expertPage.clickSave();
		
	}

	@Test
	public void TC_02_Deails_Setting() throws Exception {
		expertPage.clickDetailMenu();
		
		expertPage.clickStatusParticipant();
		expertPage.selectStatusAtLogin();
		expertPage.clickSave();
		
		expertPage.clickStatusParticipant();
		expertPage.selectStatus5();
		expertPage.clickSave();
		
		expertPage.clickStatusParticipant();
		expertPage.selectStatus10();
		expertPage.clickSave();
		
		expertPage.clickStatusParticipant();
		expertPage.selectStatus15();
		expertPage.clickSave();
		
		expertPage.clickStatusParticipant();
		expertPage.selectStatus20();
		expertPage.clickSave();
		
		expertPage.clickStatusParticipant();
		expertPage.selectStatus25();
		expertPage.clickSave();
		
		expertPage.clickMobileDevices();
		expertPage.selectMobileYes();
		expertPage.clickSave();
		
		expertPage.clickMobileDevices();
		expertPage.selectMobileNo();
		expertPage.clickSave();
		
		expertPage.clickDelay();
		expertPage.selectDelayNo();
		expertPage.clickSave();
		
		expertPage.clickDelay();
		expertPage.selectDelay1Minutes();
		expertPage.clickSave();
		
		expertPage.clickDelay();
		expertPage.selectDelay2Minutes();
		expertPage.clickSave();
		
		expertPage.clickDelay();
		expertPage.selectDelay3Minutes();
		expertPage.clickSave();
		
		expertPage.clearCloseRoom();
		expertPage.inputCloseRoom(closeRoom);
		expertPage.clickSave();
	}

	@Test
	public void TC_03_Redirect_Setting() throws Exception {
		expertPage.clickRedirectMenu();
		expertPage.inputUrlRedirect(urlRedirect);
		expertPage.clickSave();
	}

	@Test
	public void TC_04_Replay_Setting() throws Exception {
		expertPage.clickReplayMenu();
		expertPage.clickOptionReplay();
		expertPage.selectOptionYes();
		expertPage.clickSave();
		expertPage.clickOptionReplay();
		expertPage.selectOptionNo();
		expertPage.clickSave();
	}

	@Test
	public void TC_05_Vacation_Setting() throws Exception {
		expertPage.clickVacationMenu();
		expertPage.clickNewVacationButton();
		expertPage.clickVacationSetting();
		expertPage.selectVacationOnce();
		expertPage.clickSave();
		expertPage.clickNewVacationButton();
		expertPage.clickVacationSetting();
		expertPage.selectVacationAnnual();
		expertPage.clickSave();
	}

	@Test
	public void TC_06_Delay_Showtime_Setting() throws Exception {
		expertPage.clickPreparationMenu();
		expertPage.clickPreparationOptions();
		expertPage.selectOptionPreparationNo();
		expertPage.clickSave();
		expertPage.clickPreparationOptions();
		expertPage.selectOptionPreparationYes();
		expertPage.clearTimeDay();
		expertPage.inputDayDelay("3");
		expertPage.clickSave();
	}

	@Test
	public void TC_07_Participant_Setting() throws Exception {
		expertPage.clickParticipantMenu();
		
		expertPage.clickParticipantLoadBalancing();
		expertPage.selectNextHour();
		expertPage.clickSave();
		expertPage.clickParticipantLoadBalancing();
		expertPage.selectNextShowtime();
		expertPage.clickSave();
		
		expertPage.clickMaximum();
		expertPage.clickMaximum10();
		expertPage.clickSave();
		expertPage.clickMaximum();
		expertPage.clickMaximum25();
		expertPage.clickSave();
		expertPage.clickMaximum();
		expertPage.clickMaximum50();
		expertPage.clickSave();
		expertPage.clickMaximum();
		expertPage.clickMaximum100();
		expertPage.clickSave();
		expertPage.clickMaximum();
		expertPage.clickMaximum250();
		expertPage.clickSave();
		expertPage.clickMaximum();
		expertPage.clickMaximum500();
		expertPage.clickSave();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}

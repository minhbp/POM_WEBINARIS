package commons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

	public void openAnyUrl(WebDriver driver, String urlValue) {
		driver.get(urlValue);
	}

	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}
	
	public void accepAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();;
	}
	
	public String getText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	
	public void sendkeyAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	// web element

	public void clickToElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public void clickToElement(WebDriver driver, String locator, String name) {
		locator = String.format(locator, name);
		element = driver.findElement(By.xpath(locator));
		element.click();
	}
	
	public String getTextElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	public void clearElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		element.sendKeys(Keys.CONTROL, "a");
		element.sendKeys(Keys.DELETE);
	}

	public void sendkeyToElement(WebDriver driver, String locator, String value) {
		element = driver.findElement(By.xpath(locator));
		element.sendKeys(value);
	}

	public void switchBrowser(WebDriver driver, String value) {
		element = driver.findElement(By.xpath("body"));
		element.sendKeys(Keys.CONTROL + value);
	}

	public boolean isDisplayElement(WebDriver driver, String locator) {
		try {
			element = driver.findElement(By.xpath(locator));
			return element.isDisplayed();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}

	public boolean isDisplayElement(WebDriver driver, String locator, String name) {
		locator = String.format(locator, name);
		element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public void waitToElementInvisibleIconLoading(WebDriver driver) {
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions
				.invisibilityOfElementLocated(By.xpath("//div[@class='w-loading-overlay']//*[name()='svg']")));
	}

	public void waitToElementVisibleMessageAndClose(WebDriver driver) {
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Awesome - that worked!']")));
		driver.findElement(By.xpath("//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']")).click();
	}
	
	public void waitToElementVisibleIconLoading(WebDriver driver) {
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='w-loading-overlay']//*[name()='svg']")));
	}

	public void waitToElementInvisible(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
	}

	public void waitToElementVisible(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	public void waitToElementVisible(WebDriver driver, String locator, String name) {
		locator = String.format(locator, name);
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	public void waitToEnableButton(WebDriver driver, String locator) {
		waitExplicit = new WebDriverWait(driver, 30);
		waitExplicit.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
	}

	public void scrollToElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public int countItemDropdown(WebDriver driver, String locator) {
		List<WebElement> allItem = driver.findElements(By.xpath(locator));
		return allItem.size();
	}

	WebElement element;
	WebDriverWait waitExplicit;

}

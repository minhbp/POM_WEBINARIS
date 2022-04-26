package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.TrackingCodePageUI;

public class TrackingPageObject extends AbstractPage{
private WebDriver driver;
	
	public TrackingPageObject (WebDriver mappingdriver) {
		driver = mappingdriver;
	}
	
	public void clickExpertMenu() {
		waitToElementVisible(driver, TrackingCodePageUI.EXPERT_MENU);
		clickToElement(driver, TrackingCodePageUI.EXPERT_MENU);
	}
	
	public void clickTrackingMenu() {
		waitToElementVisible(driver, TrackingCodePageUI.TRACKING_MENU);
		clickToElement(driver, TrackingCodePageUI.TRACKING_MENU);
	}
	
	public void clickNewTrackingButton() {
		waitToEnableButton(driver, TrackingCodePageUI.NEW_TRACKING_BUTTON);
		clickToElement(driver, TrackingCodePageUI.NEW_TRACKING_BUTTON);
	}
	
	public void inputTrackingName(String name) {
		waitToElementVisible(driver, TrackingCodePageUI.NAME_TRACKING_TEXTBOX);
		sendkeyToElement(driver, TrackingCodePageUI.NAME_TRACKING_TEXTBOX, name);
	}
	
	public void clickEvent() {
		waitToElementVisible(driver, TrackingCodePageUI.EVENT_OPTIONS);
		clickToElement(driver, TrackingCodePageUI.EVENT_OPTIONS);
	}
	
	public void selectEvetnOpenRegistrationPage() {
		waitToElementVisible(driver, TrackingCodePageUI.OPEN_REGISTRATION_PAGE);
		clickToElement(driver, TrackingCodePageUI.OPEN_REGISTRATION_PAGE);
	}
	
	public void inputTrackingBeforeHead(String headcode) {
		waitToElementVisible(driver, TrackingCodePageUI.BEFORE_HEAD_TAG_TEXTAREA);
		sendkeyToElement(driver, TrackingCodePageUI.BEFORE_HEAD_TAG_TEXTAREA, headcode);
	}
	
	public void inputTrackingAfterBody(String afterbodycode) {
		waitToElementVisible(driver, TrackingCodePageUI.AFTER_BODY_TAG_TEXTAREA);
		sendkeyToElement(driver, TrackingCodePageUI.AFTER_BODY_TAG_TEXTAREA, afterbodycode);
	}
	
	public void inputTrackingBeforeBody(String beforebodycode) {
		waitToElementVisible(driver, TrackingCodePageUI.BEFORE_BODY_TEXTAREA);
		sendkeyToElement(driver, TrackingCodePageUI.BEFORE_BODY_TEXTAREA, beforebodycode);
	}
	
	public void clickSaveButton() {
		waitToEnableButton(driver, TrackingCodePageUI.SAVE_BUTTON);
		clickToElement(driver, TrackingCodePageUI.SAVE_BUTTON);
		
		waitToElementVisible(driver, TrackingCodePageUI.SUCCESS_MESSAGE);
	}
	
	
	
}

package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.EmailsPageUI;

public class EmailsPageObject extends AbstractPage {
	private WebDriver driver;

	public EmailsPageObject(WebDriver mappingdriver) {
		driver = mappingdriver;
	}

	public void clickEmailMenu() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_MENU);
		clickToElement(driver, EmailsPageUI.EMAIL_MENU);
	}

	// Email - sender
	public void clickSenderMenu() {
		waitToElementVisible(driver, EmailsPageUI.SENDER_MAIL_MENU);
		clickToElement(driver, EmailsPageUI.SENDER_MAIL_MENU);
		
		waitToElementVisibleIconLoading(driver);
		waitToElementInvisibleIconLoading(driver);
	}

	public void clearNameSender() {
		waitToElementVisible(driver, EmailsPageUI.SENDER_NAME_TEXTBOX);
		clearElement(driver, EmailsPageUI.SENDER_NAME_TEXTBOX);
	}

	public void inputNameSender(String name) {
		sendkeyToElement(driver, EmailsPageUI.SENDER_NAME_TEXTBOX, name);
	}

	public void clearMailAddress() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_ADDRESS_TEXTBOX);
		clearElement(driver, EmailsPageUI.EMAIL_ADDRESS_TEXTBOX);
	}

	public void inputMailAddress(String mail) {
		sendkeyToElement(driver, EmailsPageUI.EMAIL_ADDRESS_TEXTBOX, mail);
	}

	// Email - Setting
	public void clickSettingMenu() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_SETTINGS_MENU);
		clickToElement(driver, EmailsPageUI.EMAIL_SETTINGS_MENU);
		
		waitToElementVisibleIconLoading(driver);
		waitToElementInvisibleIconLoading(driver);
	}

	public void clickDoiOptions() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_SETTINGS_DOI);
		clickToElement(driver, EmailsPageUI.EMAIL_SETTINGS_DOI);
	}

	public void selectDoiIsYes() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_SETTINGS_DOI_YES);
		clickToElement(driver, EmailsPageUI.EMAIL_SETTINGS_DOI_YES);
	}

	public void selectDoiForUnsubcribe() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_SETTINGS_DOI_FOR_UNSUBSCRIBE);
		clickToElement(driver, EmailsPageUI.EMAIL_SETTINGS_DOI_FOR_UNSUBSCRIBE);
	}

	public void selectDoiIsNo() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_SETTINGS_DOI_NO);
		clickToElement(driver, EmailsPageUI.EMAIL_SETTINGS_DOI_NO);
	}

	public void clickReRegistrationOptions() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_SETTINGS_RE_INVITATION);
		clickToElement(driver, EmailsPageUI.EMAIL_SETTINGS_RE_INVITATION);
	}

	public void selectReRegistrationisYes() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_SETTINGS_RE_INVITATION_YES);
		clickToElement(driver, EmailsPageUI.EMAIL_SETTINGS_RE_INVITATION_YES);
	}

	public void selectReRegistrationisNo() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_SETTINGS_RE_INVITATION_NO);
		clickToElement(driver, EmailsPageUI.EMAIL_SETTINGS_RE_INVITATION_NO);
	}

	// Email - Email
	public void clickEmailEmailMenu() {
		waitToElementVisible(driver, EmailsPageUI.EMAIL_EMAIL_MENU);
		clickToElement(driver, EmailsPageUI.EMAIL_EMAIL_MENU);
		
		waitToElementVisibleIconLoading(driver);
		waitToElementInvisibleIconLoading(driver);
	}

	public void clickOptionMailLoginInfo() {
		waitToElementVisible(driver, EmailsPageUI.OPTIONS_LOGIN_INFO);
		clickToElement(driver, EmailsPageUI.OPTIONS_LOGIN_INFO);
	}

	public void clickDeleteOption() {
		waitToElementVisible(driver, EmailsPageUI.OPTIONS_DELETE);
		clickToElement(driver, EmailsPageUI.OPTIONS_DELETE);
	}

	public void clickConfirmDelete() {
		waitToEnableButton(driver, EmailsPageUI.DELETE_CONFIRM_BUTTON);
		clickToElement(driver, EmailsPageUI.DELETE_CONFIRM_BUTTON);

		waitToElementVisible(driver, EmailsPageUI.SUCCESS_MESSAGE);
		clickToElement(driver, EmailsPageUI.CLOSE_MESSAGE_ICON);
	}

	public void clickNewEmailButton() {
		waitToEnableButton(driver, EmailsPageUI.NEW_EMAIL_BUTTON);
		clickToElement(driver, EmailsPageUI.NEW_EMAIL_BUTTON);
	}

	public void clickSelectTemplateButotn() {
		waitToEnableButton(driver, EmailsPageUI.SELECT_TEMPLATE_BUTTON);
		clickToElement(driver, EmailsPageUI.SELECT_TEMPLATE_BUTTON);
	}

	public void clickLoadTemplateButton() throws Exception {
		waitToElementVisible(driver, EmailsPageUI.LOAD_TEMPLATE_BUTTON);
		scrollToElement(driver, EmailsPageUI.LOAD_TEMPLATE_BUTTON);
		Thread.sleep(500);
		clickToElement(driver, EmailsPageUI.LOAD_TEMPLATE_BUTTON);
	}

	public void clickSave() {
		waitToEnableButton(driver, EmailsPageUI.SAVE_BUTTON);
		clickToElement(driver, EmailsPageUI.SAVE_BUTTON);

		waitToElementVisible(driver, EmailsPageUI.SUCCESS_MESSAGE);
		clickToElement(driver, EmailsPageUI.CLOSE_MESSAGE_ICON);
	}

	public void clickConfirmButton() {
		waitToEnableButton(driver, EmailsPageUI.CONFIRM_BUTTON);
		clickToElement(driver, EmailsPageUI.CONFIRM_BUTTON);
		waitToElementVisible(driver, EmailsPageUI.SUCCESS_MESSAGE);
		clickToElement(driver, EmailsPageUI.CLOSE_MESSAGE_ICON);
	}

}

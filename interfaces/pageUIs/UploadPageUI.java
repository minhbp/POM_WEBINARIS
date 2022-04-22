package pageUIs;

import java.util.Random;

public class UploadPageUI {

	static String VIDEOLYSER_NAME = "video lyser " + randomNumber();
	static String VIDEOLYSER_LINK = "https://www.videolyser.de/m3u8/26588638.m3u8";

	static String VIMEO_NAME = "vimeo " + randomNumber();
	static String VIDEOMEO_LINK = "https://player.vimeo.com/external/475909882.m3u8?s=dd7aca275b34f1a1b979996592c176f929861037";

	static String MP4_NAME = "mp4 " + randomNumber();
	static String MP4_LINK = "https://2bewebinaris-fra.s3.amazonaws.com/20062/1644914150425.mp4";

	static String LOCAL_VIDEO_LINK = "C:\\Users\\Ming\\Videos\\Captures\\123.mp4";
	static String LOCAL_IMG_LINK = "D:\\img\\img01.jpg";

	public static final String UPLOAD_PAGE_URL = "https://app.webinaris.co/media";
	public static final String BUTTON_NEW_FILE = "//button[contains(text(),'New file')]";
	public static final String BUTTON_VIDEO = "(//span[@class='v-btn__content'][normalize-space()='Continue'])[1]/parent::button";
	public static final String BUTTON_VIDEO_SOUCRE = "(//span[@class='v-btn__content'][normalize-space()='Continue'])[2]/parent::button";
	public static final String VIDEO_SOUCRE_NAME = "(//input[@type='text'])[4]";
	public static final String VIDEO_SOUCRE_STYLE = "(//div[@class='v-select__slot'])[3]";

	public static final String VIDEO_SOUCRE_STYLE_VIDEOLYSER = "//div[contains(text(),'Videolyser')]";
	public static final String VIDEO_SOUCRE_INPUT_VIDEOLYSER_NAME_TXT = VIDEOLYSER_NAME;
	public static final String VIDEO_SOUCRE_INPUT_VIDEOLYSER_URL_TXT = VIDEOLYSER_LINK;

	public static final String VIDEO_SOUCRE_STYLE_VIMEO = "//div[@class='v-list-item__title'][normalize-space()='Vimeo']";
	public static final String VIDEO_SOUCRE_INPUT_VIMEO_NAME_TXT = VIMEO_NAME;
	public static final String VIDEO_SOUCRE_STYLE_VIMEO_URL_TXT = VIDEOMEO_LINK;

	public static final String VIDEO_SOUCRE_STYLE_MP4 = "//div[contains(text(),'mp4 file on custom server')]";
	public static final String VIDEO_SOUCRE_INPUT_MP4_NAME_TXT = MP4_NAME;
	public static final String VIDEO_SOUCRE_STYLE_MP4_URL_TXT = MP4_LINK;

	public static final String VIDEO_SOUCRE_URL = "(//input[@type='text'])[6]";
	public static final String BUTTON_VIDEO_SOUCRE_ICON_LOAD_DURATION = "//i[@class='v-icon notranslate fwbn fwbn-reload theme--light']";
	public static final String BUTTON_VIDEO_SOUCRE_BUTTON_SAVE = "//span[normalize-space()='Save']/parent::button";

	public static final String BUTTON_VIDEO_UPLOAD_STEP2 = "(//span[@class='v-btn__content'][normalize-space()='Continue'])[3]/parent::button";
	public static final String VIDEO_UPLOAD_BUTTON_STEP3 = "//label[normalize-space()='Upload']";
	public static final String VIDEO_UPLOAD_INPUT_DATA = "//input[@accept='video/*,.mkv']";
	public static final String VIDEO_UPLOAD_INPUT_DATA_LOCAL = LOCAL_VIDEO_LINK;
	public static final String VIDEO_UPLOAD_100 = "//span[normalize-space()='100%']";

	public static final String FILE_UPLOAD_LABEL = "//label[normalize-space()='Select file']";
	public static final String FILE_UPLOAD_DATA = "//input[@accept='image/*']";
	public static final String FILE_UPLOAD_DATA_LOCAL = LOCAL_IMG_LINK;

	public static final String UPLOAD_SUCCESS_MESSAGE = "//span[normalize-space()='Awesome - that worked!']";
	public static final String MEDIA_TEXT = "//p[normalize-space()='Manage your videos, documents and files']";
	public static final String CLOSE_MESSAGE_ICON = "//i[@class='v-icon notranslate fwbn fwbn-cancel theme--dark']";

	public static final String UPLOAD_ICONS_SELECT = "(//i[@class='_icon fwbn-ellipsis-v'])";
	public static final String UPLOAD_DELETE_OPTION = "//a[normalize-space()='Delete']";
	public static final String UPLOAD_CONFIRM_BUTTON = "//button[normalize-space()='Confirm']";

	public static int randomNumber() {
		Random random = new Random();
		return random.nextInt(9999);
	}

}

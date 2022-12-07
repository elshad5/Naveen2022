package selenium;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.amazon.com");
		
		
		if(brUtil.isUrlFractionExist("Amazon")) {
			System.out.println("url is correct with amazon...Pass");
		}else {
			System.out.println("Fail");
		}
		
		if(brUtil.isInfoExistInPageSource("https://completion.amazon.com")) {
			System.out.println("page source is correct with fraction url...Pass");
		}else {
			System.out.println("Fail");
		}
		
		if(brUtil.getPageTitle().contains("Smile")){
			System.out.println("correct title");
		}else {
			System.out.println("Incorrct title...Fail");
		}
		brUtil.quitBrowser();
	}

}

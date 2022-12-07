package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;
	private Actions act;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
		act=new Actions(driver);
	}
	
	//8th:
	public By getBy(String locatorType,String selector) {
		By locator=null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator=By.id(selector);			
			break;
		case "name":
			locator=By.name(selector);			
			break;
		case "class":
			locator=By.className(selector);			
			break;
		case "xpath":
			locator=By.xpath(selector);			
			break;
		case "css":
			locator=By.cssSelector(selector);			
			break;
		case "linkText":
			locator=By.linkText(selector);			
			break;
		case "partiallinkText":
			locator=By.partialLinkText(selector);			
			break;
		case "tagname":
			locator=By.tagName(selector);			
			break;

		default:
			break;
		}
		return locator;
	}
	
	
	public void doSendKeys(String locatorType,String selector,String value) {
		By locator=getBy(locatorType,selector);
		getElement(locator).sendKeys(value);;
	}
	
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	
	public  void doClick(String locatorType,String selector) {
		By locator=getBy(locatorType,selector);
		getElement(locator).click();
	}
	
	
		public WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public void doSendKeys(By locator,String value) {
			getElement(locator).sendKeys(value);
			
		}
		
		public String doElementGetText(By locator) {
			String eleText=getElement(locator).getText();
//			System.out.println(eleText);
			return eleText;
		}
		
		public String doGetAttribute(By locator,String attrName) {
			return getElement(locator).getAttribute(attrName);
		}
		
		//non blank text count:
		public int getelementTextCount(By locator) {
			return getElementsTextList(locator).size();
		}
		
		//non blank text list:
		public List<String> getElementsTextList(By locator) {
			List <WebElement> eleList= getElements(locator);
			List<String>eleTextList=new ArrayList<String>();
			for(WebElement e:eleList) {
				String text=e.getText();
				if(!text.isEmpty()) {
					eleTextList.add(text);
				}
			}return eleTextList;
		}
		
		public int getEmptyEleTextList(By locator) {
			int totalLinks=getPageElementsCount(locator);
			int totalNonEmptyLinks= getelementTextCount(locator);
			return totalLinks-totalNonEmptyLinks;
		}
		//1. total number of links on the page
		public  int getPageElementsCount(By locator) {
			return getElements(locator).size();
		}
	public  List <WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}
	
	public List<String> getAttributeList(By locator,String attrName) {
		List<WebElement>eleList=getElements(locator);
		List<String>attrValueList=new ArrayList<String>();
		
		for(WebElement e:eleList) {
			String attrValue=e.getAttribute(attrName);
			attrValueList.add(attrValue);
		}return attrValueList;
	}
	
	
	public void performSearch(By search,String searchKey,By suggListLocator,String suggName) throws InterruptedException {
		doSendKeys(search,searchKey);
		Thread.sleep(3000);
		List<WebElement> list=getElements(suggListLocator);
		System.out.println("total list: "+list.size());
		
		for(WebElement e: list) {
			String text=e.getText();
			System.out.println("total list-->: "+text);
			if(text.contains(suggName)) {
				e.click();
				break;
			}
		}
	}
	
	public void selectItem(String productName) {
		By locator=By.xpath("//li[text()='"+productName+"']");
		doClick(locator);
	}
	
	//=======================element displayed utils=========================
	
	public  boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public  int getElementCount(By locator) {
		int eleCount=getElements(locator).size();
		return eleCount;
	}
	public  boolean checkSingleElementExist(By locator) {
		if(getElementCount(locator)==1) {
			return true;
		}return false;
	}

	public  boolean checkMultipleElementExist(By locator) {
		if(getElementCount(locator)>1) {
			return true;
		}return false;
	}
	//=======select tag based drop down utils=========
	public  void doSelectByIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public  void doSelectByVisible(By locator,String visibleText) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public  void doSelectByValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	public int getDropDownCount(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions().size();
		}
	
	public List<String> getDropDownValueList(By locator) {
		Select select=new Select(getElement(locator));
		List<String> optionsValList=new ArrayList<String>();
		List<WebElement> optionsElement=select.getOptions();
		for(WebElement e:optionsElement) {
			String text=e.getText();
			optionsValList.add(text);
		}
return optionsValList;
	}
	
	public void doSelectValuFromDropDown(By locator,String value) {
		List<WebElement>optionList=getElements(locator);
		
		for(WebElement e:optionList) {
			String text=e.getText();// store in var, then use it is this kind of cases
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}

	}
public void doSelectValuUsingOptions(By locator,String value) {
	Select select=new Select(getElement(locator));
	List<WebElement>optionList=select.getOptions();
	
	for(WebElement e:optionList) {
		String text=e.getText();// store in var, then use it is this kind of cases
		System.out.println(text);
		if(text.equals(value)) {
			e.click();
			break;
		}
	}

}


public void handle_two_level_menu_items(By parentMenu,By childMenu) {
	Actions act=new Actions(driver);
	act.moveToElement(getElement(parentMenu)).perform();
	getElement(childMenu).click();
}

public  void doActionsSendKeys(By locator,String value) {
	act.sendKeys(getElement(locator),value).perform();
}

public  void doActionsClick(By locator) {
	act.click(getElement(locator)).perform();
}

	
}

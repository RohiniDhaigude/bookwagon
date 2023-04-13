package pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import testCase.WebTestBase;

	public class HomePage extends WebTestBase {
		@FindBy(id = "ctl00_lblUser")
	    WebElement usersearch;

	    public HomePage(){
	        PageFactory.initElements(driver,this);
	    }

	    public void userSearchClick(){
	        usersearch.click();
	    }

	}


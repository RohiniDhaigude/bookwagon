package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCase.WebTestBase;
public class LoginPage extends WebTestBase {
	@FindBy(name = "ctl00$phBody$SignIn$txtEmail")
    WebElement mobileTextBox;

    @FindBy(name = "ctl00$phBody$SignIn$txtPassword")
    WebElement passwordTextBox;

    @FindBy(id = "ctl00_phBody_SignIn_btnLogin")
    WebElement loginbtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void login(String mobile, String password){
        mobileTextBox.sendKeys(mobile);
        passwordTextBox.sendKeys(password);
        loginbtn.click();
    }
}
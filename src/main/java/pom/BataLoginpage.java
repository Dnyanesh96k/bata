package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BataLoginpage {
	@FindBy(xpath="//a[@class='cc-headerBar-link loginLink']")private WebElement login;
	@FindBy(xpath="//input[@id='login-form-email']")private WebElement name;
	@FindBy(xpath="//input[@id='login-form-password']")private WebElement pass;
	@FindBy(xpath="//button[@class='cc-button-type-1 js-analytics-loginButton']")private WebElement signin;
	@FindBy(xpath="//a[@id='password-reset']")private WebElement forgot;
	@FindBy(xpath="//label[@class='cc-check-label custom-control-label']")private WebElement remember;
	@FindBy(xpath="(//button[@class=\"cc-button-type-3\"])[1]")private WebElement register;
	public BataLoginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	public void LoginClick() {
		login.click();
	}
	public void SendName(String NAME) {
		name.sendKeys(NAME);
	}
	public void SendPass(String PASS) {
		pass.sendKeys(PASS);
	}
	public void ClickSignin() {
		signin.click();
	}
	public void ClickForgot() {
		forgot.click();
	}
	public void RememberClick() {
		remember.click();
	}
	public void registerClick() {
		register.click();
	}
}

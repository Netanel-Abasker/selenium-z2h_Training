package builder.pages;

import org.openqa.selenium.WebDriver;

import builder.BasePage;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class LoginPage extends BasePage {

    @FindBy(id = "login_field")
    private WebElement inputUserName;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(name = "commit")
    private WebElement commitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage click(){
        commitButton.click();
        return this;
    }

    public LoginPage inputUserName(String input){
        inputUserName.clear();
        inputUserName.sendKeys(input);
        return this;
    }

    public LoginPage inputPassword(String input){
        inputPassword.clear();
        inputPassword.sendKeys(input);
        return this;
    }
}

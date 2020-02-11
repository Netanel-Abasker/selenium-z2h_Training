package builder.flows;

import builder.ISeleniumDriver;
import builder.pages.LoginPage;

public class LoginFlow {

    public static void basicLoginFlow(ISeleniumDriver seleniumDriver, String username, String password ) {
        LoginPage loginPage = new LoginPage(seleniumDriver.getDriver());
        loginPage.inputUserName(username);
        loginPage.inputPassword(password);
        loginPage.click();
    }

    public static void basicLoginFluentFlow(ISeleniumDriver seleniumDriver, String username, String password ){
        new LoginPage(seleniumDriver.getDriver()).inputUserName(username).inputPassword(password).click();
    }

}

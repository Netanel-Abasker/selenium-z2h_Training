package ui_integration;

import builder.ChromeStandaloneDriver;
import builder.flows.LoginFlow;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_1 {

    private String BASE_URL = "https://github.com/login";
    private String USER_NAME = "";
    private String PASSWORD = "";
    private String EXPECTE_TITLE = "GitHub";

    @Test
    public void loginPositive() throws Exception {
        ChromeStandaloneDriver chromeStandaloneDriver = new ChromeStandaloneDriver();
        chromeStandaloneDriver.start();
        chromeStandaloneDriver.getDriver().get(BASE_URL);
        LoginFlow.basicLoginFluentFlow(chromeStandaloneDriver, USER_NAME, PASSWORD);
        Assert.assertEquals(chromeStandaloneDriver.getDriver().getTitle(), EXPECTE_TITLE);
        chromeStandaloneDriver.getDriver().close();
    }

}

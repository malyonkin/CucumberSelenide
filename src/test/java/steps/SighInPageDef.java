package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SighInPage;

public class SighInPageDef {
    SighInPage sighInPage = new SighInPage(); //нужно обратиться к странице

    @Then("Input login")
    public void login() {
        sighInPage.login(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void Password() {
        sighInPage.password(UserConfig.USER_PASSWORD);
    }
}

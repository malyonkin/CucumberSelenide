package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class SighInPage {
    private SelenideElement loginInput = $(By.cssSelector(".paywall__auth__form__row:nth-child(1) .paywall__auth__form__input"));
    private SelenideElement passwordInput = $(By.cssSelector(".js-login-validate > .paywall__auth__form__row:nth-child(2) .paywall__auth__form__input"));

    public void login(String text){
        this.loginInput.val(text);
    }
    public void password(String text){
        this.passwordInput.val(text);
    }
}

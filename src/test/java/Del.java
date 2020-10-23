import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Del {
    @Test
    public void test() {
        open("https://auth.rbc.ru/login?tab=enter&from=login_topline");
        $(By.cssSelector(".paywall__auth__form__row:nth-child(1) .paywall__auth__form__input")).val("mosita3049@glenwoodave.com");
        $(By.cssSelector(".js-login-validate > .paywall__auth__form__row:nth-child(2) .paywall__auth__form__input")).val("Password!1");
        $(By.cssSelector(".paywall__auth__form__submit-wrap > .js-yandex-counter")).click();
        $(By.cssSelector(".paywall__profile__title")).shouldHave(Condition.text("Отключение баннеров"));
    }
}

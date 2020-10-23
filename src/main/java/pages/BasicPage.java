package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void clickButton(String text){
        $(By.cssSelector(".paywall__auth__form__"+ text +"-wrap > .js-yandex-counter")).click(); // "/.." - поднимаемся по ДОМ дереву HTML на шаг выше
    }

    public void logoutButtonVisible(String text){
        $(By.cssSelector(".paywall__"+ text +"__title")).shouldHave(Condition.text("Отключение баннеров"));
    }
}

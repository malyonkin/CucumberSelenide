package steps;


import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void openURL(){
        open("https://auth.rbc.ru/login?tab=enter&from=login_topline");
    }
}

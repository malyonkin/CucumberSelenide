import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//https://www.youtube.com/watch?v=Mjg-I3ZvuWU

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",features = "src/test/resources/features")

public class RunCucumberTest {
}

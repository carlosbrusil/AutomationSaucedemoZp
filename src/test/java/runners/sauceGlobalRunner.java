package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SauceGlobal.feature",
        glue = "stepdefinitions",
        tags = "@Scenario1sauceglobal",
        snippets = SnippetType.CAMELCASE
)
public class sauceGlobalRunner {

}
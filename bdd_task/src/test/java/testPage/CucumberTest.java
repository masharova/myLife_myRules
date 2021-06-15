package testPage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/Login.feature"}, stepNotifications = true, plugin = {"json:build/cucumber.json",
        "html:build/site/cucumber-pretty"},
        glue = {"steps"})
public class CucumberTest {
}

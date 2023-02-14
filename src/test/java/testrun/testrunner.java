package testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Opencart_com\\feature\\adactinlogin.feature",
					glue="adactinstepdef",
					dryRun=false,
					stepNotifications=true,
					tags="@wip")

public class testrunner {

}

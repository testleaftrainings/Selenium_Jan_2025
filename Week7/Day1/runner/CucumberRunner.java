package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;

@CucumberOptions(features={"src/test/java/features/Login.feature",
		"src/test/java/features/createlead.feature"},
glue="stepdefinition",
publish=true,
monochrome=true,tags="not @smoke" )
public class CucumberRunner extends BaseClass{

}

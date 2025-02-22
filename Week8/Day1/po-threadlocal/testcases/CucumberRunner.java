package testcases;

import org.testng.annotations.DataProvider;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/main/java/features"},
glue="pages",
publish=true,
monochrome=true,tags="not @smoke" )
public class CucumberRunner extends BaseClass{
	
	  @DataProvider(parallel=true) public Object[][] scenarios() { return
	  super.scenarios(); }
	 

}

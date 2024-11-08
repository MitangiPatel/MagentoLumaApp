package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = "C:\\Users\\MitangiPatel\\eclipse-workspace\\MagentoLumaAutomation\\src\\test\\java\\FeaturesFiles",
			glue = "StepDefinations",
			monochrome = true
			)
public class TestRunner extends AbstractTestNGCucumberTests{
	

}

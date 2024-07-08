package jobportalN;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner_One 
{
	@CucumberOptions(tags="",
			//C:\Old Data\Automation\Eclipse backup\cucimberTest\src\test\resources\cucumbertest.feature
			features= {"C:\\Old Data\\Automation\\Eclipse backup\\jobportal\\src\\test\\resources\\portal_one.feature"},
			glue= {"stepDef_portal"},
			plugin= {"pretty"}
					
					)


			public class RunnerLogin extends AbstractTestNGCucumberTests
			{


			}
}

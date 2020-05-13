package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = "classpath:features/",
        glue = {"stepDefinitions"},
//        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}) // Enable it for local execution
//        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:test-output/cucumber-reports/report.html"}) // Enable it for execution on image
          plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}) // Enable it for Jenkins execution

public class testRunner1 extends AbstractTestNGCucumberTests {

}
package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = "classpath:features/",
        glue = {"stepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}) // Enable it for Jenkins
//        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:test-output/cucumber-reports/report.html"})

public class testRunner1 extends AbstractTestNGCucumberTests {

}
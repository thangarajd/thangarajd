package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\java\\FeatureFiles", glue= {"Steps","Hooks"}, monochrome=true, 
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, dryRun=false) 


public class RunnerClass {

}

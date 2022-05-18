package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class )
@CucumberOptions(  
		       //features = {".//Feature/Login.feature",".//Feature/epc.feature"},
		       features = ".//Feature/Login.feature",
		       glue = "stepDefinitions",
		       dryRun = true,
		       monochrome = true,
		    		 //monochrome is usesd to remove the Unnecessary Characters in Console window 	
		       plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		      
		        )

public class TestRun {
	

}

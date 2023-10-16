package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/features"},
		glue="StepDef",
		plugin= {
				"pretty", 
				"html:reports/myreport.html", 
        		"json:reports/myreport.json",
				},
        //dryRun=true,
		tags="@sanity"
		)
public class TestRunnner {

	
}

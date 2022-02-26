package awsomecucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(plugin = {"pretty",
        "html:target/cucumber.html", "summary"},
         snippets = CAMELCASE,
       //  dryRun = true,
        //monochrome - console output from cucumber in a readable format
         monochrome = true,
       //  tags = "@cartFeature",
        glue = {"awsomecucumber/steps","awsomecucumber/hooks","awsomecucumber/types"},
        features= "src/test/resources/features"
)

public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void beforeClass(){
        System.out.println("\n In Before Class \n");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("\n In After Class \n");
    }
}
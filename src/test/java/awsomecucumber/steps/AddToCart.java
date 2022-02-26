package awsomecucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

    @Given("I'm on the Store page")
    public void iMOnTheStorePage() {
       System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://askomdch.com/store");
    }
    @When("I add a {string} to the cart")
    public void iAddAToTheCart(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see {int} {string} in the cart")
    public void iShouldSeeInTheCart(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

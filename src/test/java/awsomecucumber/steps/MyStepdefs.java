package awsomecucumber.steps;

import awsomecucumber.objects.Product;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {


    @Given("login with credentials")
    public void loginWithCredentials() {

    }

    @When("navigate the home page")
    public void navigate_the_home_page() {

    }
    @Then("verify home page")
    public void verify_home_page() {

    }

    @Given("my account balance is ${int}")
    public void myAccountBalanceIs$(int arg0) {
        
    }

    @When("I withdraw ${int}")
    public void iWithdraw$(int arg0) {
    }

    @Then("the account balance should be ${int}")
    public void theAccountBalanceShouldBe$(int arg0) {
    }
    

    @When("Add {int} {product} product(s)/store(s) to cart product")
    public void addProductToCart(int arg0, Product product) {
        System.out.println("Product Name " + arg0 + " " + product.getName());
    }

    @When("Add {int} {product} to cart")
    public void addToCart(int arg0, Product product) {
        System.out.println("Product Name " + arg0 + " " + product.getName());
    }
}

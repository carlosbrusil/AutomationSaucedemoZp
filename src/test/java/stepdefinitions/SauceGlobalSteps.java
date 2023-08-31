package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;

import java.util.List;

public class SauceGlobalSteps {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
private HomePage homePage= new HomePage();

    @Given("^that a customer accesses the shopping website$")
    public void thatACustomerAccessesTheShoppingWebsite() {
    actor.can(BrowseTheWeb.with(navegador));
    actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^you add products to the cart$")
    public void youAddProductsToTheCart() {

    }

    @Then("^he sees the products listed in the shopping cart$")
    public void heSeesTheProductsListedInTheShoppingCart() {

    }

    @When("^he adds products to the cart$")
    public void heAddsProductsToTheCart(List<String> data) {

    }


}

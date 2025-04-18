package com.demoblaze.stepdefinitions;

import com.demoblaze.exceptions.MessageException;
import com.demoblaze.models.Credentials;
import com.demoblaze.questions.ThankBuy;
import com.demoblaze.tasks.CartTask;
import com.demoblaze.tasks.LoginTask;
import com.demoblaze.tasks.ShopTask;
import com.demoblaze.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class BuyStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^el usuario ha iniciado sesion correctamente$")
    public void elUsuarioHaIniciadoSesionCorrectamente(List<Credentials> credentialsList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.BASE_URL));
        Credentials credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.enterCredentials(credentials));
    }

    @When("^agrega los productos al carrito$")
    public void agregaLosProductosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(ShopTask.shopItems());
    }

    @When("^procede a pagar el producto$")
    public void procedeAPagarElProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(CartTask.cart());
    }

    @Then("^el sistema muestra el mensaje Thank you for your purcharse$")
    public void elSistemaMuestraElMensajeThankYouForYourPurcharse() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ThankBuy.thank()
                        , Matchers.containsString(Constants.PURCHASE_MESAGE))
                .orComplainWith(MessageException.class,Constants.MESSAGE_EXCEPTION2));
    }
}
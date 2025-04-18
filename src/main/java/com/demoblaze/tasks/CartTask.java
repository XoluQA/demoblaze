package com.demoblaze.tasks;

import com.demoblaze.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.CLIC_CART),
                Click.on(CartPage.CLIC_PLACEORDER),
                Enter.theValue("Luis").into(CartPage.TEXT_NAME),
                Enter.theValue("Colombia").into(CartPage.TEXT_COUNTRY),
                Enter.theValue("Medellin").into(CartPage.TEXT_CITY),
                Enter.theValue("4111111111111111").into(CartPage.TEXT_CARD),
                Enter.theValue("11").into(CartPage.TEXT_MONTH),
                Enter.theValue("28").into(CartPage.TEXT_YEAR),
                Click.on(CartPage.BTM_PURCHARSE)
                //Click.on(CartPage.BTM_OK)
        );
            }
    public static CartTask cart(){
    return Tasks.instrumented(CartTask.class);
    }
}

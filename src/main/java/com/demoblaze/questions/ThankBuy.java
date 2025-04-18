package com.demoblaze.questions;

import com.demoblaze.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ThankBuy implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(CartPage.THANKS).viewedBy(actor).asString();
    }

    public static ThankBuy thank(){
        return new ThankBuy();
    }
}

package com.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target CLIC_CART = Target.the("Cart")
            .locatedBy("//a[@id='cartur']");
    public static final Target CLIC_PLACEORDER = Target.the("Place Order")
            .locatedBy(".btn.btn-success");
    public static final Target TEXT_NAME = Target.the("Name")
            .locatedBy("#name");
    public static final Target TEXT_COUNTRY = Target.the("Country")
            .locatedBy("#country");
    public static final Target TEXT_CITY = Target.the("City")
            .locatedBy("#city");
    public static final Target TEXT_CARD = Target.the("Card")
            .locatedBy("#card");
    public static final Target TEXT_MONTH = Target.the("Month")
            .locatedBy("#month");
    public static final Target TEXT_YEAR = Target.the("Year")
            .locatedBy("#year");
    public static final Target BTM_PURCHARSE = Target.the("Purcharse")
            .locatedBy("//button[normalize-space()='Purchase']");
    //public static final Target BTM_OK = Target.the("OK")
    //        .locatedBy("//button[normalize-space()='OK']");
    public static final Target THANKS = Target.the("Thanks")
            .locatedBy("//h2[normalize-space()='Thank you for your purchase!']");

}

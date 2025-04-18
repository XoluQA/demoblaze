package com.demoblaze.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert implements Performable {

    private final int timeoutInSeconds;

    public WaitForAlert(int timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    @Step("{0} waits for a browser alert to appear")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), timeoutInSeconds);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static WaitForAlert appears() {
        return new WaitForAlert(10); // Puedes ajustar el tiempo
    }

    public static WaitForAlert appearsWithin(int seconds) {
        return new WaitForAlert(seconds);
    }
}
package com.demoblaze.tasks;


import com.demoblaze.userinterfaces.ShopPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ShopTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShopPage.CLIC_CAT_PHONES),
                WaitUntil.the(ShopPage.CLIC_IPHONE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ShopPage.CLIC_IPHONE),
                Click.on(ShopPage.CLIC_ADDTOCART)
        );
        actor.attemptsTo(new DriverTask(driver -> {
            new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            alert.accept();
        }));
        actor.attemptsTo(
                Click.on(ShopPage.CLIC_HOME),
                Click.on(ShopPage.CLIC_CAT_LAPTOPS),
                Click.on(ShopPage.CLIC_MACBOOK),
                Click.on(ShopPage.CLIC_ADDTOCART)
        );
        actor.attemptsTo(new DriverTask(driver -> {
            new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            alert.accept();
        }));
        actor.attemptsTo(
                Click.on(ShopPage.CLIC_HOME),
                Click.on(ShopPage.CLIC_CAT_MONITORS),
                Click.on(ShopPage.CLIC_MONITOR),
                Click.on(ShopPage.CLIC_ADDTOCART)
        );
        actor.attemptsTo(new DriverTask(driver -> {
            new WebDriverWait(driver, 5)
                    .until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            alert.accept();
        }));
       }

    public static ShopTask shopItems(){
        return Tasks.instrumented(ShopTask.class);
    }
}

package com.demoblaze.tasks;

import com.demoblaze.models.Credentials;
import com.demoblaze.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {
    Credentials credentials;

    public LoginTask(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginPage.CLICLOGIN),
                Enter.theValue(credentials.getUser()).into(LoginPage.TXT_USERNAME),
                Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTNLOGIN)

        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static LoginTask enterCredentials(Credentials credentials){
        return Tasks.instrumented(LoginTask.class, credentials);
    }
}
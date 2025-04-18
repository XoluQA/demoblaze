package com.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target CLICLOGIN = Target.the("Clic en Login")
            .locatedBy("//a[@id='login2']");
    public static final Target TXT_USERNAME = Target.the("Ingresar Usuario")
            .locatedBy("//input[@id='loginusername']");
    public static final Target TXT_PASSWORD = Target.the("Ingresar Contraseña")
            .locatedBy("//input[@id='loginpassword']");
    public static final Target BTNLOGIN = Target.the("Clic en Login")
            .locatedBy("//button[text()='Log in']");
    public static final Target COMPARE = Target.the("Comparar")
            .locatedBy("//a[contains(text(), 'jbarrios')]");
}
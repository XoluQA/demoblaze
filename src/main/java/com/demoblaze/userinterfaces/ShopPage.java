package com.demoblaze.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShopPage {

    public static final Target CLIC_HOME  = Target.the("Home")
            .locatedBy("//li[@class='nav-item active']//a[@class='nav-link']");
    public static final Target CLIC_CAT_PHONES = Target.the("Categoria Phones")
            .locatedBy("//a[normalize-space()='Phones']");
    public static final Target CLIC_CAT_LAPTOPS = Target.the("Categoria Laptops")
            .locatedBy("//a[normalize-space()='Laptops']");
    public static final Target CLIC_CAT_MONITORS = Target.the("Categoria Monitors")
            .locatedBy("(//a[normalize-space()='Monitors'])");
    public static final Target CLIC_IPHONE = Target.the("Iphone 6 32gb")
            .locatedBy("//a[normalize-space()='Iphone 6 32gb']");
    public static final Target CLIC_MACBOOK = Target.the("MacBook Pro")
            .locatedBy("//a[normalize-space()='MacBook Pro']");
    public static final Target CLIC_MONITOR = Target.the("Apple monitor 24")
            .locatedBy("//a[normalize-space()='Apple monitor 24']");
    public static final Target CLIC_ADDTOCART = Target.the("Apple monitor 24")
            .locatedBy("//a[normalize-space()='Add to cart']");
}

package com.demoblaze.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        snippets = SnippetType.CAMELCASE,
        glue = "com.demoblaze.stepdefinitions",
        tags = "@compra"
)

public class LoginRunner {
}

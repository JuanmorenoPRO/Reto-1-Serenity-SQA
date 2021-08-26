package com.guru99.gurubank.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com.guru99.gurubank.pruebas.features\\gurubank.feature",
        glue = "com.guru99.gurubank.pruebas.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Guru99BankRunner {
}

package org.example;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@regression3 or @regression2 or @regression1 or @regression", plugin =  { "pretty", "html:target/cucumber/report.html" } )

public class RunCuke {

}

package gobaltek.ny.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "./Features/" }, glue = "gobaltek.ny.stepdefintion")

public class MyRunner extends AbstractTestNGCucumberTests {

}

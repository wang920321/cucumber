/**
 * 
 */
package com.cucumber.bdd;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Administrator
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/features" },glue={"stepDefinition"})
public class AppTest {

}

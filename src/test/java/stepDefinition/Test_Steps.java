/**
 * 
 */
package stepDefinition;

import org.hamcrest.core.Is;

import com.cucunmer.first.Belly;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * @author Administrator
 *
 */
public class Test_Steps {
	private Belly belly;

	private int waitingTime;

	 

	@Given("^I have (\\d+) cukes in my belly$")

	public void i_have_cukes_in_my_belly(int cukes) throws Throwable {

	belly = new Belly();

	belly.eat(cukes);

	}

	 

	 

	@When("^I wait (\\d+) hour$")

	public void i_wait_hour(int arg1) throws Throwable {

	this.waitingTime =arg1;

	}

	 

	@Then("^my belly should (.*)$")

	public void my_belly_should_growl(String expectedSound) throws Throwable {

	String actualSound = belly.getSound(waitingTime);

	Assert.assertThat(actualSound, Is.is(expectedSound));

	}
}

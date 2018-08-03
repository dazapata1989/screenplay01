package co.com.proyectobase.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.tasks.OpenWeb;
import co.com.proyectobase.screenplay.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class DemoStepDefinitions {
	
	@Managed(driver="Chrome")
	private WebDriver hisBrowser;
	private Actor user = Actor.named("user");
	
	@Before
	public void InitialConfiguration() {
		user.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^that Carlos wants to access the Web Automation Demo Site$")
	public void thatCarlosWantsToAccessTheWebAutomationDemoSite() {
		user.wasAbleTo(OpenWeb.TheWebAutomationDemoSite());
	}

	@When("^he performs the registration on the page$")
	public void hePerformsTheRegistrationOnThePage() {
		user.attemptsTo(Register.FormDemo());
	}

	@Then("^he verifies that the screen is loaded with text Double Click on Edit Icon to EDIT the Table Row$")
	public void heVerifiesThatTheScreenIsLoadedWithTextDoubleClickOnEditIconToEDITTheTableRow() {
	}

}

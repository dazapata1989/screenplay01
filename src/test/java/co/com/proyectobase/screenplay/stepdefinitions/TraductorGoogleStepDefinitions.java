package co.com.proyectobase.screenplay.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Traducir;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class TraductorGoogleStepDefinitions {
	
	@Managed(driver="Chrome")
	private WebDriver hisBrowser;
	private Actor usuario = Actor.named("usuario");
	
	@Before
	public void configuracionInicial() {
		usuario.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^El usuario quiere usar el traductor de google$")
	public void elUsuarioQuiereUsarElTraductorDeGoogle() throws Exception {
		usuario.wasAbleTo(Abrir.LaPaginaDeGoogle());
		
	  
	}

	@When("^traduce la palabra (.*) de ingles a espanol$")
	public void traduceLaPalabraTableDeInglesAEspanol(String palabra) throws Exception {
		usuario.attemptsTo(Traducir.DeInglesAEspanolLa(palabra));
		
	  
	}

	@Then("^Se debe mostrar la palabra (.*) en la pantalla$")
	public void seDebeMostrarLaPalabraMesaEnLaPantalla(String palabraEsperada) throws Exception {
	   usuario.should(seeThat(LaRespuesta.es(), equalTo(palabraEsperada)));
	}
	
}

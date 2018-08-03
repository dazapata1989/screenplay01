package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")

public class GoogleHomePage extends PageObject {
	
	public static final Target BOTON_APLICACIONES= Target.the("El boton que muestra las aplicaciones").located(By.id("gbwa"));
	public static final Target BOTON_GOOGLETRANSLATE= Target.the("Boton de app traductor").located(By.id("gb51"));
	
}
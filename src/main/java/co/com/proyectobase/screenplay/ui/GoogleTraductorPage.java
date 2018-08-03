package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

	@DefaultUrl("http://www.google.com")

	public class GoogleTraductorPage extends PageObject {

		public static final Target BOTON_LENGUAJE_ORIGEN= Target.the("Lista desplegable de idioma origen").located(By.id("gt-sl-gms"));
		public static final Target OPCION_INGLES= Target.the("Boton de idioma origen ingles").located(By.xpath("//div[@class='goog-menuitem-content' and contains(text(), 'nglés')]"));
		public static final Target BOTON_LENGUAJE_DESTINO= Target.the("Lista desplegable de idioma destino").located(By.id("gt-tl-gms"));
		public static final Target OPCION_ESPANOL= Target.the("Boton de idioma destino español").located(By.xpath("//div[@id= 'gt-tl-gms-menu']//div[@class='goog-menuitem-content' and contains(text(), 'spañol')]"));
		public static final Target AREA_DE_TRADUCCION= Target.the("campo de texto origen").located(By.id("source"));
		public static final Target AREA_TRADUCIDA= Target.the("campo de texto destino").located(By.id("gt-res-dir-ctr"));
		public static final Target BOTON_TRADUCIR= Target.the("campo de texto origen").located(By.id("gt-lang-submit"));
			
}

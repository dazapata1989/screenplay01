package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.DemoRegisterPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenWeb implements Task{

	private DemoRegisterPage demoRegisterPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Open.browserOn(demoRegisterPage));
		
	}

	public static OpenWeb TheWebAutomationDemoSite() {
		return Tasks.instrumented(OpenWeb.class);
	}
	
	
	

}

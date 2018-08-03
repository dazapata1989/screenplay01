package co.com.proyectobase.screenplay.tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;

import co.com.proyectobase.screenplay.ui.DemoRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task{
	
	@Override
	public <T extends Actor> void performAs(T actor) {
			actor.attemptsTo(Enter.theValue("Daniela").into(DemoRegisterPage.TXT_FIRST_NAME));
			actor.attemptsTo(Enter.theValue("Zapata").into(DemoRegisterPage.TXT_LAST_NAME));
			actor.attemptsTo(Enter.theValue("Calle 52 N 45-25").into(DemoRegisterPage.TXT_ADDRESS));
			actor.attemptsTo(Enter.theValue("darroyave@choucairtesting.com").into(DemoRegisterPage.TXT_EMAIL_ADDRESS));
			actor.attemptsTo(Enter.theValue("4480510").into(DemoRegisterPage.TXT_PHONE));
			actor.attemptsTo(Enter.theValue("Daniela").into(DemoRegisterPage.TXT_FIRST_NAME));
			actor.attemptsTo(Click.on(DemoRegisterPage.RB_GENDER));
			actor.attemptsTo(Click.on(DemoRegisterPage.CB_HOBBIES));
			actor.attemptsTo(Click.on(DemoRegisterPage.LIST_LANGUAGES));
			actor.attemptsTo(Click.on(DemoRegisterPage.LIST_SKILLS));
			actor.attemptsTo(Click.on(DemoRegisterPage.LIST_COUNTRIES));
			actor.attemptsTo(Click.on(DemoRegisterPage.SELECT_COUNTRIES));
			actor.attemptsTo(SelectFromOptions.byVisibleText("1989").from(DemoRegisterPage.TXT_YEAR));
			actor.attemptsTo(SelectFromOptions.byVisibleText("February").from(DemoRegisterPage.TXT_MONTH));
			actor.attemptsTo(SelectFromOptions.byVisibleText("11").from(DemoRegisterPage.TXT_DAY));
			actor.attemptsTo(Enter.theValue("password").into(DemoRegisterPage.TXT_PASSWORD));
			actor.attemptsTo(Enter.theValue("password").into(DemoRegisterPage.TXT_CONFIRM_PASSWORD));
					
	}

	public static Register FormDemo() {
		return Tasks.instrumented(Register.class);
	}

}

package co.com.proyectobase.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")

public class DemoRegisterPage extends PageObject {
	
	public static final Target TXT_FIRST_NAME= Target.the("text field first name").located(By.xpath("//INPUT[contains(@placeholder, 'First Name')]"));
	public static final Target TXT_LAST_NAME= Target.the("text field last name").located(By.xpath("//INPUT[contains(@placeholder, \'Last Name\')]"));
	public static final Target TXT_ADDRESS= Target.the("text field address").located(By.xpath("//TEXTAREA[contains(@ng-model, \'Adress\')]"));
	public static final Target TXT_EMAIL_ADDRESS= Target.the("text field email address").located(By.xpath("//INPUT[contains(@type, \'email\')]"));
	public static final Target TXT_PHONE= Target.the("text field phone").located(By.xpath("//INPUT[contains(@type, \'tel\')]"));
	public static final Target RB_GENDER= Target.the("radio button gender").located(By.xpath("//INPUT[contains(@value, \'Male\')]"));
	public static final Target CB_HOBBIES= Target.the("check box hobbies").located(By.xpath("//INPUT[contains(@value, \'Cricket\')]"));
	public static final Target LIST_LANGUAGES= Target.the("list languages").located(By.id("msdd"));
	public static final Target LIST_SKILLS= Target.the("list skills").located(By.id("Skills"));
	public static final Target LIST_COUNTRIES= Target.the("list countries").located(By.id("countries"));
	public static final Target SELECT_COUNTRIES= Target.the("list countries").located(By.xpath("//SPAN[contains(@aria-labelledby, \'select2-country-container\')]"));
	public static final Target TXT_YEAR= Target.the("list year").located(By.id("yearbox"));
	public static final Target TXT_MONTH= Target.the("list month").located(By.xpath("//SELECT[contains(@placeholder, \'Month\')]"));
	public static final Target TXT_DAY= Target.the("list day").located(By.id("daybox"));
	public static final Target TXT_PASSWORD= Target.the("text password").located(By.id("firstpassword"));
	public static final Target TXT_CONFIRM_PASSWORD= Target.the("Text confirm password").located(By.id("secondpassword"));
	
	
	
	
}

package co.com.sofka.ecommerce.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AuthenticationPage extends PageObject {
    public static final Target EMAIL_CREATE_FIELD = Target.the("EmailField").located(By.id("email_create"));
    public static final Target CREATE_ACCOUNT_BTN = Target.the("CreateAccountBtn").located(By.id("SubmitCreate"));
}

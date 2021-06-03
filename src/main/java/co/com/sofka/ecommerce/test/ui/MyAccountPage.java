package co.com.sofka.ecommerce.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MyAccountPage extends PageObject {
    public static final Target WELCOME_MESSAGE = Target.the("WelcomeMessage").located(By.className("info-account"));
}

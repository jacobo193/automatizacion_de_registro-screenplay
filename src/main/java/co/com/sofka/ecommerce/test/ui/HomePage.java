package co.com.sofka.ecommerce.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class HomePage extends PageObject {
    public static final Target SIGN_IN_BTN = Target.the("SignInBtn").located(By.className("login"));
}

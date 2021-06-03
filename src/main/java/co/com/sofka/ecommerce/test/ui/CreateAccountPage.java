package co.com.sofka.ecommerce.test.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateAccountPage extends PageObject {
    public static final Target RADIO_MR_BTN = Target.the("RadioMrBtn").located(By.id("uniform-id_gender1"));
    public static final Target FIRST_NAME_FIELD = Target.the("FirstNameField").located(By.id("customer_firstname"));
    public static final Target LAST_NAME_FIELD = Target.the("LastNameField").located(By.id("customer_lastname"));
    public static final Target PASSWORD_FIELD = Target.the("PasswordField").located(By.id("passwd"));
    public static final Target ADDRESS_1_FIELD = Target.the("Address1Field").located(By.id("address1"));
    public static final Target ADDRESS_2_FIELD = Target.the("Address2Field").located(By.id("address2"));
    public static final Target CITY_FIELD = Target.the("CityField").located(By.id("city"));
    public static final Target STATE_DROPDOWN = Target.the("StateDropdown").located(By.id("id_state"));
    public static final Target POSTAL_CODE_FIELD = Target.the("PostalCodeField").located(By.id("postcode"));
    public static final Target COUNTRY_DROPDOWN = Target.the("CountryDropdown").located(By.id("id_country"));
    public static final Target INFORMATION_FIELD = Target.the("InformationField").located(By.id("other"));
    public static final Target HOME_PHONE_FIELD = Target.the("HomePhoneField").located(By.id("phone"));
    public static final Target MOBILE_PHONE_FIELD = Target.the("MobilePhoneField").located(By.id("phone_mobile"));
    public static final Target ALIAS_FIELD = Target.the("AliasField").located(By.id("alias"));
    public static final Target REGISTER_BTN = Target.the("RegisterBtn").located(By.id("submitAccount"));

}

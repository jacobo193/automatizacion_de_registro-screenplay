package co.com.sofka.ecommerce.test.questions;

import co.com.sofka.ecommerce.test.ui.MyAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CompletedSignUp implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return MyAccountPage.WELCOME_MESSAGE.resolveFor(actor).getText();
    }

    public static CompletedSignUp ok(){
        return new CompletedSignUp();
    }
}

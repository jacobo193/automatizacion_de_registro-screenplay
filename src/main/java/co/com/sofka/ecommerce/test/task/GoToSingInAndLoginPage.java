package co.com.sofka.ecommerce.test.task;

import co.com.sofka.ecommerce.test.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToSingInAndLoginPage implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.SIGN_IN_BTN));
    }

    public static GoToSingInAndLoginPage go(){
        return Tasks.instrumented(GoToSingInAndLoginPage.class);
    }
}

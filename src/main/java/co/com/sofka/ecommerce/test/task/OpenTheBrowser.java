package co.com.sofka.ecommerce.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class OpenTheBrowser implements Task {

    private PageObject pageObject;

    public OpenTheBrowser(PageObject pageObject){
        this.pageObject = pageObject;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageObject));
    }

    public static OpenTheBrowser on(PageObject pageObject){
        return Tasks.instrumented(OpenTheBrowser.class, pageObject);
    }
}

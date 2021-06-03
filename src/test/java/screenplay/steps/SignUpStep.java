package screenplay.steps;

import co.com.sofka.ecommerce.test.questions.CompletedSignUp;
import co.com.sofka.ecommerce.test.task.SetEmail;
import co.com.sofka.ecommerce.test.task.CreateAccount;
import co.com.sofka.ecommerce.test.task.GoToSingInAndLoginPage;
import co.com.sofka.ecommerce.test.task.OpenTheBrowser;
import co.com.sofka.ecommerce.test.ui.HomePage;
import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class SignUpStep {

    private Actor actor;
    private HomePage homePage;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        actor = OnStage.theActorCalled("Cliente");
    }


    @Given("que un cliente quiere registrarse")
    public void queUnClienteQuiereRegistrarse() {
        actor.wasAbleTo(OpenTheBrowser.on(homePage));
    }

    @When("llena el formulario y se registra exitosamente")
    public void llenaElFormularioYSeRegistraExitosamente() {
        Faker faker = new Faker();

        actor.attemptsTo(GoToSingInAndLoginPage.go());
        actor.attemptsTo(SetEmail.execute(faker.internet().emailAddress()));
        actor.attemptsTo(
                CreateAccount.with(faker.name().firstName(), faker.name().lastName(),
                        "Contraseña1.11",
                        faker.address().fullAddress(),
                        faker.address().secondaryAddress(), faker.address().city(), faker.address().state(),
                        faker.number().digits(5), "United States", faker.pokemon().name(),
                        faker.number().digits(10), faker.number().digits(7), faker.address().cityName())
        );

    }

    @Then("su cuenta se creara y podra visualizar un mensaje de bienvenida")
    public void suCuentaSeCrearaYPodraVisualizarUnMensajeDeBienvenida() {
        actor.should(
                seeThat(
                        CompletedSignUp.ok(),
                        is(Matchers.equalTo("Welcome to your account. Here you can manage all of your personal information and orders."))
                )
        );
    }
}

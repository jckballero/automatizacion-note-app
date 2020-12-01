package node.app.calidad.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import node.app.calidad.model.UserData;
import node.app.calidad.questions.ValidateRegister;
import node.app.calidad.tasks.RegisterUp;
import node.app.calidad.tasks.OpenBrowser;
import node.app.calidad.tasks.RegisterForm;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class NodeAppStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver MyBrowser;
    private Actor Jean = Actor.named("Jean");

    @Before
    public void setStage() {
        Jean.can(BrowseTheWeb.with(MyBrowser));
    }

    @Given("^that Jean needs to create an user$")
    public void thatJeanNeedsToCreateAnUser() {
        Jean.wasAbleTo(OpenBrowser.pageUp(),(RegisterUp.theCredentials()));
    }

    @When("^he enters the registry in the application$")
    public void heEntersTheRegistryInTheApplication(List<UserData> Information) {
        Jean.attemptsTo(RegisterForm.theData(Information));
    }

    @Then("^he displays message text \"([^\"]*)\"$")
    public void heDisplaysMessageText(String question1) {
        Jean.should(seeThat(ValidateRegister.thisIs(question1)));
    }
}
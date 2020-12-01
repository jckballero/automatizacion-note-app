package node.app.calidad.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import node.app.calidad.model.UserData;
import node.app.calidad.questions.ValidateLogin;
import node.app.calidad.tasks.*;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver MyBrowser;
    private Actor Jean = Actor.named("Jean");

    @Before
    public void setStage() {
        Jean.can(BrowseTheWeb.with(MyBrowser));
    }

    @Given("^that jean needs to be logged$")
    public void thatJeanNeedsToBeLogged() {
        Jean.wasAbleTo(OpenBrowser.pageUp(),(LoginUp.theCredentials()));
    }

    @When("^he enters his username and password$")
    public void heEntersHisUsernameAndPassword(List<UserData> Information) {
        Jean.attemptsTo(LoginForm.theData(Information));
    }

    @Then("^he displays text \"([^\"]*)\"$")
    public void heDisplaysText(String question2){
        Jean.should(seeThat(ValidateLogin.thisMetodo(question2)));
    }

}

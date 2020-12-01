package node.app.calidad.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import node.app.calidad.model.UserData;
import node.app.calidad.questions.CreateNoteValidate;
import node.app.calidad.questions.NoteCreateSucces;
import node.app.calidad.questions.ValidateRegister;
import node.app.calidad.tasks.*;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreateNotesStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver MyBrowser;
    private Actor Jean = Actor.named("Jean");

    @Before
    public void setStage() {
        Jean.can(BrowseTheWeb.with(MyBrowser));
    }

    @Given("^that Jean starts session in Note App$")
    public void that_Jean_starts_session_in_Note_App(List<UserData> Information) {
        Jean.wasAbleTo(OpenBrowser.pageUp(),(LoginUp.theCredentials()),(LoginForm.theData(Information)));
    }

    @Then("^Displays the \"([^\"]*)\" navigation menu$")
    public void displays_the_navigation_menu(String question3) {
        Jean.should(seeThat(CreateNoteValidate.thisIsMethod(question3)));
    }

    @Given("^that Jean needs to create a note$")
    public void that_Jean_needs_to_create_a_note() {
        Jean.wasAbleTo(NavBarMenu.enterTo());
    }

    @When("^he enters the data$")
    public void he_enters_the_data(List<UserData> Information) {
        Jean.attemptsTo(NoteTask.fieldNote(Information));
    }

    @Then("^he displays message new note$")
    public void heDisplaysMessageNewNote(String question4)  {
        Jean.should(seeThat(NoteCreateSucces.methodForValidate(question4)));
    }
}

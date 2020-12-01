package node.app.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import node.app.calidad.model.UserData;
import node.app.calidad.userinterface.NavBarMenuPage;

import java.util.List;

public class NoteTask implements Task {

    private List<UserData> Information;

    public NoteTask(List<UserData> information) {
        Information = information;
    }


    public static NoteTask fieldNote(List<UserData> Information) {
        return Tasks.instrumented(NoteTask.class, Information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(Information.get(0).getTitle()).into(NavBarMenuPage.TITLE),
                Enter.theValue(Information.get(0).getDescriptionNote()).into(NavBarMenuPage.DESCRIPTION),
                Click.on(NavBarMenuPage.ADD_BUTTON)
        );
    }
}
package node.app.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import node.app.calidad.userinterface.NavBarMenuPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavBarMenu implements Task {

    public static NavBarMenu enterTo() {
        return Tasks.instrumented(NavBarMenu.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NavBarMenuPage.NAV_BUTTON),
                //WaitUntil.the(NavBarMenuPage.NAV_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(NavBarMenuPage.ADD_NOTE_BUTTON));
    }
}
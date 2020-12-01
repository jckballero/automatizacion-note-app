package node.app.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static node.app.calidad.userinterface.NodeAppPage.REGISTER_BUTTON;


public class RegisterUp implements Task {
    public static RegisterUp theCredentials() {
        return Tasks.instrumented(RegisterUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(REGISTER_BUTTON));
    }
}

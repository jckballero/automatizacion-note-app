package node.app.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static node.app.calidad.userinterface.NodeAppPage.LOGIN_BUTTON;


public class LoginUp implements Task {
    public static LoginUp theCredentials() {
        return Tasks.instrumented(LoginUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }
}

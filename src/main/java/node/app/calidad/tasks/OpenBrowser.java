package node.app.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import node.app.calidad.userinterface.NodeAppPage;

public class OpenBrowser implements Task {
    private NodeAppPage nodeAppPage;
    public static OpenBrowser pageUp() {
        return Tasks.instrumented(OpenBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(nodeAppPage));
    }
}

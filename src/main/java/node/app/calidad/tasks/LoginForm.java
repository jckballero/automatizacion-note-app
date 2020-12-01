package node.app.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import node.app.calidad.model.UserData;
import node.app.calidad.userinterface.LoginPage;

import java.util.List;

public class LoginForm implements Task {
    private List<UserData> Information;

    public LoginForm(List<UserData> Information) {
        this.Information = Information;
    }

    public static LoginForm theData(List<UserData> Information) {
        return Tasks.instrumented(LoginForm.class, Information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(Information.get(0).getEmail()).into(LoginPage.EMAIL),
            Enter.theValue(Information.get(0).getPassword()).into(LoginPage.PASSWORD),
            Click.on(LoginPage.BTN_LOGIN)
        );

    }
}

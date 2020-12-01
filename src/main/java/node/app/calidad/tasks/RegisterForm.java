package node.app.calidad.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import node.app.calidad.model.UserData;
import node.app.calidad.userinterface.RegisterFormPage;

import java.util.List;

public class RegisterForm implements Task {

    private List<UserData> Information;

    public RegisterForm(List<UserData> Information) {
        this.Information = Information;
    }

    public static RegisterForm theData(List<UserData> Information) {
        return Tasks.instrumented(RegisterForm.class, Information);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(Information.get(0).getName()).into(RegisterFormPage.NAME),
                Enter.theValue(Information.get(0).getEmail()).into(RegisterFormPage.EMAIL),
                Enter.theValue(Information.get(0).getPassword()).into(RegisterFormPage.PASSWORD),
                Enter.theValue(Information.get(0).getConfirmPassword()).into(RegisterFormPage.CONFIRM_PASSWORD),
                Click.on(RegisterFormPage.BTN_REGISTER)
        );
    }
}

package node.app.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import node.app.calidad.userinterface.LoginPage;

public class ValidateLogin implements Question<Boolean> {

    private String question2;

    public ValidateLogin(String question2) {
        this.question2 = question2;
    }

    public static ValidateLogin thisMetodo(String question2) {
        return new ValidateLogin(question2);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String displayInterface = Text.of(LoginPage.LABEL_USER).viewedBy(actor).asString();
        if(question2.equals(displayInterface)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}

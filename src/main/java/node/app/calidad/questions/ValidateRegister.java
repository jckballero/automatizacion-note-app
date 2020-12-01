package node.app.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import node.app.calidad.userinterface.RegisterFormPage;

public class ValidateRegister implements Question<Boolean> {

    private String question1;

    public ValidateRegister(String question1) {
        this.question1 = question1;
    }

    public static ValidateRegister thisIs(String question1) {
        return new ValidateRegister(question1);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textDisplay = Text.of(RegisterFormPage.LABEL).viewedBy(actor).asString();
        if(question1.equals(textDisplay)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
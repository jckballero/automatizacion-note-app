package node.app.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import node.app.calidad.userinterface.LoginPage;

public class NoteCreateSucces implements Question<Boolean> {
    public NoteCreateSucces(String question4) {
        this.question4 = question4;
    }

    private String question4;

    public static NoteCreateSucces methodForValidate(String question4) {
        return new NoteCreateSucces(question4);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String showMessage = Text.of(LoginPage.LABEL_USER).viewedBy(actor).asString();

        if(question4.equals(showMessage)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

}

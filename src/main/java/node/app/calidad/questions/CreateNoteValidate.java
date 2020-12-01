package node.app.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import node.app.calidad.userinterface.NavBarMenuPage;

public class CreateNoteValidate implements Question<Boolean> {

    private String question3;

    public CreateNoteValidate(String question3) {
        this.question3 = question3;
    }

    public static CreateNoteValidate thisIsMethod(String question3) {
        return new CreateNoteValidate(question3);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String showButton = Text.of(NavBarMenuPage.NAV_BUTTON).viewedBy(actor).asString();

        if(question3.equals(showButton)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

}

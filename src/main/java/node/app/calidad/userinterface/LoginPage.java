package node.app.calidad.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target EMAIL= Target.the("field for the first name")
            .located(By.name("email"));
    public static final Target PASSWORD = Target.the("field for the middle name")
            .located(By.name("password"));
    public static final Target BTN_LOGIN = Target.the("field for the last name")
            .located(By.xpath("/html/body/main/div/div/div/div[2]/form/button"));
    public static final Target LABEL_USER = Target.the("Login message")
            .located(By.xpath("//a[contains(text(), 'Notes App')]"));
}
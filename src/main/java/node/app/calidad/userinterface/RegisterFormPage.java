package node.app.calidad.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterFormPage extends PageObject {
    public static final Target NAME = Target.the("click on add employee button")
            .located(By.name("name"));
    public static final Target EMAIL= Target.the("field for the first name")
            .located(By.name("email"));
    public static final Target PASSWORD = Target.the("field for the middle name")
            .located(By.name("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("field for the last name")
            .located(By.name("confirm_password"));
    public static final Target BTN_REGISTER = Target.the("field for the last name")
            .located(By.xpath("/html/body/main/div/div/div/div[2]/form/button"));
    public static final Target LABEL = Target.the("Register message")
            .located(By.xpath("//div[contains(text(),'Account Login')]"));
}
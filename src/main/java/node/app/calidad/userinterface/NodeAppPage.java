package node.app.calidad.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("http://localhost:4000")
@DefaultUrl("https://note-app-crud.herokuapp.com/")
public class NodeAppPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("click on register button")
            .located(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[2]/a"));
    public static final Target LOGIN_BUTTON = Target.the("click on login button")
            .located(By.xpath("//*[@class='nav-item']//a[contains(text(),'Login')]"));
}

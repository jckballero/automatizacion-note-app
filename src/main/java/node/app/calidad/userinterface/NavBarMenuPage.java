package node.app.calidad.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavBarMenuPage extends PageObject {
    public static final Target NAV_BUTTON = Target.the("click on nav button")
            .located(By.xpath("//ul[@class='navbar-nav ml-auto']//li[@class='nav-item dropdown']//*[@id='navbarDropdown']"));
    public static final Target ADD_NOTE_BUTTON = Target.the("click on add note")
            .located(By.xpath("//*[@id='navbarNav']/ul[2]/li/div/a[2]"));
    public static final Target TITLE = Target.the("title of your note")
            .located(By.name("title"));
    public static final Target DESCRIPTION = Target.the("describe your note")
            .located(By.name("description"));
    public static final Target ADD_BUTTON = Target.the("click on add button")
            .located(By.xpath("//button[@class='button btn btn-primary btn-block']"));
    public static final Target ADD_NOTE_SUCCESS = Target.the("SHOW MESSAGE")
            .located(By.xpath("//div[@class='container']//a[contains(text(),'Notes App')]"));
}

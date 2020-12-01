package node.app.calidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //features = "src/test/resources/features/node_app.feature",
        features = "src/test/resources/features/create_note.feature",
        tags = "@scenario1",
        glue = "node.app.calidad.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
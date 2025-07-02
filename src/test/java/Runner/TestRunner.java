package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/Tags.feature",
        glue ={"steps"},
        // tags={"@smoke","@regression"}
//        tags={"@smoke or @regression"}
//        tags={"@smoke and @regression"}
//        tags={"(@smoke or @regression) and @important"}
//        tags={"@regression and not @smoke "}
//        tags={"(@smoke or @regression) and not @important"}
       tags={"@mustRun"}
       )
public class TestRunner {

}


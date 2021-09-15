package automationcraft.delivery.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * Created by Karthik on 21/09/2019.
 */
@CucumberOptions(
        features = {"src/test/java/automationcraft/testcreation/usobase/features"},
        glue = {"automationcraft.testcreation.usobase.steps","automationcraft.engine.bdd"},
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread"},
        tags = "@smoke"
)
public class BusquedaGoogleRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider
    //@DataProvider (parallel = true) -- For parallel execution support (which is not going to work for our code)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

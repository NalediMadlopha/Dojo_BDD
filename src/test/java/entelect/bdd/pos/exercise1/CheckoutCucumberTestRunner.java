package entelect.bdd.pos.exercise1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:entelect/bdd/pos/exercise1/checkout.feature")
public class CheckoutCucumberTestRunner {
}

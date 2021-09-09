package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",glue = {"RegisterStep"},tags= "@register",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)




public class TestRunner {
    @BeforeClass
    public static void before(){
        System.out.println("Before -" + System.currentTimeMillis());}

    @AfterClass
    public static void after(){
        System.out.println("After - " + System.currentTimeMillis());
    }
}

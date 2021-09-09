package RegisterStep;

import Base.BaseStep;
import LoginFindBy.LoginPageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.UUID;

public class RegisterStep extends BaseStep{

   private LoginPageObjects loginPageObjects;
   public RegisterStep() {
    super("initialization");
    loginPageObjects = PageFactory.initElements(this.driver, LoginPageObjects.class);

   }
    String uuid = UUID.randomUUID().toString();

    @Given("a web browser is at the Hepsiburada home page")
    public void aWebBrowserIsAtTheHepsiburadaHomePage() {
        geturl();
    }

    @When("the user click dropdown")
    public void theUserClickDropdown() {
        findElementClick(loginPageObjects.SignIn);
    }

    @And("user clicks on the registration item")
    public void userClicksOnTheRegistrationItem() {
        findElementClick(loginPageObjects.register);
    }

    @Then("user sees the registration form")
    public void userSeesTheRegistrationForm() {
       findElement(loginPageObjects.name);
   }

    @And("user enters the name")
    public void userEntersTheName() {
       findElement(loginPageObjects.name).sendKeys("Kadir");
    }

    @And("user enters the surname")
    public void userEntersTheSurname() {
       findElement(loginPageObjects.surname).sendKeys("Atali");
    }

    @And("user enters the email")
    public void userEntersTheEmail() {
       findElement(loginPageObjects.email).sendKeys("x@testcase.com.tr");
    }

    @And("user enters password")
    public void userEntersPassword() {
        findElement(loginPageObjects.pass).sendKeys("1A*"+ uuid);
    }


    @And("user click the agreement checkbox")
    public void userClickTheAgreementCheckbox() {
        findElementClick(loginPageObjects.check);
    }

    @And("user click submit button")
    public void userClickSubmitButton() {
        findElementClick(loginPageObjects.submitButton);
    }

    @And("driver close")
    public void driverClose() {
       DriverQuit();
    }
}

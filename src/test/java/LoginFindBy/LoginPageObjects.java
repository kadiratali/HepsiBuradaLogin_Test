package LoginFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

    @FindBy(how = How.ID,using = "myAccount")
    public WebElement SignIn;

    @FindBy(how = How.ID,using = "register")
    public WebElement register;

    @FindBy(how = How.ID,using = "txtName")
    public WebElement name;

    @FindBy(how = How.ID,using = "txtSurname")
    public WebElement surname;

    @FindBy(how = How.ID,using = "txtEmail")
    public WebElement email;

    @FindBy(how = How.ID,using = "txtNewPassEmail")
    public WebElement pass;

    @FindBy(how = How.ID,using = "checkSubscribeEmail")
    public WebElement check;

    @FindBy(how = How.ID,using = "btnSignUpSubmit")
    public WebElement submitButton;

}

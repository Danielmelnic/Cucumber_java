package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddPersonPage {

    @FindBy(how = How.ID, using = "name")
    private WebElement addNameInput;
    @FindBy(how = How.ID, using = "job")
    private WebElement addJobInput;
    @FindBy(how = How.CSS, using = "[onclick='addPersonWithJobToList()']")
    private WebElement addPersonButton;
    @FindBy(how = How.CSS, using = "[onclick='window.history.back()']")
    private WebElement cancelPersonButton;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/button[1]")
    private WebElement clearFieldsButton;

    public void addPerson(String name, String job) {
        addNameInput.clear();
        addJobInput.clear();
        addNameInput.sendKeys(name);
        addJobInput.sendKeys(job);
    }
    public void  addPersonClick() { addPersonButton.click(); }

    public void clearFieldsButtonClick() { clearFieldsButton.click(); }

}

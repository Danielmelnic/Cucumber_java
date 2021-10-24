package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.*;

public class Task2Page {

    @FindBy(how = How.ID, using = "name")
    private WebElement nameInput;
    @FindBy(how = How.ID, using = "job")
    private WebElement jobInput;
    @FindBy(how = How.CSS, using = "[onclick='addPersonWithJobToList()']")
    private WebElement addButton;
    @FindBy(how = How.CSS, using = "[onclick='window.history.back()']")
    private WebElement cancelButton;


    public String getPageUrl() { return "https://kristinek.github.io/site/tasks/list_of_people_with_jobs.html"; }

    public void clickAddButton() {
        addButton.click();
    }

    public void enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterJob(String job) {
        nameInput.clear();
        nameInput.sendKeys(job);
    }

}



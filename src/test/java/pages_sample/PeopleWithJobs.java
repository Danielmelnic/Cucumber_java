package pages_sample;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PeopleWithJobs {

    @FindBy(how = How.CSS, using = "[onclick='openModalForAddPersonWithJob()']")
    private WebElement addPersonButton;
    @FindBy(how = How.CSS, using = "[onclick='resetListOfPeople()']")
    private WebElement resetPersonButton;
    @FindBy(how = How.CSS, using = "[onclick='openModalForEditPersonWithJob(0)']")
    private WebElement editPersonButton;
    @FindBy(how = How.CSS, using = "[onclick='deletePerson(1)']")
    private WebElement deletePersonButton;


    public String getPageUrl() { return "https://kristinek.github.io/site/tasks/list_of_people_with_jobs.html"; }

    public void addPersonClick() {
        addPersonButton.click();
    }

    public void editPersonClick() {
        editPersonButton.click();
    }

    public void deletePersonClick() {deletePersonButton.click();}

}

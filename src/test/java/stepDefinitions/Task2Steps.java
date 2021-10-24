package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;

public class Task2Steps {

    private WebDriver driver;
    static AgePage agePage;
    static AgeSubmittedPage ageSubmittedPage;
    static AddPersonPage addPersonPage;
    static EditPersonPage editPersonPage;
    static PeopleWithJobs peopleWithJobs;

    public Task2Steps() {
        this.driver = Hooks.driver;
        agePage = PageFactory.initElements(Hooks.driver, AgePage.class);
        ageSubmittedPage = PageFactory.initElements(Hooks.driver, AgeSubmittedPage.class);
        addPersonPage = PageFactory.initElements(Hooks.driver, AddPersonPage.class);
        editPersonPage = PageFactory.initElements(Hooks.driver, EditPersonPage.class);
        peopleWithJobs = PageFactory.initElements(Hooks.driver, PeopleWithJobs.class);
    }


    @Given("^I am on People with Jobs page$")
    public void iAmOnPeopleWithJobsPage() { 
        driver.get(peopleWithJobs.getPageUrl());
    }

    @When("^I click add person$")
    public void iClickAddPerson() {
        peopleWithJobs.addPersonClick();
    }

    @And("^I adding person with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iAddingPersonWithAnd(String name, String job) throws Throwable {
        addPersonPage.addPerson(name, job);
    }

    @And("^I click add button$")
    public void iClickAddButton() {
        addPersonPage.addPersonClick();
    }


    @And("^I click on edit button behind person$")
    public void iClickOnEditButtonBehindPerson() { peopleWithJobs.editPersonClick();
    }


    @And("^I enter new \"([^\"]*)\" and \"([^\"]*)\" for person$")
    public void iEnterNewAndForPerson(String name, String job) throws Throwable {
        editPersonPage.addPerson(name, job);
    }

    @Then("^I click on edit person button$")
    public void iClickOnEditPersonButton() {
        editPersonPage.editPersonButtonClick();
    }

    @Then("^I want to remove a person$")
    public void iWantToRemoveAPersonWithNameJillAndSupportJob() {
        peopleWithJobs.deletePersonClick();
    }

    @And("^I click on Clear all fields button$")
    public void iClickOnClearAllFieldsButton() {
        addPersonPage.clearFieldsButtonClick();
    }
}

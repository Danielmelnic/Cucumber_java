package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class Task1Steps {
    private WebDriver driver;

    public Task1Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on the task1 page$")
    public void iAmOnTheHomePage() throws Throwable {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
    }


    @When("^I enter number \"([^\"]*)\" in the field$")
    public void iEnterNumberInTheField(String qwerty) {
        driver.findElement(By.id("numb")).clear();
        driver.findElement(By.id("numb")).sendKeys(qwerty);

    }

    @And("^I click submit big button$")
    public void iClickSubmitBigButton() {
        driver.findElement(By.className("w3-orange")).click();

    }

    @Then("^I see error message \"([^\"]*)\"$")
    public void  iSeeErrorMsg(String msg) throws Throwable {
        assertEquals(msg, driver.findElement(By.id("ch1_error")).getText());
    }

    @Then("^I see alert message containing \"([^\"]*)\"$")
    public void iSeeAlertMsgContaining(String message) throws Throwable {
        Alert alert = driver.switchTo().alert();
        assertEquals(message, alert.getText());
        alert.accept();
    }
}

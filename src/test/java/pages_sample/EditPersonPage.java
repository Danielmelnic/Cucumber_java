package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditPersonPage extends AddPersonPage {

    @FindBy(how = How.CSS, using = "[onclick='editPersonWithJob(0)']")
    private WebElement editButton;

public void editPersonButtonClick() { editButton.click();}


}

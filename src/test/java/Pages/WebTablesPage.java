package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesPage extends BaseTest {


    public WebTablesPage() {
        PageFactory.initElements(driver, this);
    }

   @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    @FindBy(id = "firstName")
    public WebElement firstNameField;
    @FindBy(id = "lastName")
    public WebElement lastNameField;
    @FindBy(id = "userEmail")
    public WebElement emailField;
    @FindBy(id = "age")
    public WebElement ageField;
    @FindBy(id = "salary")
    public WebElement salaryField;
    @FindBy(id = "department")
    public WebElement departmentField;
    @FindBy(id = "submit")
    public WebElement submitButton;


    public void clickAddButton() {
        addButton.click();
    }

    public void inputFirstName(String firstName) {
       firstNameField.clear();
       firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void inputAge(String age) {
        ageField.clear();
        ageField.sendKeys(age);
    }

    public void inputSalary(String salary) {
        salaryField.clear();
        salaryField.sendKeys(salary);
    }

    public void inputDepartment(String department) {
        departmentField.clear();
        departmentField.sendKeys(department);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    }


package Test;

import Base.BaseTest;
import Pages.WebTablesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddExcelDataTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        webTablesPage = new WebTablesPage();
    }


    @Test(priority = 10)
    public void inputDataPerson1() {
        webTablesPage.clickAddButton();

        String firstName = excelReader.getStringData("Sheet1", 1, 0);
        String lastName = excelReader.getStringData("Sheet1", 1, 1);
        String email = excelReader.getStringData("Sheet1", 1, 3);
        String age = String.valueOf(excelReader.getIntegerData("Sheet1", 1, 2));
        String salary = String.valueOf(excelReader.getIntegerData("Sheet1", 1, 4));
        String department = excelReader.getStringData("Sheet1", 1, 5);
        webTablesPage.inputFirstName(firstName);
        webTablesPage.inputLastName(lastName);
        webTablesPage.inputEmail(email);
        webTablesPage.inputAge(age);
        webTablesPage.inputSalary(salary);
        webTablesPage.inputDepartment(department);
        webTablesPage.clickOnSubmitButton();
    }
    @Test(priority = 20)
    public void inputDataPerson2() {
        webTablesPage.clickAddButton();

        String firstName = excelReader.getStringData("Sheet1", 2, 0);
        String lastName = excelReader.getStringData("Sheet1", 2, 1);
        String email = excelReader.getStringData("Sheet1", 2, 3);
        String age = String.valueOf(excelReader.getIntegerData("Sheet1", 2, 2));
        String salary = String.valueOf(excelReader.getIntegerData("Sheet1", 2, 4));
        String department = excelReader.getStringData("Sheet1", 2, 5);
        webTablesPage.inputFirstName(firstName);
        webTablesPage.inputLastName(lastName);
        webTablesPage.inputEmail(email);
        webTablesPage.inputAge(age);
        webTablesPage.inputSalary(salary);
        webTablesPage.inputDepartment(department);
        webTablesPage.clickOnSubmitButton();
    }

    @Test(priority = 30)
    public void inputDataPerson3() {
        webTablesPage.clickAddButton();

        String firstName = excelReader.getStringData("Sheet1", 3, 0);
        String lastName = excelReader.getStringData("Sheet1", 3, 1);
        String email = excelReader.getStringData("Sheet1", 3, 3);
        String age = String.valueOf(excelReader.getIntegerData("Sheet1", 3, 2));
        String salary = String.valueOf(excelReader.getIntegerData("Sheet1", 3, 4));
        String department = excelReader.getStringData("Sheet1", 3, 5);
        webTablesPage.inputFirstName(firstName);
        webTablesPage.inputLastName(lastName);
        webTablesPage.inputEmail(email);
        webTablesPage.inputAge(age);
        webTablesPage.inputSalary(salary);
        webTablesPage.inputDepartment(department);
        webTablesPage.clickOnSubmitButton();
    }

    @Test(priority = 40)
    public void inputDataPerson4() {
        webTablesPage.clickAddButton();

        String firstName = excelReader.getStringData("Sheet1", 4, 0);
        String lastName = excelReader.getStringData("Sheet1", 4, 1);
        String email = excelReader.getStringData("Sheet1", 4, 3);
        String age = String.valueOf(excelReader.getIntegerData("Sheet1", 4, 2));
        String salary = String.valueOf(excelReader.getIntegerData("Sheet1", 4, 4));
        String department = excelReader.getStringData("Sheet1", 4, 5);
        webTablesPage.inputFirstName(firstName);
        webTablesPage.inputLastName(lastName);
        webTablesPage.inputEmail(email);
        webTablesPage.inputAge(age);
        webTablesPage.inputSalary(salary);
        webTablesPage.inputDepartment(department);
        webTablesPage.clickOnSubmitButton();
    }
}


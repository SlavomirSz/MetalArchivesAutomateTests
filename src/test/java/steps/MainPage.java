package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

public class MainPage {

    private WebDriver driver;

    @When("Browser is open")
    public void browserIsOpen() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @And("User go to main page address")
    public void userGoToHttpsWwwMetalArchivesCom() {
        driver.get("https://www.metal-archives.com/");
    }

    @Then("Main page is opened")
    public void mainPageIsOpened() {
        AssertJUnit.assertTrue(driver.findElement(By.id("MA_logo")).isDisplayed());
    }
}

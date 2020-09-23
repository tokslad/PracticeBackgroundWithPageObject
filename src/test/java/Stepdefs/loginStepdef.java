package Stepdefs;

import PageObject.LoginPageObject;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class loginStepdef {
    public LoginPageObject login;
    WebDriver driver;
    @Given("^I navigate to angularjs site$")
    public void iNavigateToAngularjsSite() {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
        login = new LoginPageObject(driver);
        driver.get("https://angularjs.realworld.io/#/login");
    }


    @When("^I click on Sign in1$")
    public void iClickOnSignIn1() {
        login.IClickOnSignIn();
    }

    @And("^I enter email text \"([^\"]*)\"$")
    public void iEnterEmailText(String Email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.IEnterEmail(Email);
    }

    @And("^I enter password text \"([^\"]*)\"$")
    public void iEnterPasswordText(String Password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.IEnterPassword(Password);
    }

    @And("^I click on sign in$")
    public void iClickOnSignIn() {
        login.IClickOnSignIn2();
    }

    @When("^I enter click on New Article$")
    public void iEnterClickOnNewArticle() throws InterruptedException {
        Thread.sleep(5000);
            login.IClickOnNewArticle();
    }

    @And("^I write my Article Title \"([^\"]*)\"$")
    public void iWriteMyArticleTitle(String ArticleTitle) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.IEnterArticleTitle(ArticleTitle);
    }

    @And("^I write what my article is all about \"([^\"]*)\"$")
    public void iWriteWhatMyArticleIsAllAbout(String AboutArticle) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.IEnterAboutArticle(AboutArticle);
    }

    @And("^I write my Article \"([^\"]*)\"$")
    public void iWriteMyArticle(String WriteArticle) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        login.IEnterWriteArticle(WriteArticle);
    }

    @And("^I enter tags \"([^\"]*)\"$")
    public void iEnterTags(String Tags) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        login.IEnterTags(Tags);
    }

    @And("^I click on Publish Article$")
    public void iClickOnPublishArticle() {
        login.IClickOnPublishArticle();
    }

    @Then("^my article should be created successfully$")
    public void myArticleShouldBeCreatedSuccessfully() throws InterruptedException {
        Assert.assertEquals(login.IsDemoTestingDisplayed(),true);
    }

    @When("^I click on Global Feed$")
    public void iClickOnGlobalFeed() throws InterruptedException {
        login.IClickOnGlobalFeed();
    }

    @Then("^I should be able see my posted article$")
    public void iShouldBeAbleSeeMyPostedArticle() throws InterruptedException {
        Assert.assertEquals(login.IsDemoTestingDisplayed1(),true);
    }
}

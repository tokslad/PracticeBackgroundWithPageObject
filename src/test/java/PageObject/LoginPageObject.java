package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPageObject {
    public LoginPageObject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = ("//a[@class='nav-link active']"))
    private WebElement signin;

    public void IClickOnSignIn()
    {
        signin.click();
    }

    @FindBy(how = How.XPATH,using = ("//*[@placeholder='Email']"))
    private WebElement email;

    public void IEnterEmail(String Email)
    {
        email.sendKeys(Email);
    }

    @FindBy(how = How.XPATH,using = ("//input[@placeholder='Password']"))
    private WebElement password;

    public void IEnterPassword(String Password)
    {
        password.sendKeys(Password);
    }

    @FindBy(how = How.XPATH,using = ("//button[@type='submit']"))
    private WebElement signin2;

    public void IClickOnSignIn2()
    {
        signin2.click();
    }

    @FindBy(how =How.XPATH,using = ("//ul[2]//li[2]//a[1]"))
    private WebElement newArticle;

    public void IClickOnNewArticle() {

        newArticle.click();
    }

    @FindBy(how = How.XPATH,using = ("//input[@placeholder='Article Title']"))
    private WebElement articleTitle;

    public void IEnterArticleTitle(String ArticleTitle)
    {
        articleTitle.sendKeys(ArticleTitle);
    }

    @FindBy(how = How.XPATH,using = ("//input[@ng-model='$ctrl.article.description']"))
    private WebElement aboutArticle;

    public void IEnterAboutArticle(String AboutArticle)
    {
        aboutArticle.sendKeys(AboutArticle);
    }

    @FindBy(how = How.XPATH,using = ("//*[@placeholder=\"Write your article (in markdown)\"]"))
    private WebElement writeArticle;

    public void IEnterWriteArticle(String WriteArticle)
    {
        writeArticle.sendKeys(WriteArticle);
    }

    @FindBy(how = How.XPATH,using = ("//input[@ng-model='$ctrl.tagField']"))
    private WebElement tags;

    public void IEnterTags(String Tags)
    {
        tags.sendKeys(Tags);
    }

    @FindBy(how = How.XPATH,using = ("//button[@type='button']"))
    private WebElement publishArticle;

    public void IClickOnPublishArticle()
    {
        publishArticle.click();
    }

    @FindBy(how = How.XPATH,using = ("//a[contains(text(),'Global Feed')]"))
    private WebElement globalFeed;

    public void IClickOnGlobalFeed() throws InterruptedException {
        Thread.sleep(5000);
        globalFeed.click();
    }

    @FindBy(how = How.XPATH,using = ("//h1[contains(text(),'DemoTesting')]"))
    private WebElement isDemoTestingDisplayed;

    public boolean IsDemoTestingDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        return isDemoTestingDisplayed.isDisplayed();
    }

    @FindBy(how = How.XPATH,using = ("//h1[contains(text(),'DemoTesting')]"))
    private WebElement demoTesting;

    public boolean IsDemoTestingDisplayed1() throws InterruptedException {
        Thread.sleep(5000);
        return demoTesting.isDisplayed();
    }












}

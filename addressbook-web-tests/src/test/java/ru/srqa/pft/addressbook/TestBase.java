package ru.srqa.pft.addressbook;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver wd;

    @Before
    public void setUp() throws Exception {
      System.setProperty("webdriver.gecko.driver","C:/morozova/geckodriver.exe");
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.get("http://localhost:8081/addressbook/");
      login("admin", "secret");
    }

    private void login(String username, String password) {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    protected void returnToGroupPage() {
      wd.findElement(By.linkText("group page")).click();
    }

    protected void submitGroupCreation() {
      wd.findElement(By.name("submit")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
      wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
      wd.findElement(By.name("new")).click();
    }

    protected void gotoGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }

    protected void gotoHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }

    protected void saveNewUser() {
      wd.findElement(By.cssSelector("input:nth-child(87)")).click();
    }

    protected void fillUserForm(UserData userData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).sendKeys(userData.getFirstName());
      wd.findElement(By.name("middlename")).click();
      wd.findElement(By.name("middlename")).sendKeys(userData.getMiddleName());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).sendKeys(userData.getLastName());
      wd.findElement(By.name("nickname")).click();
      wd.findElement(By.name("nickname")).sendKeys(userData.getNickName());
      wd.findElement(By.name("company")).click();
      wd.findElement(By.name("company")).sendKeys(userData.getCompany());
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).sendKeys(userData.getAddress());
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).sendKeys(userData.getMobileTelephoneNumber());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).sendKeys(userData.getEmail());
    }

    protected void initUserCreating() {
      wd.findElement(By.linkText("add new")).click();
    }

    @AfterMethod
    public void tearDown(){ wd.quit();}

    public static boolean isAlertPressent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        }catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected void closeWebPage() {
      wd.close();
    }

    protected void deleteSelectedGroups() {
      wd.findElement(By.name("delete")).click();
    }

    protected void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
    }
}

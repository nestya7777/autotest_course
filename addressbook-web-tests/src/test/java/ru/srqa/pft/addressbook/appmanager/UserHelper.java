package ru.srqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.srqa.pft.addressbook.model.UserData;

public class UserHelper extends HelperBase {

    public UserHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void saveNewUser() {
      click(By.cssSelector("input:nth-child(87)"));
    }

    public void fillUserForm(UserData userData) {
        type(By.name("firstname"), userData.getFirstName());
        type(By.name("middlename"), userData.getMiddleName());
        type(By.name("lastname"), userData.getLastName());
        type(By.name("nickname"), userData.getNickName());
        type(By.name("company"), userData.getCompany());
        type(By.name("address"),userData.getAddress());
        type(By.name("mobile"), userData.getMobileTelephoneNumber());
        type(By.name("email"), userData.getEmail());
    }

    public void initUserCreating() {
      click(By.linkText("add new"));
    }

    public void selectUser(String id){click(By.id(id));}

    public void deleteSelectedUserFromHomePage(){
        click(By.cssSelector(".left:nth-child(8) > input"));
        wd.switchTo().alert().accept();
    }

    public void deleteSelectedUserFromEditorPage(){
        click(By.cssSelector("input:nth-child(2)"));
    }

    public void initUserEditing(String cssSelectorUserEdit){
        click(By.cssSelector(cssSelectorUserEdit));
    }

    public void saveEditingUser(){
        click(By.cssSelector("input:nth-child(86)"));
    }
}

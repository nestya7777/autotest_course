package ru.srqa.pft.addressbook.tests;

import org.junit.Test;
import ru.srqa.pft.addressbook.model.UserData;

public class UserCreationTests extends TestBase{

    @Test
    public void testUserCreation(){
        UserData user = new UserData("Anastasyia", "Vyacheslavovna", "Morozova", "LOLnestya",
                "Haulmont", "Michurina 126", "+79171306630", "morozova-nastusha@yandex.ru");
        app.getUserHelper().initUserCreating();
        app.getUserHelper().fillUserForm(user);
        app.getUserHelper().saveNewUser();
        app.getNavigationHelper().gotoHomePage();
        app.getNavigationHelper().closeWebPage();
    }
}

package ru.srqa.pft.addressbook.tests;

import org.junit.Test;
import ru.srqa.pft.addressbook.model.UserData;

public class UserModificationTests extends TestBase {

    @Test
    public void testUserModification(){
        UserData user = new UserData("Anna", "Vladimirovna", "Morozova", "LOLnestya",
                "Haulmont", "Michurina 126", "+79171306630", "morozova-nastusha@yandex.ru");
        app.getNavigationHelper().gotoHome();
        app.getUserHelper().initUserEditing("tr:nth-child(4) > .center:nth-child(8) img"); // убедиться, что такой юзер существует
        app.getUserHelper().fillUserForm(user);
        app.getUserHelper().saveEditingUser();
        app.getNavigationHelper().gotoHomePage();
        app.getNavigationHelper().closeWebPage();
    }
}

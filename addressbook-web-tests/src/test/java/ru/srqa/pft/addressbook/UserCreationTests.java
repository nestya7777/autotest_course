package ru.srqa.pft.addressbook;

import org.junit.Test;

public class UserCreationTests extends TestBase{

    @Test
    public void testUserCreation(){
        UserData user = new UserData("Anastasyia", "Vyacheslavovna", "Morozova", "LOLnestya",
                "Haulmont", "Michurina 126", "+79171306630", "morozova-nastusha@yandex.ru");
        initUserCreating();
        fillUserForm(user);
        saveNewUser();
        gotoHomePage();
        closeWebPage();
    }
}

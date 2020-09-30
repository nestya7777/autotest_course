package ru.srqa.pft.addressbook.tests;


import org.junit.Test;

public class DeleteUserTests extends TestBase {

    @Test
    public void testUserDeletingFromHomePage(){
        app.getNavigationHelper().gotoHome();
        app.getUserHelper().selectUser("11"); //убедиться в существовании записи с таким id
        app.getUserHelper().deleteSelectedUserFromHomePage();
        app.getNavigationHelper().gotoHome();
        app.getNavigationHelper().closeWebPage();
    }

    @Test
    public void testUserDeletingFromEditorPage(){
        app.getNavigationHelper().gotoHome();
        app.getUserHelper().initUserEditing(".odd > .center:nth-child(8) img"); //убедиться что запись с таким css существует
        app.getUserHelper().deleteSelectedUserFromEditorPage();
        app.getNavigationHelper().gotoHome();
        app.getNavigationHelper().closeWebPage();

    }
}

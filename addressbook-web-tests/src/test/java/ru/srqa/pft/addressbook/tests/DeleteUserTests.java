package ru.srqa.pft.addressbook.tests;


import org.junit.Test;

public class DeleteUserTests extends TestBase {

    @Test
    public void testUserDeleting(){
        app.getNavigationHelper().gotoHome();
        app.getUserHelper().selectUser();
        app.getUserHelper().deleteSelectedUser();
        app.getNavigationHelper().gotoHome();
    }
}

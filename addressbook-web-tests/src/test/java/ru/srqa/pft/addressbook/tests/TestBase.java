package ru.srqa.pft.addressbook.tests;

import org.junit.Before;
import org.testng.annotations.AfterMethod;
import ru.srqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown(){
        app.stop();
    }

}

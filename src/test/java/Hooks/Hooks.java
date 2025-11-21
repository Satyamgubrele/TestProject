package Hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import Base.PlaywrightFactory;

public class Hooks {

    @Before
    public void setUp() {
        PlaywrightFactory.initBrowser();
    }

    @After
    public void tearDown() {
        PlaywrightFactory.closeBrowser();
    }
}

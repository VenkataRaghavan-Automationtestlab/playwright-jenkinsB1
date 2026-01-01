package tests;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseTest {
    Playwright playwright;
    Browser browser;
    BrowserContext context;
    protected Page page;

    @BeforeMethod
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(true));
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterMethod
    public void tearDown() {
        browser.close();
        playwright.close();
    }
}

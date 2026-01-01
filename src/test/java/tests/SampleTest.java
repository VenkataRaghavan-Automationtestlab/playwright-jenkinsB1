package tests;

import com.microsoft.playwright.*;
import com.aventstack.extentreports.*;
import org.testng.annotations.*;
import reports.ExtentManager;

public class SampleTest {
    ExtentReports extent;
    ExtentTest test;
    Playwright pw;
    Browser browser;
    Page page;

    @BeforeSuite
    public void setupReport() {
        extent = ExtentManager.createInstance();
    }

    @BeforeClass
    public void setup() {
        pw = Playwright.create();
        browser = pw.chromium().launch();
        page = browser.newPage();
    }

    @Test
    public void openGoogle() {
        test = extent.createTest("Open Google Test");
        page.navigate("https://google.com");
        test.pass("Google opened successfully");
    }

    @AfterSuite
    public void flushReport() {
        extent.flush();
    }
}

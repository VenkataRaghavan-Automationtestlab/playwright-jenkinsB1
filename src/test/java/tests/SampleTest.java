package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void verifyTitle() {
        page.navigate("https://example.com");
        String title = page.title();
        System.out.println("Page Title: " + title);
        Assert.assertTrue(title.contains("Example Domain"));
    }
}

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import java.io.File;

public class SeleniumTest {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver");//linux_64

        // Get file
        File file = new File("src/main/Objects.html");
        String path = "file://" + file.getAbsolutePath();

        
        EdgeOptions options = new EdgeOptions();
        options.addArguments("headless");
        webDriver = new EdgeDriver(options);


        // Open the HTML file
        webDriver.get(path);
    }

    @After
    public void tearDown() {
        // Close the browser
        webDriver.quit();
    }

    @Test
    public void testPageText() throws InterruptedException {
        WebElement content = webDriver.findElement(By.id("content"));
        Assert.assertEquals("username: user1\npassword: password123", content.getText());
    }


}

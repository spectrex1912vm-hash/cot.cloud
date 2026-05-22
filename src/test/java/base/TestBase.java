package base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static helpers.Attach.screenshot;

public class TestBase {

    @BeforeAll
    static void setup() {

        Configuration.baseUrl = "https://kot.cloud";
        Configuration.browser = "chrome";

        Configuration.browserSize = "1920x1080";

        Configuration.timeout = 10000;

        Configuration.pageLoadStrategy = "normal";

        Configuration.headless = Boolean.parseBoolean(
                System.getProperty("selenide.headless", "false")
        );

        Configuration.browserCapabilities = new ChromeOptions()
                .addArguments(
                        "--no-sandbox",
                        "--disable-dev-shm-usage",
                        "--window-size=1920,1080"
                );
    }

    @AfterEach
    void tearDown() {

        screenshot();

        closeWebDriver();
    }
}
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

        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";

        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "normal";

        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--no-sandbox",
                "--disable-dev-shm-usage",
                "--remote-allow-origins=*"
        );

        Configuration.browserCapabilities = options;
    }

    @AfterEach
    void tearDown() {
        screenshot();
        closeWebDriver();
    }
}
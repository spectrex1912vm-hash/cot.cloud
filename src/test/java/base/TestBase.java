package base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


import static com.codeborne.selenide.Selenide.closeWebDriver;
import static helpers.Attach.screenshot;

    public class TestBase {
        @BeforeAll
        static void setup() {
            Configuration.baseUrl = "https://kot.cloud";
            Configuration.browser = "chrome";
            Configuration.browserSize = "1920x1080";
            Configuration.pageLoadStrategy = "eager";

            Configuration.headless = Boolean.parseBoolean(
                    System.getProperty("selenide.headless", "false")
            );
        }

        @AfterEach
        void tearDown() {
            screenshot();
            closeWebDriver();
        }

    }

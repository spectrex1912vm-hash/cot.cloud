package helpers;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.nio.file.Files;

public class Attach {

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] screenshot() {
        File file = Selenide.screenshot(OutputType.FILE);
        return toBytes(file);
    }

    private static byte[] toBytes(File file) {
        try {
            return Files.readAllBytes(file.toPath());
        } catch (Exception e) {
            return new byte[0];
        }
    }
}

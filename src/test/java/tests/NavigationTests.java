package tests;

import base.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.MainSteps;


@Feature("Главная страница")
@Story("Навигационные секции")
public class NavigationTests extends TestBase {

    MainSteps steps = new MainSteps();

    @Test
    @DisplayName("Проверка наличия всех необходимых секций")
    void checkSectionsExist() {

        steps.openMainPage();

        steps.checkBenefits();
        steps.checkCapability();
        steps.checkClients();
        steps.checkMobile();
        steps.checkAbout();
        steps.checkUsers();
        steps.checkTable();
        steps.checkContact();
    }
}

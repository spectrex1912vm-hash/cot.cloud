package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.MainSteps;

import static com.codeborne.selenide.Selenide.open;

@Feature("Главная страница")
@Story("Smoke UI проверки")
public class MainPageTests {

    MainSteps steps = new MainSteps();

    @Test
    @DisplayName("Открывается главная страница и виден основной UI")
    void openMainPage() {


        steps.openMainPage();
        steps.checkHero();
        steps.checkNav();
    }

    @Test
    @DisplayName("CTA кнопка отображается")
    void cta() {


        steps.openMainPage();
        steps.checkCTA();
    }
}

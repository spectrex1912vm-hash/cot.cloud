package steps;

import io.qameta.allure.Step;
import pages.MainPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.visible;

public class MainSteps {

    MainPage page = new MainPage();

    @Step("Проверяем главную страницу")
    public void openMainPage() {
        open("https://kot.cloud");
    }

    @Step("Проверяем hero")
    public void checkHero() {
        page.heroTitle().shouldBe(visible);
    }

    @Step("Проверяем навигацию")
    public void checkNav() {
        page.nav().shouldBe(visible);
    }

    @Step("Проверяем CTA кнопку")
    public void checkCTA() {
        page.ctaButton().shouldBe(visible);
    }

    @Step("Проверяем секцию Benefits")
    public void checkBenefits() {
        page.benefits().shouldBe(visible);
    }

    @Step("Проверяем секцию Capability")
    public void checkCapability() {
        page.capability().shouldBe(visible);
    }

    @Step("Проверяем секцию Clients")
    public void checkClients() {
        page.client().shouldBe(visible);
    }

    @Step("Проверяем мобильную секцию")
    public void checkMobile() {
        page.mobile().shouldBe(visible);
    }

    @Step("Проверяем секцию About")
    public void checkAbout() {
        page.about().shouldBe(visible);
    }

    @Step("Проверяем секцию Users")
    public void checkUsers() {
        page.users().shouldBe(visible);
    }

    @Step("Проверяем таблицу тарифов")
    public void checkTable() {
        page.table().shouldBe(visible);
    }

    @Step("Проверяем контакты")
    public void checkContact() {
        page.contact().shouldBe(visible);
    }
}

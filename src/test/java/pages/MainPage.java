package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MainPage {

    public SelenideElement heroTitle() {
        return $("h1");
    }

    public SelenideElement nav() {
        return $("nav");
    }

    public SelenideElement ctaButton() {
        return $$("a[href='calldemo.html']")
                .filter(visible)
                .first();
    }

    public SelenideElement benefits() {
        return $("a[href='#benefits']");
    }

    public SelenideElement capability() {
        return $("a[href='#capability']");
    }

    public SelenideElement client() {
         return $("a[href='#client']");
    }

    public SelenideElement mobile() {
        return $("a[href='#mobile']");
    }

    public SelenideElement about() {
        return $("a[href='#about']");
    }

    public SelenideElement users() {
        return $("a[href='#users']");
    }

    public SelenideElement table() {
        return $("a[href='#table']");
    }

    public SelenideElement contact() {
        return $("a[href='#contact']");
    }



}

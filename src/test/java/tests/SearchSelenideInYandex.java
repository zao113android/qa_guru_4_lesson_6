package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchSelenideInYandex {

    private String url = "https://yandex.ru";

    @Test
    public void searchSelenideInYandex(){

        // open url
        open(url);

        // search Selenide
        $(By.id("text")).val("Selenide").pressEnter();

        // check if Selenide is found
        $(withText("selenide.org")).shouldBe(Condition.exist);
    }
}

package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideInGoogle {

    private String url = "https://www.google.com/";

    @Test
    public void searchSelenideInGoogle(){

        // open url
        open(url);

        // search Selenide
        $(byName("q")).val("Selenide").pressEnter();

        // check if Selenide is found
        $(withText("selenide.org")).shouldBe(Condition.exist);
    }
}

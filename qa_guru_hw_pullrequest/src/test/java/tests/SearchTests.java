package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void googleSearchTest() {
        open("https://google.com");

        $(byName("q")).setValue("Selenide").pressEnter();

        $("#search a").shouldHave(attribute("href", "https://ru.selenide.org/"));
    }
    
    @Test
    void yandexSearchTest() {
        open("https://yandex.ru");

        $(".input__control").setValue("Selenide").pressEnter();

        $("html").shouldHave(text("Selenide"));
    }
}

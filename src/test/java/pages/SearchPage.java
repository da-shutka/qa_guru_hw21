package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {

    @Step("Открыть страницу поиска")
    public SearchPage openPage() {
        back();
        return this;
    }

    @Step("В поисковой строке набрать {text}")
    public SearchPage searchByText(String text) {
        $(id("org.wikipedia.alpha:id/search_container")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(text);
        return this;
    }

    @Step("Проверить, что статьи найдены")
    public void checkArticlesAreFound() {
        $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));
    }

    @Step("Перейти на первую страницу в списке статей")
    public void clickToFirstArticle() {
        $(id("org.wikipedia.alpha:id/page_list_item_title")).click();
    }

    @Step("Проверить, что на поисковой странице есть поисковая строка")
    public void checkSearchInputExistence() {
        $(id("org.wikipedia.alpha:id/search_container")).should(exist);
    }
}

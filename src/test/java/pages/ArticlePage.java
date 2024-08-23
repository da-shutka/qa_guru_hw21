package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.id;

public class ArticlePage {

    @Step("Проверить подзаголовок на странице статьи")
    public void checkPageSubtitle(String subtitle) {
        $x("//android.webkit.WebView[@resource-id='org.wikipedia.alpha:id/page_web_view']").click();
        $x("//*[@resource-id='pcs-edit-section-title-description']")
                .shouldHave(text(subtitle));
    }

    @Step("Проверить, что на странице ошибка")
    public void checkErrorOnPage(String errorText) {
        $(id("org.wikipedia.alpha:id/view_wiki_error_text"))
                .shouldHave(text(errorText));
    }
}

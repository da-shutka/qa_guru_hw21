package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ArticlePage {

    @Step("Проверить подзаголовок на странице статьи")
    public void checkPageSubtitle(String subtitle) {
        $x("//*[@resource-id='pcs-edit-section-title-description']")
                .shouldHave(text(subtitle));
    }
}

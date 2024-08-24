package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingFirstPage {

    @Step("Проверить заголовок первой приветственной страницы")
    public OnboardingFirstPage checkTitlePage() {
        $(id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text("The Free Encyclopedia\n…in over 300 languages"));
        return this;
    }

    @Step("Нажать Continue на первой приветственной странице")
    public void clickContinue() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }
}

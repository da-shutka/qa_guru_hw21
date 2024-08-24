package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingSecondPage {

    @Step("Проверить заголовок второй приветственной страницы")
    public OnboardingSecondPage checkTitlePage() {
        $(id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text("New ways to explore"));
        return this;
    }

    @Step("Нажать Continue на второй приветственной странице")
    public void clickContinue() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }
}

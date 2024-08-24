package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingFourthPage {

    @Step("Проверить заголовок четвертой приветственной страницы")
    public OnboardingFourthPage checkTitlePage() {
        $(id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text("Data & Privacy"));
        return this;
    }

    @Step("Нажать Get started на четвертой приветственной странице")
    public void clickGetStarted() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
    }
}

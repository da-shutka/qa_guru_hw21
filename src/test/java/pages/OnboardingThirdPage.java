package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingThirdPage {

    @Step("Проверить заголовок третьей приветственной страницы")
    public OnboardingThirdPage checkTitlePage() {
        $(id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text("Reading lists with sync"));
        return this;
    }

    @Step("Нажать Continue на третьей приветственной странице")
    public void clickContinue() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }
}

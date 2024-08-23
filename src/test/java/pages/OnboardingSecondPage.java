package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingSecondPage {

    private final String ruText = "Новые способы исследований";
    private final String enText = "New ways to explore";

    @Step("Проверить заголовок второй приветственной страницы")
    public OnboardingSecondPage checkTitlePage() {
        if (System.getProperty("deviceHost").equals("real")) {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(ruText));
        } else {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(enText));
        }
        return this;
    }

    @Step("Нажать Continue/Продолжить на второй приветственной странице")
    public void clickContinue() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }
}

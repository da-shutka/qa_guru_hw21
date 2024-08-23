package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingFourthPage {

    private final String ruText = "Данные и конфиденциальность";
    private final String enText = "Data & Privacy";

    @Step("Проверить заголовок четвертой приветственной страницы")
    public OnboardingFourthPage checkTitlePage() {
        if (System.getProperty("deviceHost").equals("real")) {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(ruText));
        } else {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(enText));
        }
        return this;
    }

    @Step("Нажать Get started/Начать на четвертой приветственной странице")
    public void clickGetStarted() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
    }
}

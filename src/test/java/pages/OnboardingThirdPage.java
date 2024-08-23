package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingThirdPage {

    private final String ruText = "Списки для чтения с синхронизацией";
    private final String enText = "Reading lists with sync";

    @Step("Проверить заголовок третьей приветственной страницы")
    public OnboardingThirdPage checkTitlePage() {
        if (System.getProperty("deviceHost").equals("real")) {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(ruText));
        } else {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text(enText));
        }
        return this;
    }

    @Step("Нажать Continue/Продолжить на третьей приветственной странице")
    public void clickContinue() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }
}

package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.id;

public class OnboardingFirstPage {

    private final String ruText = "Свободная энциклопедия\n…более, чем на 300 языках";
    private final String enText = "The Free Encyclopedia\n…in over 300 languages";

    @Step("Проверить заголовок первой приветственной страницы")
    public OnboardingFirstPage checkTitlePage() {
        if (System.getProperty("deviceHost").equals("real")) {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text(ruText));
        } else {
            $(id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(Condition.text(enText));
        }
        return this;
    }

    @Step("Нажать Continue/Продолжить на первой приветственной странице")
    public void clickContinue() {
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }
}

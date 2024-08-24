package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@DisplayName("Мобильные тесты на приветственную страницу в Википедии")
public class OnboardingScreenTests extends TestBase {

    OnboardingFirstPage firstPage = new OnboardingFirstPage();
    OnboardingSecondPage secondPage = new OnboardingSecondPage();
    OnboardingThirdPage thirdPage = new OnboardingThirdPage();
    OnboardingFourthPage fourthPage = new OnboardingFourthPage();
    SearchPage searchPage = new SearchPage();


    @Test
    @Tag("onboard")
    @DisplayName("Проверка работы приветственной страницы")
    void successfulOnboardingScreenTest() {
        firstPage
                .checkTitlePage()
                .clickContinue();
        secondPage
                .checkTitlePage()
                .clickContinue();
        thirdPage
                .checkTitlePage()
                .clickContinue();
        fourthPage
                .checkTitlePage()
                .clickGetStarted();
        searchPage
                .checkSearchInputExistence();
    }
}

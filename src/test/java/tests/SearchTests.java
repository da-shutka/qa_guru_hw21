package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ArticlePage;
import pages.SearchPage;

@DisplayName("Мобильные тесты на поиск в Википедии")
public class SearchTests extends TestBase {

    SearchPage searchPage = new SearchPage();
    ArticlePage articlePage = new ArticlePage();

    @Test
    @DisplayName("Проверка работы поисковой строки")
    void successfulSearchTest() {
        searchPage
                .openPage()
                .searchByText("Appium")
                .checkArticlesAreFound();
    }

    @Test
    @DisplayName("Проверка открытия статьи из списка")
    void unsuccessfulOpenArticleTest() {
        searchPage
                .openPage()
                .searchByText("Appium")
                .clickToFirstArticle();
        if (!System.getProperty("deviceHost").equals("browserstack")) {
            articlePage.checkPageSubtitle("Automation for Apps");
        } else {
            articlePage.checkErrorOnPage("error");
        }
    }
}

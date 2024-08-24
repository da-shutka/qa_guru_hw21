package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ArticlePage;
import pages.SearchPage;

@DisplayName("Мобильные тесты на поиск в Википедии")
public class SearchTests extends TestBase {

    SearchPage searchPage = new SearchPage();
    ArticlePage articlePage = new ArticlePage();

    @Test
    @Tag("search")
    @DisplayName("Проверка работы поисковой строки")
    void successfulSearchTest() {
        searchPage
                .openPage()
                .searchByText("Appium")
                .checkArticlesAreFound();
    }

    @Test
    @Tag("search")
    @DisplayName("Проверка открытия статьи из списка")
    void checkOpenArticleTest() {
        searchPage
                .openPage()
                .searchByText("Appium")
                .clickToFirstArticle();
        articlePage.checkPageSubtitle("Automation for Apps");
    }
}

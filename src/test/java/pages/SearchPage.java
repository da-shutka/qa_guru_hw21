package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {

    @Step("Открыть страницу поиска")
    public SearchPage openPage(){
        if (!System.getProperty("deviceHost").equals("browserstack")) {
            back();
        }
        return this;
    };

    @Step("В поисковой строке набрать {text}")
    public SearchPage searchByText(String text) {
        $(id("org.wikipedia.alpha:id/search_container")).click();
        if ($$x("//android.widget.TextView[@resource-id='org.wikipedia.alpha:id/langCodeText']").size() > 1){
            $x("//android.widget.TextView[@resource-id='org.wikipedia.alpha:id/langCodeText' and @text='EN']").click();
        }
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(text);
        return this;
    }

    @Step("Проверить, что статьи найдены")
    public void checkArticlesAreFound() {
        $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));
    }

    @Step("Перейти на первую страницу в списке статей")
    public void clickToFirstArticle(){
        $(id("org.wikipedia.alpha:id/page_list_item_title")).click();
    }
}

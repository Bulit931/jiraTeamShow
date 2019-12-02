package page;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import widget.Button;
import widget.Edit;

public class MainPage {

    Edit searchField = new Edit(By.id("text"));
    Button searchBtn = new Button(By.xpath("//*[@class=\"search2__button\"]"));

    @Step("Ввести текст в строку поиска")
    public MainPage inputTextInSearchField(String text){
        searchField.sendText(text);
        return this;
    }

    @Step("Кликнуть на кнопку для поиска")
    public ResultPage clickBtnSearch(){
        searchBtn.click();
        return Selenide.page(ResultPage.class);
    }


}

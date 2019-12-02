package widget;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Edit {

    private SelenideElement edit;

    public Edit(By locator) {
        this.edit = Selenide.$(locator);
    }

    public void clickEdit(){
        edit.click();
    }

    public void sendText(String text){
        edit.setValue(text);
    }

}

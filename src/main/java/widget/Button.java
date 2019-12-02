package widget;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Button {

    private SelenideElement button;

    public Button(By locator) {
        this.button = Selenide.$(locator);
    }

    public void click(){
        button.click();
    }

}

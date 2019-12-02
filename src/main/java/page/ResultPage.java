package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import widget.UL;

public class ResultPage {

    private UL ul = new UL(By.xpath("//*[@class=\"content__left\"]/ul/li"));


    @Step("Размер списка")
    public int getSize(){
        return ul.getSize();
    }


}

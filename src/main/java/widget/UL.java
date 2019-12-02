package widget;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class UL {

    private ElementsCollection ul;

    public UL(By locator) {
        this.ul = Selenide.$$(locator);
    }

    public int getSize(){
        return ul.size();
    }

}
